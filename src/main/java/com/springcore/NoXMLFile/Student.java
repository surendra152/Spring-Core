package com.springcore.NoXMLFile;

import org.springframework.stereotype.Component;

@Component("firststudent")
public class Student {
 
	public void study() {
		System.out.println("student is reading book");
	}
}
