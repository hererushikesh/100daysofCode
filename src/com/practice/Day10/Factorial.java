package com.practice.Day10;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

		int a, factorial = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a  number :");
		a = sc.nextInt();
		if (a < 0) {
			System.out.println("Number should be greater than zero !");
		} else {
			for (int i = 1; i <= a; i++)
				factorial = factorial * i;
			System.out.println("factorial of " + a + " is =" + factorial);
		}
		sc.close();
	}
}
