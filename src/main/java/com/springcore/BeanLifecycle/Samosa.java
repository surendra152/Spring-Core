package com.springcore.BeanLifecycle;

public class Samosa {

	private Double price;

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		System.out.println("setting price");
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	//Bean life cycle
	
	//this method will execute automatically if you mentioned init-method in the configLife file
	
	public void init() {
	
		System.out.println("Inside init method");
		
	}
	
	//this method will execute automatically if you mentioned destroy-method in the configLife file
	//to anble this method we need to register the hook method context.registerShutdownHook();
	public void destroy() {
		
		System.out.println("Inside destroy method");
	}
	
}
