package com.bayamp.math.calculator.utils;

public class General {
	public static int asciivalueofcharacter(String character){
     	int asciivalueofchar=character.charAt(0);
    	System.out.println("ASCII value of "+character+" is "+asciivalueofchar);
		return asciivalueofchar;
	}
	
    public static int averageofthreeno(int num1,int num2,int num3){
		int avgofthreeno=(num1+num2+num3)/3;
		System.out.println("Average is "+avgofthreeno);
		return avgofthreeno;
		
	}
    
    public double squareroot(double num){
    	double sqrtresult=Math.sqrt(num);
    	System.out.println("Square root of "+num+" is "+sqrtresult);
    	return sqrtresult;
    }
    
    public double exponential(int expo){
     	double exponentialvalue=Math.exp(expo);
    	System.out.println("Exponential of "+expo+" is "+exponentialvalue);
    	return exponentialvalue;
    }
    
    public double exponential(){
     	double exponentialvalue=Math.exp(3);
    	System.out.println("Exponential of 3 is "+exponentialvalue);
    	return exponentialvalue;
    }
    
    public static void primeno(int a){
    	//int num=a;
    	//to be completed
    	
    }
}


