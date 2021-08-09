package com.techment.Assignment1;
import java.util.Scanner;
public class DemoException18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the value of a:");
		    int a=sc.nextInt();
		    System.out.println("Enter the value of b:");
		    int b=sc.nextInt();
		    
		    System.out.println("Division"+(a/b));
		    System.out.println("After Division");
		    } 	
			catch(ArithmeticException ae)
			{
				System.out.println("Divide by zero error");
				System.out.println(ae);
			}
			finally
			{
				System.out.println("finally");
			}
			
		}
	}

