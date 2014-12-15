package com.at.practice;

public class Dog implements AnimalInterface {

	@Override
	public void run() {
		
		System.out.println("This is dog running");
		
	}

	@Override
	public void sleep() {
		
		System.out.println("This is dog sleeping");
		
	}
	

}
