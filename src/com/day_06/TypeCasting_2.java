package com.day_06;

public class TypeCasting_2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method  

		char letter = 'A';
		System.out.println(letter);
		System.out.println((int) letter);
		//converting char to integers
		//type casting means convert one datatypeS to ANOTHER DATA TYPES 
		// here I am doing type casting, means we want integer part of this char=latter
		System.out.println("*******************");
		
		int num= (int) letter;
		System.out.println(num);
		
		int a=65; //number is nothing but integer part of the number
		System.out.println(a);
		
		
		char b= (char) 66; // type casting int to char
		System.out.println(b);
		
		// How to know which ASCII values represents what?
		 char val = (char) 46; //dot
		 System.out.println(val);
		 
		 
		 char val2 = (char) 38; //&
		 System.out.println(val2);
		
		 
		 val2 = (char) 97; //a
		 System.out.println(val2);
		 
		 val2 = (char) 49; //dot
		 System.out.println(val2);
		 
		 
		 System.out.println((int) 'a');
		 
		 
		
		// System.out.println((int) "ab");
		// * Integers to String typecasting Possible 
		 //*Strings to integers  typecasting not possible

//String m="A";
System.out.println((int) 'm');

System.out.println('A' + 'B'); //65+66 // addition for char
System.out.println("A" + "B"); //join for Strings

		}

}
