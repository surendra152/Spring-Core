package com.springcore.constInjec;


//Ambiguity problem
//you can resolve this issue by declaring type keyword in the xml file.
public class Addition {
	
	private int a;
	private int b;
	
	public Addition(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("Constructor : int,int");
	}
	
	public Addition(double a,double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Constructor : double,double");
	}
	
	public Addition(String a,String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("Constructor : String,String");
	}
	
	public void doSum() {
		System.out.println("sum is: "+(this.a+this.b));
	}
}
