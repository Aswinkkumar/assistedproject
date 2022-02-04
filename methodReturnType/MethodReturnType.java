package com.aswin.methodReturnType;


	public class MethodReturnType {
		  int add(int a,int b) {
			return a+b;
		}
		  float add(float a,float b) {
				return a+b;
			}
		 double add(double a,double b) {
				return a+b;
			}
		 char variable(char a) {
			 char t=a;
			 return t;
		 }
		 void print(){
			 System.out.println("nothing is return");
			 
		 }
		 public static void main(String[] args) {
			MethodReturnType y=new MethodReturnType();
			System.out.println("Addition of two int "+y.add(5, 6));
			System.out.println("Addition of two float "+y.add(7.15f,5.15f));
			System.out.println("Addition of two double "+y.add(5.25, 7.050));
			System.out.println("Variable is "+y.variable('p'));
		    y.print();
		}
		}

