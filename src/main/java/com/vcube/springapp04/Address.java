package com.vcube.springapp04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	String city;
	String state;
	
//	public Address() {
//		System.out.println("Address No-arg constructor called ");
//	}
	
	public Address(@Value("Hyderabad") String city, @Value("Telangana") String state) {
		this.city = city;
		this.state = state;
	}
	
	void display() {
		System.out.println("City" + city);
		System.out.println("State" + state);
	}
}
