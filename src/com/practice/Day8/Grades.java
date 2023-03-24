package com.practice.Day8;

import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		int obtainedMarks, passingMarks = 35;
		char grade;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Obtained Marks !");
		obtainedMarks = sc.nextInt();

		if (obtainedMarks >= passingMarks) {
			if (obtainedMarks >= 90)
				grade = 'A';
			else if (obtainedMarks >= 75)
				grade = 'B';
			else if (obtainedMarks >= 50)
				grade = 'C';
			else
				grade = 'D';
			System.out.println("you passed the Exam and Your grade is : " + grade);
		} else {
			grade = 'F';
		System.out.println("Unfortunatly you failed in Exam and your grade is : " + grade);
		}sc.close();
	}
}
