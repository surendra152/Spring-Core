package com.springcore.singleton;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")		//this is prototype declaration, we can use this annotation with @Component annotation
public class Student {
	
	@Value("Surendra")
	private String sName;
	@Value("Surat")
	private String sCity;
	
	@Value("#{myBF}")
	private List<String> address;
	
	
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCity() {
		return sCity;
	}
	public void setsCity(String sCity) {
		this.sCity = sCity;
	}
	
	
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sName=" + sName + ", sCity=" + sCity + "]";
	}
	
}
