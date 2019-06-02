package numbers;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		short entersequence;
		System.out.println("Enter a number to see the factorial: ");
		entersequence = userInput();
		short sequence = (short) Integer.parseInt(entersequence);
		int length = entersequence.length();
		int factorialOne = 0;

		do {
			factorialOne = sequence(length);

			length--;

		} while (length == 0);

		System.out.println("The factorial of the entered number is " + factorialOne);
	}

	private static short userInput() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int sequence(int length) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int entersequence(int length) {
		// TODO Auto-generated method stub
		return 0;
	}
}
