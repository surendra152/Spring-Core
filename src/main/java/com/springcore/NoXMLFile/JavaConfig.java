package com.springcore.NoXMLFile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//this java file replaces the xml based config from spring.

@Configuration
@ComponentScan(basePackages = "com.springcore.NoXMLFile")	//base package scan it replaces the xml file
public class JavaConfig {
	

}
