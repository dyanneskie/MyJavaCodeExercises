package string;

public class Variable {

	public static void main(String[] args) {
				/*
				 * Byte
				 * Min: -128
				 * Max: 127
				 * Default: 0
				 */
				byte byteVariable = 126;
				System.out.println("Byte Value is " + byteVariable);
				
				/*
				 * Short
				 * Min: -32,768
				 * Max: 32,767
				 * Default: 0
				 */
				short shortVariable = 13420;
				System.out.println("Short Value is " + shortVariable);
				
				/*
				 * int
				 * Min: -2,147,483,648
				 * Max: 2,147,483,647
				 * Default: 0
				 */
				int integerVariable = 1043200;
				System.out.println("Int Value is " + integerVariable);
				
				/*
				 * long
				 * Min: -2^63
				 * Max: 2^63 -1
				 * Default: 0
				 */
				long longVariable = 10002131000L;
				System.out.println("Long Value is " + longVariable);
				
				/*
				 * float
				 * Default: 0.0f
				 */
				float floatVariable = 342.0f;
				System.out.println("Float Value is " + floatVariable);
				 
				 /*
				  * double
				  * Default: 0.0d
				  */
				double doubleVariable = 60.30;
				System.out.println("Double Value is " + doubleVariable);
				 
				 /*
				  * boolean
				  * false and true
				  * Default: false
				  */
				boolean booleanVariable = false;
				System.out.println("Boolean Value is " + booleanVariable);

				 /*
				  * char
				  * Min: 0
				  * Max: 65,535
				  */
				char charVariable = 1674;
				System.out.println("Char Value is " + charVariable);
			
				 /*
				  * string
				  * Min:  
				  * Max:  
				  */
				String StringVariable = "Hello";
				System.out.println("String Value is " + StringVariable);
	}

}
