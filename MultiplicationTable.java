package com.techment.Assignment1;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter any no:");
		   int a=sc.nextInt();
		   for(int i=1;i<=10;i++)
		   {
			   System.out.printf("%d*%d=%d\n",a,i,a*i);
		   }   
		   
	}

}
