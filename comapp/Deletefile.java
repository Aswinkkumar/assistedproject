package com.aswin.Lockedme.comapp;

import java.io.File;
import java.util.Scanner;

public class Deletefile {
	public static void Deletefile()
	{
	String location ="D:\\Fileapp";
	Scanner sc = new Scanner(System.in);
	System.out.println(" Want to Delete File ");
	System.out.println("Please Enter the File name to be deleted  with the extension");
	String str2 = sc.next();
	File File = new File(location+"\\"+str2);
	if(File.exists()) 
	{
		File.delete();
		System.out.println(File +" File is Deleted\n");
	}else 
	{
		System.out.println("!!File not Found!!!\n");
	}
}
}