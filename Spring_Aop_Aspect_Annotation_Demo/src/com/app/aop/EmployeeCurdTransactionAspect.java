package com.app.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeCurdTransactionAspect 
{
	public void getEmployeeById(JoinPoint joinPoint)
	{
		System.out.println("EmployeeCurdTransactionAspect :: getEmployeeById() : "+joinPoint.getSignature().getName());
	}
}
