package com.springcore.SpringexpressionLang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Express {
	
	@Value("#{10+11}")	//spring expression lang
	private int x;
	@Value("#{3+7}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")		//static method with spring expression
	private double z;
	@Value("#{T(java.lang.Math).E}")
	private double e;
	
	@Value("#{new java.lang.String('Surendra')}")	//object using spring expression
	private String name;
	
	@Value("#{8>3}")		//boolean value in spring expression
	private boolean active;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "Express [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", active=" + active + "]";
	}
	
	
	
	
	
	
	
	
}
