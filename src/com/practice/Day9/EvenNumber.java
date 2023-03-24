package com.practice.Day9;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to Check Even or ODD!");
		int number = sc.nextInt();
		if (number % 2 == 0)
			System.out.println(number + " This is the Even Number!");
		else
			System.out.println(number + " This is the ODD number !");
		sc.close();
	}
}
