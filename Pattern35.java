package com.techment.Assignment1;

import java.util.Scanner;
public class Pattern35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter no. of rows:");
		  int rows=sc.nextInt();
		     
		 //Prints upper half pattern  
		 for (int i = 1; i <= rows; i++)   
		 {  
		 for (int j = 1; j <= i; j++)   
		 {   
		 System.out.print(j+" ");   
		 }   
		 System.out.println();   
		 }   
		 //prints lower half pattern  
		 for (int i = rows-1; i >= 1; i--)  
		 {  
		 for (int j = 1; j <= i; j++)  
		 {  
		 System.out.print(j+" ");  
		 }  
		 System.out.println();  
		 }  
	}

}
