package com.iquest.week5.pr2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxyHandler implements InvocationHandler {

	private Object object;
	private LogCollector logCollector;
	private StringBuilder message = new StringBuilder();

	public MyProxyHandler(Object object, LogCollector logCollector) {
		this.object = object;
		this.logCollector = logCollector;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result;
		message.setLength(0);
		Class<?> aClass = object.getClass();
		Method methodToCheck = aClass.getMethod(method.getName(), method.getParameterTypes());

		if (methodToCheck.isAnnotationPresent(Logged.class)) {
			message.append(methodToCheck.getName() + " is Annotated and ");
			checkClassAnnotation(aClass);
			logCollector.addMessage(message.toString());
		} else {
			message.append(methodToCheck.getName() + " is not Annotated and ");
			checkClassAnnotation(aClass);
			logCollector.addMessage(message.toString());
		}

		result = method.invoke(object, args);
		return result;
	}

	private void checkClassAnnotation(Class<?> aClass) {
		if (aClass.isAnnotationPresent(Logged.class)) {
			message.append(aClass.getName() + " is Annotated");
		} else {
			message.append(aClass.getName() + " is not Annotated");
		}
	}

}
