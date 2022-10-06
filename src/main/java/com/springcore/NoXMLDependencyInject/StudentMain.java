package com.springcore.NoXMLDependencyInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		
		ApplicationContext con=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student student = con.getBean("test",Student.class);
		
		System.out.println(student);
		student.study();
	}

}
