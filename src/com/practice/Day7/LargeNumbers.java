package com.practice.Day7;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeNumbers {
	public static void main(String[] args) {

		Scanner get = new Scanner(System.in);
		System.out.println("Enter the first Number : ");

		BigInteger first = get.nextBigInteger();

		System.out.println("Enter the second Number : ");
		BigInteger second = get.nextBigInteger();

		BigInteger result = first.add(second);
		System.out.println("The result of two number is : " + result);
		get.close();
	}
}
