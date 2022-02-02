package com.aswin.exceptionhandling;

public class ExceptionHandling {
public static void main(String[] args) {
	int sum=0;
	for (int i=0;i<args.length;i++)
	{
		try {
			
			sum=sum+Integer.parseInt(args[i]);
		}
		catch(Exception e) {
			System.out.println("Exception occured" +e);
		}
	}
	System.out.println("Sum is "+sum);
}
}
