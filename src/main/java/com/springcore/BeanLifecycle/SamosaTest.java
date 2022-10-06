package com.springcore.BeanLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SamosaTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/BeanLifecycle/ConfigLife.xml");
		
		//registering shutdown hook
		
		context.registerShutdownHook();
		
		/*
		 * //for Samosa class Samosa rs = (Samosa) context.getBean("s1");
		 * 
		 * System.out.println(rs);
		 * 
		 * 
		 * 
		 * System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 * 
		 * //for Pepsi class
		 * 
		 * Pepsi rs1 = (Pepsi) context.getBean("p1");
		 * 
		 * System.out.println(rs1);
		 */
		
		//for Skill class
		
		Skill rs3=(Skill)context.getBean("s2");
		
		System.out.println(rs3);
		
		
	}

}
