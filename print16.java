package com.techment.Assignment1;
import java.util.Scanner;

public class print16 {
	
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number to Check whether it is Divisible by 8 and 3 : ");
		number = sc.nextInt();	
		
		if((number % 8 == 0) && (number % 3 == 0))
		{
			System.out.println("\n Given number " + number + " is Divisible by 8 and 3"); 
		}
		else
		{
			System.out.println("\n Given number " + number + " is Not Divisible by 8 and 3"); 
		}	
	}
}
