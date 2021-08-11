package com.techment.Test1;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size=scan.nextInt();
		int [] array=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter the Age: ");
			array[i]=scan.nextInt();
		}
		scan.close();
		int i = 0;
		if (i < 18) {
			System.out.println("children");
		} else if (i >= 18 && i <= 54) {
			System.out.println("adult");
		} else if (i >= 55) {
			System.out.println("Senior citizen");
		} else {
			System.out.println("Invalid input");
		}


	}

}
