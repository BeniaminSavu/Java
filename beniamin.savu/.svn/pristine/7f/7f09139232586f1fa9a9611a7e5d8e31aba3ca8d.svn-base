package com.iquest.week5.pr2;

import java.lang.reflect.Proxy;

public class ProxyFactory {

	public static LogCollector logCollector = new LogCollector();

	public static Object getInstance(Object instance) {
		if (instance == null) {
			throw new NullPointerException();
		}

		Class<?>[] interfaces = instance.getClass().getInterfaces();
		for (Class<?> interfs : interfaces) {
			if (!interfs.isInstance(instance)) {
				throw new NullPointerException();
			}
		}
		

		return Proxy.newProxyInstance(instance.getClass().getClassLoader(), 
				                      new Class<?>[] { interfaces[0] },
				                      new MyProxyHandler(instance, logCollector));
	}

}
