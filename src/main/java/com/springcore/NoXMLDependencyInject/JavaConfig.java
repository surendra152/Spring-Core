package com.springcore.NoXMLDependencyInject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//this java file replaces the xml based config from spring.

@Configuration
// @ComponentScan(basePackages = "com.springcore.NoXMLFile")	//base package scan it replaces the xml file
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa(){
		
		return new Samosa();
	}
	
	@Bean(name = {"test","demo","con"})  //we can use any name from here as bean name in the main class
	public Student getStudent() {
		//creating new student object
		Student s=new Student(getSamosa());
		
		return s;
	}

}
