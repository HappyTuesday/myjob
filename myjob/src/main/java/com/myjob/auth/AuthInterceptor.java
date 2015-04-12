package com.myjob.auth;

import java.util.Arrays;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.myjob.entity.values.AccountType;
import com.myjob.service.LoginService;
import com.myjob.service.exception.ServiceException;
import com.myjob.web.util.KeyProvider;
import com.myjob.web.util.TicketOperator;

public class AuthInterceptor extends HandlerInterceptorAdapter{
	@Resource
	private TicketOperator ticketOperator;
	
	@Resource
	private KeyProvider keyprovider;
	
	@Resource
	private LoginService loginService;
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		if(!handler.getClass().isAssignableFrom(HandlerMethod.class))
			return true;
		AuthPassport authPassport = ((HandlerMethod)handler).getMethodAnnotation(AuthPassport.class);
		if(authPassport == null || authPassport.value() == null){
			return true;
		}

		Ticket ticket = ticketOperator.getTicket(request);
		AccountType accountType;
		if(ticket != null){
			try{
				accountType = loginService.login(ticket.getLoginName(), ticket.getPassword());
			}catch(ServiceException e){
				accountType = null;
			}
		}else{
			accountType = null;
		}
		
		if(accountType == null){
			response.sendRedirect("/login");
			return false;
		}else if(!Arrays.asList(authPassport.value()).contains(accountType)){
			response.sendRedirect("/error/denied");
			return false;
		}
		
		request.getSession().setAttribute(keyprovider.accountTypeKey(), accountType);;
		return true;
	}
}
