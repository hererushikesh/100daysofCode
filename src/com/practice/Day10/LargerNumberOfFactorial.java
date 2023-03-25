package com.practice.Day10;

import java.math.BigInteger;
import java.util.Scanner;

public class LargerNumberOfFactorial {

	public static void main(String[] args) {

		int number;
		BigInteger inc = new BigInteger("1");
		BigInteger fact = new BigInteger("1");

		Scanner sc = new Scanner(System.in);

		number = sc.nextInt();
		for(int i=1;number>=i;i++)
		{
			fact=fact.multiply(inc);
			inc=inc.add(BigInteger.ONE);
		}
		System.out.println(fact);
	}
}
