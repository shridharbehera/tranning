package com.techment.Assignment1;
import java.util.Scanner;
public class Pattern34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter no. of rows:");
		   int rows=sc.nextInt();
		   for(int i=1;i<=rows;i++)
		   {
		         for(int j=rows;j>=i;j--)
		         {
				    System.out.print(j+" ");
				 }
				 System.out.println();
		   }
		   
	    }
	}

