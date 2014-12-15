package com.at.practice;

public class EmployeePersonAbst extends AbstractPerson {

	@Override
	void call() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}
	
//AbstractPerson ob1=new AbstractPerson();
//cannot instantiate as its a nonstatic method we need object& abstract class cannot have object.
	
	AbstractPerson.checkMe();
	
}
