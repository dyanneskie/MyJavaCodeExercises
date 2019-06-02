package string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		String enterstring = " ";
		Integer len1;
		Integer len2;

		System.out.println("Enter a string or set of number to reverse: ");
		enterstring = user_input.nextLine();

		len1 = enterstring.length();
		len2 = len1;

		do {
			len2 = len2 - 1;
			System.out.print(enterstring.charAt(len2));

		} while (len2 != 0);

	}

}
