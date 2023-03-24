package com.practice.Day8;

import java.util.Scanner;

public class Condition1 {
	public static void main(String[] args) {
		int obtainedMarks, passingMarks;

		passingMarks = 35;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Obtained Marks");

		obtainedMarks = sc.nextInt();

		if (obtainedMarks >= passingMarks) {
			System.out.println("Congratulations  you are pass !");
		} else {
			System.out.println("Unfortunataily you failed in Exam !");
		}
		sc.close();
	}
}
