package com.programs.test;

public class TestString {
	
	public static void main(String[] args) {

		removeCharFromString("abcbcdjfkd", 'c');
		countNumberOfWords("Currently we are attending Java FullStack Training Class");
		countNumberOfWords("");

	}
	
	
	
	private static void removeCharFromString(String input, char c) {
		String result = input.replaceAll(String.valueOf(c), "");
		System.out.println(result);
	}
	
	private static void countNumberOfWords(String line) {
	
		
		String trimmedLine = line.trim();
		String[] result = trimmedLine.split("\\s");
		
		for (int x=0; x<result.length; x++) {
			  System.out.println(result[x].toString());
			}
			int count = trimmedLine.isEmpty() ? 0 : trimmedLine.split("\\s+").length; 
		//The string \s is a regular expression 
		
	System.out.println(count);
	}



}
