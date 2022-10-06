package com.springcore.referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/referencetype/RefConfig.xml");
		
		A rs = (A)context.getBean("aref");
		
		System.out.println(rs.getX());
		System.out.println(rs.getOb().getY());
	}

}
