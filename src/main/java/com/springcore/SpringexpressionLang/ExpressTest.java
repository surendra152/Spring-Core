package com.springcore.SpringexpressionLang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExpressTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/SpringexpressionLang/ConfigSEx.xml");
		
		Express demo=context.getBean("express",Express.class);
		
		System.out.println(demo);
		
	}

}
