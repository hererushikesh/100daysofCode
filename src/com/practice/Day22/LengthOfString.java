package com.practice.Day22;

import java.util.Scanner;

public class LengthOfString {
	public static void main(String[] args) {

		System.out.println("Enter a String to get Length of the String : ");

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Your String is : " + str + "\n" + "The length of the String is : " + str.length());

	}
}
