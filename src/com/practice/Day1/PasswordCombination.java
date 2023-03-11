package com.practice.Day1;

import java.util.Scanner;

public class PasswordCombination {

	public static void main(String[] args) {

		System.out.print("Enter a password to check it is valid or not ?");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		char[] charArray = str.toCharArray();

		boolean islower = false;
		boolean isUpper = false;
		boolean isNumber = false;
		boolean isSpecialCharacter=false;
		boolean isLenghtMatch = charArray.length >= 7 ? true : false;
		for (Character c : charArray) {
			if (Character.isLowerCase(c)) {
				islower = true;
				continue;
			}
			if (Character.isUpperCase(c)) {
				isUpper = true;
				continue;
			}
			if (Character.isDigit(c)) {
				isNumber = true;
				continue;
			}
			
			int value = (int) c;
			if(value>=33 && value<=47) {
				isSpecialCharacter=true;
				continue;
			}			
		}

		if (islower && isUpper && isNumber && isLenghtMatch && isSpecialCharacter) {
			System.out.println("It is Valid password");
		} else {
			System.out.println("It is Not Valid password");
		}
		sc.close();
	}
}
