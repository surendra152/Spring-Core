package com.springcore.BeanLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Skill {

	private String tech;



	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Skill [tech=" + tech + "]";
	}

	
	//Bean life cycle using annotation
	
	//bt default these annotations are disbled to anable this use this tag in configLife.xml file <context:annotation-config />
	
	@PostConstruct
	public void start() {

		System.out.println("Inside starting method");

	}

	@PreDestroy
	public void end() {

		System.out.println("Inside ending method");
	}
	
	
	
}
