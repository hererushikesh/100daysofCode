package com.practice.Day5;

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String args[]) {

		float celsius;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter actul tempreture -");

		int tempreture = scanner.nextInt();

		celsius = ((tempreture - 32) * 5) / 9;

		System.out.println("Tempreture in Celsius " + celsius);
		scanner.close();
	}

}
