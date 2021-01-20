package com.programs.test;

public class reverseString {
	
	public  static void main(String[] args) {

		reverseInputString("abcdefghijklmnopq");
		reverseInputString(" *(){ } & ^ % $ # @ "); //special chars
	}

	private static void reverseInputString(String input) {
		StringBuilder sb = new StringBuilder(input);
		String result = sb.reverse().toString();
		System.out.println(result);
	}


}
