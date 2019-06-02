package numbers;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter a string to reverse: ");
		String enteredString = userInput.nextLine();

		StringBuilder reverseBuilder = new StringBuilder();
		//System.out.println(reverseBuilder.hashCode());

		// append a string into StringBuilder input1
		reverseBuilder.append(enteredString);

		String reversedString = reverseBuilder.reverse().toString();

		// print reversed String
		System.out.println("Reversed format: " + reversedString);

		String palindromMessage = "palindrome";
		if (!enteredString.equals(reversedString)) {
			palindromMessage = "not palindrome.";
		}

		System.out.println("The string entered is " + palindromMessage);
		userInput.close();

	}

}
