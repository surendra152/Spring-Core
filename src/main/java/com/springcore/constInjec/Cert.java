package com.springcore.constInjec;

public class Cert {
	
	 String name;

	public Cert(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
	
	
}
