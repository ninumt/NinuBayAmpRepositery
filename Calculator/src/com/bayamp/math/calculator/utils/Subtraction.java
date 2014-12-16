package com.bayamp.math.calculator.utils;

public class Subtraction {
	 public static int subtraction_no(int num1,double num2){
			int subtract=num1-(int)num2;
			return subtract;
		}
		
		public static void subtraction_no(int num1,int num2){
			int subtract=num1-num2;
			System.out.println("Difference of 2 nos is "+subtract);
		}
		
		public void subtraction_no(double num1,double num2,int num3){
			double subtract=num1-num2-(double)num3;
			System.out.println("Difference of 3 nos is "+subtract);
		}
		
		public void subtraction_no(int num1,int num2,int num3,int num4){
			int subtract=num1-num2-num3-num4;
			System.out.println("Subtraction of 4 nos is "+subtract);
		}
		
		public static void main(String[] args) {
			
		}

}
