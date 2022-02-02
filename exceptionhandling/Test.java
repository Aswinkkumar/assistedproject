package com.aswin.exceptionhandling;

public class Test {
static void check(int password) throws PasswordNotValidException{
	if(password >8) {
		throw new PasswordNotValidException("password not valid");
	}
	else
		System.out.println("valid password");
}
	public static void main(String[] args)  {
		try {
			check(6);
			
		} catch (PasswordNotValidException e) {
			
		
		System.out.println(e);
	
		}
	}

}
