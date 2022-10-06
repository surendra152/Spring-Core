package com.springcore.StandaloneCollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

	private List<String> frnds;
	private Map<String,Integer> feestruct;
	private Properties prop;	//it is also key value pair
	
	public List<String> getFrnds() {
		return frnds;
	}

	public void setFrnds(List<String> frnds) {
		this.frnds = frnds;
	}


	public Map<String, Integer> getFeestruct() {
		return feestruct;
	}

	public void setFeestruct(Map<String, Integer> feestruct) {
		this.feestruct = feestruct;
	}

	
	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "Person [frnds=" + frnds + ", feestruct=" + feestruct + "]";
	}
	
	
}
