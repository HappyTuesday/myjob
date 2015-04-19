package com.myjob.auth;

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
import com.myjob.service.AccountService;
import com.myjob.service.exception.ServiceException;
import com.myjob.web.util.KeyProvider;
import com.myjob.web.util.TicketOperator;

public class AuthInterceptor extends HandlerInterceptorAdapter{
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
		
		List<AuthPassport> authPassports = new ArrayList<AuthPassport>();
		authPassports.add(((HandlerMethod)handler).getMethodAnnotation(AuthPassport.class));
		authPassports.add(((HandlerMethod)handler).getBean().getClass().getAnnotation(AuthPassport.class));
		
		authPassports.removeIf(new Predicate<AuthPassport>() {
			@Override
			public boolean test(AuthPassport authPassport) {
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
		
		for(AuthPassport authPassport:authPassports){
			if(!Arrays.asList(authPassport.value()).contains(loginAccount.getAccountType())){
				response.sendRedirect("/error/denied");
				return false;
			}
		}
		
		request.getSession().setAttribute(keyprovider.loginAccountKey(), loginAccount);;
		return true;
	}
}
