package numbers;

import java.util.Scanner;

public class PyramidOfAsterisk {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number to display the pyramid of *: ");
		String enteredNumber = userInput.nextLine();
		int numberEntered = Integer.parseInt(enteredNumber);

		for (int count1 = numberEntered; count1 >= 1; count1--) {
			for (int count2 = 1; count2 <= count1; count2++) {

				System.out.print("*");

			}
			System.out.print("\n");
		}

	}

}
