package com.springcore.AutowireUsingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("temp1")				// used for to get identify particular bean by name
	private Address address;

	
	
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Emp(Address address) {
		
		super();
		this.address = address;
		System.out.println("inside constructor");
	}




	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("inside setter");
		this.address = address;
	}




	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
