package com.springcore.StandaloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/StandaloneCollection/ConfigStand.xml");
		
	Person rs=context.getBean("person1",Person.class);
	
	System.out.println(rs);
	System.out.println(rs.getFrnds().getClass().getName());
	System.out.println("-----------------------------------------------------------");
	System.out.println(rs.getFeestruct());
	System.out.println(rs.getFeestruct().getClass().getName());
	System.out.println("-----------------------------------------------------------");
	
	System.out.println(rs.getProp());
	}
}
