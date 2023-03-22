package com.practice.Day4;

import java.util.Scanner;

public class GetInputFromUser {
	public static void main(String[] args) {

		int a;
		float b;
		String c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Integer ");
		a = sc.nextInt();
		System.out.println("You Entered a Integer :- " + a);

		System.out.println("Enter any Float Value ");
		b = sc.nextFloat();
		System.out.println("You Entered a Float Number :- " + b);

		System.out.println("Enter any String ");
     	c = sc.next();
		System.out.println("You Entered a String :- " + c);
		sc.close();
	}
}
