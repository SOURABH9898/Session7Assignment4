package com.acadglid.java.core.session7.assignment4;

import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String value");
		String str=s.next();
		System.out.println("reversed String is "+stringReverse(str));
		s.close();
	}
	static String stringReverse(String str){
		String str1="";
		
		for(int i=str.length();i>=0;i--){
			try{
				// here is where the StringOutOfBoundsException is triggered
				str1=str1+str.charAt(i);
			
			}catch(StringIndexOutOfBoundsException e){
				// Exception handled
				System.out.println("Please check the intialisation of the looping variables and index");
			}
		}
		
		return str1;
	}
	

}
