package com.pkg.string.manipulation;

public class CheckCharPresence {
	public static void main(String[] args) {
		String input = "Anu";
		char c = 'A';
		char[] inputChar = input.toCharArray();
		for (char itr : inputChar) {
			if (itr == c) {
				System.out.println("Present");
			} else {
				System.out.println("Not Present");
			}
		}
	}
}
