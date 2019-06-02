package string;

import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String enterstring = " ";

		System.out.println("Enter a string: ");
		enterstring = userInput.nextLine();

		// String replaceString = enterstring.replace('a','e');
		String replaceString = enterstring.replaceAll("[aeiouAEIOU]", "");
		System.out.println("");
		System.out.println("All vowels are removed successfully.");
		System.out.println(replaceString);
	}

}
