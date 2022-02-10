package com.aswin.Lockedme.comapp;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Addfile {
	public static void Addfile()
	{
	String location ="D:\\Fileapp";
	Scanner sc = new Scanner(System.in);
	System.out.println("Want to add File?");
	System.out.println("Please Enter the File name with extension");
	String str1 = sc.next();
	File addfile = new File(location+"\\"+str1);
	if(addfile.exists()) 
	{
		System.out.println("Already exits!!\nTry with new file name again\n");
	}
	else 
	{
		try 
		{
			addfile.createNewFile();
			System.out.println("* Your file is successfully created! *\n");
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
}
}
