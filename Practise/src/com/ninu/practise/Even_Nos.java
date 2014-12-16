package com.ninu.practise;

public class Even_Nos {

	public static void main(String[] args) {
		for(int no=1;no<=100;no++){
					
			int reminder=no%2;
			
			if(reminder==0){
				System.out.println(no);
			}else if(no%5==0){
				System.out.println("divisible by 5 and no is "+no);
			}
		}
	}
		
}




