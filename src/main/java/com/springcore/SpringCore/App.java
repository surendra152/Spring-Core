package com.springcore.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * setter injection
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        
        Student student_1st = (Student) context.getBean("student1");
        Student student_2nd = (Student) context.getBean("student2");
        
        System.out.println(student_1st);
        System.out.println(student_2nd);
        
        
    }
}
