package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class StudentTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/ConfigSter.xml");
		
		Student result=context.getBean("ob",Student.class);
		
		System.out.println(result);
		
		System.out.println(result.getAddress());
		System.out.println(result.getAddress().getClass().getName());
		
		System.out.println(result.hashCode());
		
		Student result2=context.getBean("ob",Student.class);
		//this is singleton because every time you create a new object spring will provide the same object created previously
		
		System.out.println(result2.hashCode());
	}
}
