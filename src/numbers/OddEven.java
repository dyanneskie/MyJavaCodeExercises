package numbers;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		int enteredNumber;
		System.out.print("Enter a valid number: ");
		enteredNumber = user_input.nextInt();
		int divisor = enteredNumber % 2;
		String finalNumber = " ";
		if (divisor == 0) {
			finalNumber = "even";
		} else {
			finalNumber = "odd";
		}

		System.out.println("The number entered is " + finalNumber + ".");
	}

}
