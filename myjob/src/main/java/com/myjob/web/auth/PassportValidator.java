package com.myjob.web.auth;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.myjob.entity.Account;
import com.myjob.entity.values.AccountType;
import com.myjob.service.AccountService;
import com.myjob.service.exception.ServiceException;
import com.myjob.web.util.KeyProvider;
import com.myjob.web.util.TicketOperator;

@Component
public class PassportValidator{
	@Resource
	private TicketOperator ticketOperator;
	
	@Resource
	private KeyProvider keyprovider;
	
	@Resource
	private AccountService loginService;

	public void validate(Class<?> controllerType,Method handler) {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		
		request.getSession().setAttribute(keyprovider.tilesMenuTypeKey(), AccountType.user);
		
		List<Allow> authPassports = new ArrayList<Allow>();
		authPassports.add(handler.getAnnotation(Allow.class));
		authPassports.add(controllerType.getAnnotation(Allow.class));
		
		authPassports.removeIf(new Predicate<Allow>() {
			@Override
			public boolean test(Allow authPassport) {
				return authPassport == null || authPassport.value() == null;
			}
		});
		
		//System.out.println("--intercept: " + handler);
		
		if(authPassports.size() == 0){
			return;
		}

		Ticket ticket = ticketOperator.getTicket(request);
		Account loginAccount;
		if(ticket != null){
			try{
				loginAccount = loginService.login(ticket.getLoginName(), ticket.getPassword());
			}catch(ServiceException e){
				loginAccount = null;
			}
		}else{
			loginAccount = null;
		}
		
		if(loginAccount == null){
			throw new AuthException();
		}
		
		for(Allow authPassport:authPassports){
			if(!Arrays.asList(authPassport.value()).contains(loginAccount.getAccountType())){
				throw new AuthException();
			}
		}
		
		request.getSession().setAttribute(keyprovider.loginAccountKey(), loginAccount);
		request.getSession().setAttribute(keyprovider.tilesMenuTypeKey(), loginAccount.getAccountType());
	}
}
