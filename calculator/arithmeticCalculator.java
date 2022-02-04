package com.aswin.calculator;

import java.util.Scanner;
public class arithmeticCalculator {
	


	
			  static int result;
				public static int add(int a,int b) {
				  result=a+b;
				  return result;
			  }
				public static int subtraction(int a,int b) {
					  result=a-b;
					  return result;
				  }
				public static int multiply(int a,int b) {
					  result=a*b;
					  return result;
				  }
				public static int division(int a,int b) {
					  result=a/b;
					  return result;
				}
				
				public static void main(String[] args) {
					
					Scanner sc=new Scanner(System.in);
					int a;
					int b;
					int r;
					System.out.println("Enter first number");
					a=sc.nextInt();
					System.out.println("Enter second number");
					b=sc.nextInt();
					
					System.out.println("enter your choice /n 1.Addition 2.Subtraction 3.Multiplication 4.Division");
				    int c=sc.nextInt();
				    if(c==1)
					{
				    	r=add(a,b);
				    	System.out.println("a+b="+r);
					}
				    else if(c==2)
				    {
					int z=subtraction(a,b);
					System.out.println("a-b="+z);
				    }
				    else if(c==3)
				    {
					int x=multiply(a,b);
					
					System.out.println("a*b="+x);
				    }
				    else if(c==4)
				    {
					double y=division(a,b);
					
					System.out.println("a/b="+y);
				    }
				    else
				    {
				    	System.out.println("invalid option");
				    }
				
				}}

