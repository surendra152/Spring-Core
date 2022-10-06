package com.springcore.AutowireUsingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {
		
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/AutowireUsingXml/ConfigAuto.xml");
		
		Emp rs = context.getBean("emp",Emp.class);
		
		System.out.println(rs);
		
	}

}
