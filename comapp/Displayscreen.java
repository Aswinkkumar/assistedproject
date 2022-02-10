package com.aswin.Lockedme.comapp;

import java.io.IOException;

public class Displayscreen  {
	
		public static void main(String[] args) throws IOException {
			String str ="Aswin";
			String applicationName ="LockedMe";
			System.out.println("ApplicationName:"+ applicationName +" developed by "+str+"\n");
			System.out.println("Press Enter... .");
		    System.in.read();
		    FileOptionScreen.operation();	
		}
	}


