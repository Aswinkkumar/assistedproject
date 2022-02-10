package com.aswin.Lockedme.comapp;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;





public class FileOptionScreen
{
	 static int options;
	 static int File;
	 static String location ="D:\\Fileapp";
	public static void operation() throws IOException
	 { 
		 do 
		 {   
			 int options=0;
			 System.out.println("DASHBOARD");
			 System.out.println("Select appropriate Options from the list:");
			 System.out.println("1. Retrieve All Files");
			 System.out.println("2. File Operations");
			 System.out.println("3. Exit\n");
			 Scanner sc = new Scanner(System.in);
			 options= sc.nextInt();
				 switch(options) 
					 {
					 	case 1:
					 		File n = new File("D:\\Fileapp");
					 		File filearray[] = n.listFiles();
					 		for(int i=0;i<filearray.length;i++) 
					 		{
					 			if(filearray[i].isFile())
					 			{
					 				System.out.println("File: "+filearray[i] +"\n");
					 			}
					 			
					 		}
					 	break;
					 	case 2:
					 		do
					 		{
					 			int count=0;
								System.out.println(" OPERATION SECTION");
								System.out.println("Select the Options Given Below:");
								System.out.println("1. Add File to the folder");
								System.out.println("2. Delete File from the folder");
								System.out.println("3. Search File in the folder");
								System.out.println("4. Goback to DASHBOARD");
								System.out.println("5. Exit\n");
							    File= sc.nextInt();
								switch(File) 
								{
									case 1:
										Addfile.Addfile();
									break;
									case 2:
										Deletefile.Deletefile();
									break;
									case 3:
										Searchfile.Searchfile();
										break;
									case 4: 
										break;
									case 5:
										System.out.println("Thanks for using application");
										System.exit(1);
										break;

									default:
									     System.out.println("====== you entered Invalid input =======");
										
									}

									System.out.println("Press Enter. ...");
									System.in.read();
									}while(File!=4);
									break;
					 	case 3:
					 		System.out.println("Thanks for using application");
					 		System.exit(1);
					 	default:
					 		System.out.println("====== you entered Invalid input ======");
					 		
					 }  
				
			 }while(options!=3); 
		 } 
	}