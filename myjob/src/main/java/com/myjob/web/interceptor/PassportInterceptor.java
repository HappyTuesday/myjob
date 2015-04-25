package com.myjob.web.interceptor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.myjob.entity.Account;
import com.myjob.entity.values.AccountType;
import com.myjob.service.AccountService;
import com.myjob.service.exception.ServiceException;
import com.myjob.web.auth.Allow;
import com.myjob.web.auth.Ticket;
import com.myjob.web.util.KeyProvider;
import com.myjob.web.util.TicketOperator;

public class PassportInterceptor extends HandlerInterceptorAdapter{
	@Resource
	private TicketOperator ticketOperator;
	
	@Resource
	private KeyProvider keyprovider;
	
	@Resource
	private AccountService loginService;
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		if(!handler.getClass().isAssignableFrom(HandlerMethod.class))
			return true;
		
		request.getSession().setAttribute(keyprovider.tilesMenuTypeKey(), AccountType.user);
		
		List<Allow> authPassports = new ArrayList<Allow>();
		authPassports.add(((HandlerMethod)handler).getMethodAnnotation(Allow.class));
		authPassports.add(((HandlerMethod)handler).getBean().getClass().getAnnotation(Allow.class));
		
		authPassports.removeIf(new Predicate<Allow>() {
			@Override
			public boolean test(Allow authPassport) {
				return authPassport == null || authPassport.value() == null;
			}
		});
		
		System.out.println("--intercept: " + handler);
		
		if(authPassports.size() == 0){
			return true;
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
			response.sendRedirect("/login");
			return false;
		}
		
		for(Allow authPassport:authPassports){
			if(!Arrays.asList(authPassport.value()).contains(loginAccount.getAccountType())){
				response.sendRedirect("/error/denied");
				return false;
			}
		}
		
		request.getSession().setAttribute(keyprovider.loginAccountKey(), loginAccount);
		request.getSession().setAttribute(keyprovider.tilesMenuTypeKey(), loginAccount.getAccountType());
		return true;
	}
}
