package com.aswin.exceptionhandling;

public class PasswordNotValidException extends Exception{
	private String password;

    public PasswordNotValidException(String password) {
        
        this.password=password;
    }
    @Override
    public String toString() {
        return "PasswordNotValidException [Password=" + password + "]";
    }
    
    
}

