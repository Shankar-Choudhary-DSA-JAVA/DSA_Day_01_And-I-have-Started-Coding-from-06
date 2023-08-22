package com.day_06;

public class Hello_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//just prints it
System.out.println("Hello World");

System.out.println("156");

System.out.println(156);
System.out.println("*******************");
System.out.println(156+7);//adding two numbers
System.out.println("156" + "7"); //this is joining two strings or concatnations

System.out.println("156" + 7); // this is called implicite typeCastings
//System.out.println("Hello" + Hello); // error , we cant do typecasting of hello, 
//System.out.println("156" - "7"); // errors

System.out.println(5 + "Hello" ); // int + Str will work

// - is a binary operators

int marks =80;
System.out.println("Marks is : " + marks +1 ); // 801

System.out.println("Marks is : " + 80 +1 ); // 801
System.out.println( marks +1 ); // 81
System.out.println("Marks is : " + (marks +1) ); // 801
System.out.println(marks +1 + "marks is" ); // 801


long distance = 7768686878666576870L;
int dist = (int) distance;// explicite type casting
//it says we want distance values in int form

long dist1= distance;
System.out.println(distance);

System.out.println(dist);
System.out.println(dist1);

short planet=9;
long countPlanet=9;
long count=9L;
System.out.println(planet);
System.out.println(countPlanet);
System.out.println(count);

int x=-9;
System.out.println(x);
int y=10/2; //quotient
System.out.println(y);
int z = 9/7;
System.out.println("Hiz"+z);
int a= 9%7;//remainder
System.out.println(a);

double price = 76.505;
System.out.println(price);

float price_2 = (float) 76.89;
price_2 = (float) price;
System.out.println(price_2);

float s = 89.0877f;
System.out.println("value is" +s);

double num=56.789790522134;
System.out.println(num);

float nums= 56.87f;
System.out.println(nums);

// char
 char letter = 'A'; // char values stores in 16 bits bucket
 System.out.println(letter);
 
 int number=65; //int values stores in 32 bits bucket
 System.out.println(number);

 String greet = "";



	}

}
