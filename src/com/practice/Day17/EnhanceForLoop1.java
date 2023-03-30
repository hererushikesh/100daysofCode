package com.practice.Day17;

public class EnhanceForLoop1 {
	public static void main(String[] args) {
		String languages[]= {"English","marathi","Hindi","Tamil","etc..."};
		
		// Enhance For loop
//		for(String l:languages) {
//			System.out.println(l);
//		}
		
		// General for loop
		for(int i=0;i<=languages.length-1;i++) {
			System.out.println(languages[i]);
		}
	}
}
