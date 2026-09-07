package com.vcube.springapp04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        
        @SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student st = context.getBean(Student.class);
        st.studentInfo();
        
        Address ad = context.getBean(Address.class);
        ad.display();
    }
}
