package am.developer.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

//before a method is invoke
public class BeforeMethod implements MethodBeforeAdvice
{
	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("BeforeMethod : Before method hijacked!");
	}
	
}
