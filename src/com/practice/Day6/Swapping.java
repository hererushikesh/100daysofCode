package com.practice.Day6;

public class Swapping {

	public static void main(String[] args) {
		int a = 20;
		int b = 40;
		int temp;

		System.out.println("Before Swapping the variable a is : " + a);
		System.out.println("Before Swapping the variable b is : " + b);

		temp = a;
		a = b;
		b = temp;

		System.out.println("After Swapping the variable a is : " + a);
		System.out.println("After Swapping the variable b is : " + b);
	}
}
