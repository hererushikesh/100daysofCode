package com.practice.Day23;

import java.util.Scanner;

public class SubStringOfString {

	public static void main(String[] args) {
		System.out.println("Enter a String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int length = str.length();
		System.out.println("Substring of String are : " + str);
		for (int i = 0; i < length; i++) {
			for (int j = 0; j <= length - i; j++) {
				String sub = str.substring(i, i + j);
				System.out.println(sub);
			}
		}
	}

}
