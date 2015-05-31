package com.myjob.service.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.myjob.service.exception.ServiceInternalException;
import com.myjob.service.exception.ServiceLogicException;

@Aspect
@Component
public class ServiceLoggingAspect {
	
	@Pointcut("execution(* com.myjob.service.*Service.*(..))")
	public void serviceOperation(){}
	
	@AfterThrowing(
			pointcut="serviceOperation()",
			throwing="ex")
	public void LogServiceLogicException(ServiceLogicException ex){
		System.out.println("[Service Logic Exception]: " + ex.getMessage());
	}
	
	@AfterThrowing(
			pointcut="serviceOperation()",
			throwing="ex")
	public void LogServiceInternalException(ServiceInternalException ex){
		System.out.println("[Service Internal Exception]: " + ex.getMessage());
	}
	
	@Before("serviceOperation()")
	public void beforeServiceOperation(JoinPoint jp){
		System.out.println("--Call Service: " + jp.toShortString());
	}
}
