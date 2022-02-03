package com.aswin.filehandlinOfCalculator;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.nio.file.StandardOpenOption;

public class arithmetic {
		  static int result;
		  private static void writeToFile(ArithmeticException ex)  throws IOException
			{
				Path logFile = Path.of("D://ExceptionLogFile.txt//");
				byte bytes[] = ("\r\n"+LocalDateTime.now()+": "+ ex.toString()).getBytes();
				Files.write(logFile, bytes, StandardOpenOption.APPEND);
			    System.out.println("Exception logged to your file");
			}
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
			public static int division(int a,int b) throws IOException {
				  try
				  {
					  result=a/b;
				  }catch(ArithmeticException ex)
				  	  {
				         System.out.println("Warning: You cannot divide an number with 0");
				         writeToFile(ex);
				      }
				  return result;
			}
			
			public static void main(String[] args) throws IOException{
				
				Scanner sc=new Scanner(System.in);
				int r;
				System.out.println("enter your choice :: 1.Addition 2.Subtraction 3.Multiplication 4.Division");
			    int c=sc.nextInt();
			    System.out.println("enter the first number  , a = ");
			    int a=sc.nextInt();
			    System.out.println("enter the second number , b = ");
			    int b=sc.nextInt();
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
			
			}

		}