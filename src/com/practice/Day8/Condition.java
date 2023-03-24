package com.practice.Day8;

import java.util.Scanner;

public class Condition {
	public static void main(String[] args) {
		boolean learning;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter True either False :");
		learning = sc.nextBoolean();

		if (learning) {
			System.out.println("Java Programming !");
		} else {
			System.out.println("What are doing here?");
		}
		sc.close();
	}
}
