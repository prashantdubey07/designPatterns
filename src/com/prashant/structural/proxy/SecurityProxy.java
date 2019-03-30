package com.prashant.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityProxy implements InvocationHandler {
	private Object obj;

	private SecurityProxy(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result;
		try {
			if(method.getName().contains("post")) {
				throw new IllegalAccessException("Post is not allowed");
			}
			result = method.invoke(obj, args);
		} catch (InvocationTargetException e) {
			throw e.getTargetException();
		} catch (Exception e) {
			throw new RuntimeException("unexpected invocation exception " + e.getLocalizedMessage());
		}
		return result;
	}

	public static Object newInstance(Object obj) {
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
				new SecurityProxy(obj));
	}

}
