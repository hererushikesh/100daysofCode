package com.practice.Day2;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		System.out.print("Enter a two numbers");
		Scanner sc = new Scanner(System.in);
		int firstNumber = sc.nextInt();
		int secondNumber = sc.nextInt();		
		
		System.out.println("Sum of two number is "+ (firstNumber+secondNumber));
		sc.close();
	}

}
