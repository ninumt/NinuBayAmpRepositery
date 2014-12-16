package com.ninu.practise;
//using diff methods of String Class
public class MyStringEgs {
	public static void main(String[] args) {
		String exp="My name is Ninu and i am learning java.";
		
		//length()
		int len=exp.length();
		System.out.println("length is "+len);
		
		//equals()
		String diff="Pls help me";
		String add=exp.concat(diff);
		System.out.println("after concating = "+add);
		
		//matches
		String checkMatch="hijb";
		boolean actual=checkMatch.matches("[a-z]");
		System.out.println("Match found "+actual);
		
		String Str = new String("Welcome to Tutorialspoint.com");

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("(.*)Tutorials(.*)"));

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("Tutorials"));

	      System.out.print("Return Value :" );
	      System.out.println(Str.matches("Welcome(.*)"));
	      
	      //substring
	      String result="abcdefgh".substring(4, 5);
	      System.out.println("substring value is "+result);
	      
	      //split
	      String[] splited=exp.split(" ");
	      int splitLen=splited.length;
	      //System.out.println(splitLen);
	      for(int i=0;i<splitLen;i++){
	    	  System.out.println(splited[i]);
	      }
		
	}

}
