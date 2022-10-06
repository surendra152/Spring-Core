package com.springcore.constInjec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
	
	public static void main(String[] args) {
		
	ApplicationContext	context=new ClassPathXmlApplicationContext("com/springcore/constInjec/CIConfig.xml");
	
	Person p = (Person)context.getBean("person");
	System.out.println(p);
	
	Addition a = (Addition)context.getBean("add");
	
	a.doSum();
	
	}
}
