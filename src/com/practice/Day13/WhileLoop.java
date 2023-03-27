package com.practice.Day13;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {

		int a;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Integer : ");

		while ((a = input.nextInt()) != 0) {
			System.out.println("You Entered Integer which is : " + a);
			System.out.println("Input an Integer !");
		}
		System.out.println("Out of the Loop!");
		input.close();
	}
}
