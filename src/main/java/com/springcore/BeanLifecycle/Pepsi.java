package com.springcore.BeanLifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//implementing the bean life cycle by using interface

public class Pepsi implements InitializingBean,DisposableBean {
	
	private double price;

	
	
	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	
	//Bean life cycle by using interface
	
	public void afterPropertiesSet() throws Exception {
		// init method
		System.out.println("init message: taking pepsi");
		
	}

	public void destroy() throws Exception {
		// destroy method
		System.out.println("Taken the Pepsi");
		
	}
	
	
	
}
