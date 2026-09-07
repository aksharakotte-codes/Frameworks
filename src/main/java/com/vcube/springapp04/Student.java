package com.vcube.springapp04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	String name;
	
	@Autowired
	Address address;
	
	Student() {
		System.out.println("Student No-Arg Constructor Called");
	}
	
	public Student(String name, Address address) {
		
		this.name = name;
		this.address = address;
	}
	
	void studentInfo() {
		System.out.println("Name of the Student : " + name);
		System.out.println("Address of the Student : " + address.city + "->" + address.state);
	}
}
