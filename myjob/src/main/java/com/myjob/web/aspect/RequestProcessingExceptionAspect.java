package com.myjob.web.aspect;

import javax.annotation.Resource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.myjob.service.exception.ServiceLogicException;
import com.myjob.web.auth.AuthException;
import com.myjob.web.auth.PassportValidator;
import com.myjob.web.model.AjaxReturningModel;
import com.myjob.web.model.AjaxReturningModel.Code;

@Aspect
@Component
public class RequestProcessingExceptionAspect {
	
	@Resource
	private PassportValidator passportValidator;
	
	@Pointcut("execution(* com.myjob.web.controller.*Controller.*(..))")
	public void controllerHandler(){}
	
	@Pointcut("@annotation(org.springframework.web.bind.annotation.ResponseBody)")
	public void responseBodyAnnotated(){}

	@Around("controllerHandler() && responseBodyAnnotated()")
	public Object ajaxReturn(ProceedingJoinPoint pjp){
		System.out.println("--Call Controller[ajax]: " + pjp.toShortString());

		try{
			validatePassport(pjp);
			Object ret = pjp.proceed();
			return new AjaxReturningModel(Code.success,ret);
		}catch(ServiceLogicException ex){
			return new AjaxReturningModel(Code.error,ex.getMessage());
		}catch (AuthException e) {
			return new AjaxReturningModel(Code.redirect,"/login");
		}catch (Throwable e) {
			return new AjaxReturningModel(Code.error,"Internal Error");
		}
	}
	
	@Around("controllerHandler() && ! responseBodyAnnotated()")
	public Object normalReturn(ProceedingJoinPoint pjp){

		System.out.println("--Call Controller: " + pjp.toShortString());
		
		try{
			validatePassport(pjp);
			return pjp.proceed();
		}catch(AuthException e){
			return "redirect:/login";
		}catch (Throwable e) {
			return "error/500";
		}
	}
	
	private void validatePassport(JoinPoint jp){
		passportValidator.validate(jp.getTarget().getClass(), ((MethodSignature)jp.getSignature()).getMethod());
	}
}
