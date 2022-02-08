package com.aswin.exceptionhandling;

public class tryCatch {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			int c=a/b;
			System.out.println("Result is "+c);
		}
		catch(ArithmeticException e){
			System.out.println("Error occured" +e);
		}
	    int[] array = new int[3];
	    try 
	    {
	        array[7] = 3;
	    }
	    catch (ArrayIndexOutOfBoundsException e) 
	    {
	        System.out.println("Array index is out of bounds!"); 
	    }
	    finally 
	    {
	        System.out.println("The array is of size " + array.length);
	    }
	    
	}
	}


