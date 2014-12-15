package com.at.practice;

abstract class AbstractPerson {
	//one cannot create object for abstract class
	//person has firstname,lastname,age
	
	String firstName;
	String lastName;
	int age;
	
	abstract void call();//abstract methods dont have body 
	//abstract methods should be overridden in child/derived class
	
	public void check(){
		System.out.println("im a nonstatic method i need object to be accessed lets check in abstract class");
	}
	public static void checkMe(){
		System.out.println("im a static method  lets check in abstract class");
	}

}
