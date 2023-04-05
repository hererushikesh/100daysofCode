package com.practice.Day20;

public class UsingStringBuilder {
	public static void main(String[] args) {
		String name = " redliuBgnirtS gnisU gnirtS esreveR  ";
		
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.reverse();
		System.out.println(sb);
	}
}
