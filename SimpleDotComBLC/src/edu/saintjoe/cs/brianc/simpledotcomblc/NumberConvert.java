package edu.saintjoe.cs.brianc.simpledotcomblc;

public class NumberConvert {

	public static void main(String[] args) {
		// Let's make a string
		String stringOne = "22";
		String stringTwo = "22";
		// Here is the binary number we will store it in
		int inputValue = 0;
		int value2 = 0;
		inputValue = Integer.parseInt(stringOne);
		value2 = Integer.parseInt(stringTwo);
		
		// Note adding two strings together is called "catenation" 
		System.out.println(inputValue + value2);
		
		// Adding two numbers together is called "addition" :-)
		System.out.println(stringOne + stringTwo);
	}

}
