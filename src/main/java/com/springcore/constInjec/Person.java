package com.springcore.constInjec;

public class Person {
	
	private String name;
	private int persionid;
	private Cert certi;
	
	public Person(String name,int persionid,Cert certi) {
		
		this.name=name;
		this.persionid=persionid;
		this.certi=certi;
		
	}
	
	@Override
	public String toString() {
		
		return this.name+" "+this.persionid+" { "+this.certi.name+" } ";
	}
}
