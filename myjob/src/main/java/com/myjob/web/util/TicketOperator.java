package com.myjob.web.util;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myjob.infrastructure.Operator;
import com.myjob.web.auth.Ticket;

@Operator
public class TicketOperator {
	@Resource
	private TicketEncoder ticketEncoder;
	
	@Resource
	private KeyProvider keyProvider;
	
	@Resource
	private CookieOperator cookieOperator;
	
	public void setTicket(Ticket ticket,HttpServletResponse response,Boolean rememberMe) throws IOException{
		String ticketText = ticketEncoder.encode(ticket);
		response.setHeader(keyProvider.ticketKey(), ticketText);
		cookieOperator.setCookieValue(response, keyProvider.ticketKey(), ticketText);
		if(rememberMe != null && rememberMe){
			cookieOperator.setCookieValue(response, keyProvider.ticketKey(), ticketText);
		}
	}
	
	public Ticket getTicket(HttpServletRequest request){
		String ticketText = request.getHeader(keyProvider.ticketKey());
		//System.out.println("header-ticket: " + ticketText);
		if(ticketText == null){
			ticketText = cookieOperator.getCookieValue(request, keyProvider.ticketKey());
			//System.out.println("cookie-ticket: " + ticketText);
		}
		
		if(ticketText == null){
			return null;
		}
		
		try{
			Ticket ticket = ticketEncoder.decode(ticketText);
			return ticket;
		}catch(Exception e){
			return null;
		}
	}
	
	public void clearTicket(HttpServletResponse response){
		response.setHeader(keyProvider.ticketKey(), "");
		cookieOperator.setCookieValue(response, keyProvider.ticketKey(), "");
	}
}
