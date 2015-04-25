package com.myjob.web.controller;

import java.io.IOException;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myjob.entity.Account;
import com.myjob.service.AccountService;
import com.myjob.service.exception.ServiceException;
import com.myjob.service.exception.ServiceLogicException;
import com.myjob.web.auth.Ticket;
import com.myjob.web.model.LoginModel;
import com.myjob.web.util.TicketOperator;

@Controller
public class LoginController extends ControllerBase {
	@Resource
	private AccountService loginService;
	
	@Resource
	private TicketOperator ticketOperator;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(@ModelAttribute LoginModel model){
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loginSubmit(@ModelAttribute LoginModel model,Model models,HttpServletResponse response) throws ServiceException, IOException{
		try {
			Account account = loginService.login(model.getLoginName(), model.getPassword());
			
			Ticket ticket = new Ticket();
			ticket.setLoginName(model.getLoginName());
			ticket.setPassword(model.getPassword());
			ticket.setCreateTime(new Date());
			
			ticketOperator.setTicket(ticket, response, model.getRememberMe());
			return "redirect:/home/" + account.getAccountType();
		} catch (ServiceLogicException e) {
			models.addAttribute("error", e.getMessage());
			return "login";
		}
	}
	
	@RequestMapping(value="/logout",method=RequestMethod.POST)
	public String logout(HttpServletResponse response){
		ticketOperator.clearTicket(response);
		return "redirect:/login";
	}
}
