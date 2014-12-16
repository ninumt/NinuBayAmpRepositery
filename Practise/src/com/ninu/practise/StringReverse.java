package com.ninu.practise;

import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {
	
	public static void main(String[] args) {
		System.out.println("Enter the word u want to reverse");
		Scanner scan=new Scanner(System.in);
		String word=scan.nextLine().trim().toLowerCase();
		
		
		//int len=word.length();
		//System.out.println(len);
		
		String[] reverse=word.split(" ");
		int len1=reverse.length;
		//System.out.println(len1);
		
		String[] finalReverse=new String[len1]; 
		int indexReverse=len1;
		
		for(int index=0;index<len1;index++){
			finalReverse[index]=reverse[--indexReverse];
			//indexReverse--;
			//System.out.print(" "+finalReverse[index]);
		}
		
		StringBuilder builder = new StringBuilder();
		for(String s : finalReverse) {
		    builder.append(s);
		}
		System.out.print(builder.toString());
		//return builder.toString();		
	}

}
