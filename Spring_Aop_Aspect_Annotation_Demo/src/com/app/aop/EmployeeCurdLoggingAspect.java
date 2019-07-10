package com.app.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeCurdLoggingAspect 
{
	
	public void logBefore(JoinPoint joinPoint)
	{
		System.out.println("EmployeeCurdLoggingAspect :: logBefore() : "+joinPoint.getSignature().getName());
	}
	
	public void logAfter(JoinPoint joinPoint)
	{
		System.out.println("EmployeeCurdLoggingAspect :: logAfter() : "+joinPoint.getSignature().getName());
	}
}
