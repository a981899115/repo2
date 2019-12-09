package com.neuedu.ttc.aoptest;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Check {
	@Before("execution(* add*(..))")
	public void checkUser(){
		System.out.println("这是检查用户的权限---------");
	}
	@After("execution(* add*(..))")
	public void checkUser1(){
		System.out.println("这是记录检查----------");
	}

}
