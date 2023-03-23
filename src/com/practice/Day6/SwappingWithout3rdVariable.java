package com.practice.Day6;

public class SwappingWithout3rdVariable {
	public static void main(String[] args) {

		int a = 20;
		int b = 40;
		System.out.println("Before swapping " + a);
		System.out.println("Before swapping " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("\n");
		
		System.out.println("After Swapping " + a);

		System.out.println("After Swapping " + b);
	}

}
