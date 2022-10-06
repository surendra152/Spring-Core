package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/ColletionConfig.xml");
		
		Emp emp_1st = (Emp) context.getBean("emp1");
		
		System.out.println(emp_1st.getName());
		System.out.println(emp_1st.getAddress());
		System.out.println(emp_1st.getPhones());
		System.out.println(emp_1st.getCourses());
	}

}
