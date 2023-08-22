package com.day_06;

import java.util.Scanner;

public class InputOutput_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scanner=new Scanner(System.in); // here we are creating the objects of Scanner class
		 // System.in means we are taking inputs from keyboards
		System.out.println("Enter the numbers/inputs: "); 
		
		
//		int x=scanner.nextInt();
//		int y = scanner.nextInt();
//		//.nextInt() method reads the integer input from the custom/customer inputs
//		System.out.println("The output is : " + x+y); // dont use x+y directly
//		System.out.println("The output is : " + (x+y)); // dont use x+y directly
//		System.out.println( x+y); // dont use x+y directly
//
		
		
     //String
//		 String name = scanner.next(); //reads only one word from the users 
//		 System.out.println("Hello" + name);
		 
		 String name1= scanner.nextLine();//reads whole sentence from the users
		 System.out.println("Hello" + name1);
		 
		
		
	}

}
