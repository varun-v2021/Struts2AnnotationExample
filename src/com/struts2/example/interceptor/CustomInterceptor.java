package com.struts2.example.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class CustomInterceptor implements Interceptor {
	 private static final long serialVersionUID = 1L;
	 
	    @Override
	    public void destroy() {
	        System.out.println("CustomInterceptor destroy() is called...");
	    }
	 
	    @Override
	    public void init() {
	        System.out.println("CustomInterceptor init() is called...");
	    }
	 
	    @Override
	    public String intercept(ActionInvocation invocation) throws Exception
	    {
	        System.out.println("CustomInterceptor intercept() is called...");
	        System.out.println(invocation.getAction().getClass().getName());
	        return invocation.invoke();
	    }
}
