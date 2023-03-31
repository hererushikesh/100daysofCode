package com.practice.Day18;

public class First10PrimeNumbers {
	public static void main(String[] args) {
		int i, j, k, count = 0;
		System.out.println("Your First 10 prime numbers are :");
		for (i = 2; count < 10; i++) {
			k = 0;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					k++;
					break;
				}
			}
			if (k == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
	}

}
