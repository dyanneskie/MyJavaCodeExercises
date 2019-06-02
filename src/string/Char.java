package string;

public class Char {

	public static void main(String[] args) {
		// \' Inserts a single quote character in the text at this point.
		// \" Inserts a single quote character in the text at this point.
		System.out.println("\n---CHAR---");
	      System.out.println("She said \"Hello!\" to me.");
	      System.out.println("She said \'Hi!\' to me.");
	      System.out.println("She said \\Hello! to me.");
	      System.out.println("She said \rHi! to me.");
	      System.out.println("He said \nHello! to me.");
	      System.out.println("She said \tHi! to me.");
	      System.out.println(Character.toLowerCase('D'));
	      System.out.println(Character.toUpperCase('d'));
	      System.out.println(Character.isDigit('d'));
	      System.out.println(Character.isDigit('5'));
	      
	      System.out.println("\n---STRING---");
	      String string1 = "saw -to-hello ";
	      System.out.println("Dyanne " + string1 + "Alvin");
	      System.out.println( "String Length is : " + string1.length());
	      char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
	      String helloString = new String(helloArray);  
	      System.out.println( helloString );
	      System.out.println( helloString.copyValueOf(helloArray, 1,4) );
	      
	      String Str = new String("Welcome-to-Tutorialspoint.com");
	      System.out.println("Return Value :" );      
	      
	      for (String retval: Str.split("-")) {
	         System.out.println(retval);
	      }
	}

}
