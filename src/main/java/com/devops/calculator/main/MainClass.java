package com.devops.calculator.main;

import java.util.Scanner;
import com.devops.calculator.addition.Addition;

public class MainClass {

	public static void main(String[] args) {
		
		Addition add = new Addition();
		
		System.out.println("\n\tAdding two numbers: "+add.addition(10,100));
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\nEnter a number for 'A': ");
		int A = sc.nextInt();
		
		System.out.print("Enter a number for 'B': ");
		int B = sc.nextInt();
		
		System.out.println("\n\tAdding two numbers A+B is: "+add.addition(A,B));

	}

}
