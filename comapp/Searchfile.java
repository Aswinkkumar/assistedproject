package com.aswin.Lockedme.comapp;
import java.io.File;
import java.util.Scanner;

public class Searchfile {
	public static void Searchfile()
	{
	String location ="D:\\Fileapp";
	Scanner sc = new Scanner(System.in);
	System.out.println("Want to search File?");
	System.out.println("Please Enter Name of the File to be searched :");
	String str3 = sc.next();
	File sFile = new File("D:\\Fileapp");
	File a[] = sFile.listFiles();
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(a[i].getName().startsWith(str3)) {
			count++;
			if(a[i].isFile()) {
    			System.out.println("File found at location:- "+a[i]+"\n");
    		}
    		
		}    		
	}
	if(count==0)
		System.out.println("File Not Found\n");
}
}