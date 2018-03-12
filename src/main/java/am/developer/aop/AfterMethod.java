package am.developer.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

//after a method is invoke
public class AfterMethod implements AfterReturningAdvice
{
	@Override
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		System.out.println("AfterMethod : After method hijacked!");
	}
	
}
