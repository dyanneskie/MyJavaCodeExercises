package numbers;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		String entersequence = " ";
		System.out.println("Enter a fibonacci sequence: ");
		entersequence = user_input.nextLine();
		int sequence = Integer.parseInt(entersequence);
		System.out.println("The fibonacci sequence is: " + sequence);

		int x1 = 0;
		int x3;
		int x4 = 1;
		int x5 = 0;
	
		for (x1 = 1; x1 <= sequence; x1 = x1 + 1) {
			
			x3 = x4;
			x4 = x5;
			x5 = x3 + x4;

			System.out.print("Fibonacci sequence are : " + x1 + " " + x5);
			System.out.print("\n");

		}

	}

}