package com.practice.Day8;

import java.util.Scanner;

public class LargestOfThreeNumbers {
	public static void main(String[] args) {
		int first;
		int second;
		int third;

		Scanner getting_Value = new Scanner(System.in);
		System.out.println("Enter Three Numbers :- ");
		first = getting_Value.nextInt();
		second = getting_Value.nextInt();
		third = getting_Value.nextInt();

		if (first > second && first > third) {
			System.out.println(first + " This is the Largest Number ! ");
		} else if (second > first && second > third) {
			System.out.println(second + " This is the Largest Number! ");
		} else if (third > first && third > second) {
			System.out.println(third + " This is the Largesh Number ! ");
		} else {
			System.out.println("Enter numbers which are not distinct!");
		}
		getting_Value.close();
	}
}
