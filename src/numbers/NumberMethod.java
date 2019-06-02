package numbers;

public class NumberMethod {

	public static void main(String[] args) {
/*///*	compareTo():
//	    If the Integer is equal to the argument then 0 is returned.
//	    If the Integer is less than the argument then -1 is returned.
//	    If the Integer is greater than the argument then 1 is returned.
/*/
		Integer x1 = 5;
		
		System.out.println("compare To:");	
		System.out.println(x1.compareTo(3));
		System.out.println(x1.compareTo(5));
		System.out.println(x1.compareTo(8));
/*		
		equals()
		Determines whether this number object is equal to the argument.
*/
	      Integer x2 = 5;
	      Integer y = 10;
	      Integer z =5;
	      Short a = 5;
	      
	      System.out.println("");
	      System.out.println(".Equals:");	
	      System.out.println(!x2.equals(y));  
	      System.out.println(x2.equals(y));  
	      System.out.println(x2.equals(z)); 
	      System.out.println(x2.equals(a));
	      
//	      abs()
//	      Description: The method gives the absolute value of the argument. 
//	      The argument can be int, float, long, double, short, byte.
	      
	      Integer a1 = -8;
	      double d = -100.88;
	      float f = -90;
	      
	      System.out.println("");
	      System.out.println("Math.abs");
	      System.out.println(Math.abs(a1));
	      System.out.println(Math.abs(d));     
	      System.out.println(Math.abs(f));   
	      
//	      ceil()
//	      Returns the smallest integer that is greater than or equal to the argument. Returned as a double.
	      
//	      floor()
//	      Returns the largest integer that is less than or equal to the argument. Returned as a double.
	      
	      double d1 = -100.675;
	      float f1 = -80;    

	      System.out.println("");
	      System.out.println("Math.ceil");
	      System.out.println(Math.ceil(d1));
	      System.out.println(Math.ceil(f1)); 

	      System.out.println(Math.floor(d1));
	      System.out.println(Math.floor(f1)); 
	      
//	      rint()
//	      Returns the integer that is closest in value to the argument. Returned as a double..
	      
	      double d11 = 100.675;
	      double e = 100.500;
	      double f11 = 100.200;
	      
	      System.out.println("");
	      System.out.println("Math.rint");
	      System.out.println(Math.rint(d11));
	      System.out.println(Math.rint(e)); 
	      System.out.println(Math.rint(f11)); 
	      
//	      round()
//	      Returns the closest long or int, as indicated by the method's return type to the argument.
	      
	      double d12 = 100.675;
	      double e1 = 100.500;
	      float f12 = 100;
	      float g = 90.552f;
	      System.out.println("");
	      System.out.println("Math.round");
	      System.out.println(Math.round(d12));
	      System.out.println(Math.round(e1)); 
	      System.out.println(Math.round(f12)); 
	      System.out.println(Math.round(g)); 
	      
//	      min()
//	      Returns the smaller of the two arguments.
	      
	      System.out.println("");
	      System.out.println("Math.min");
	      System.out.println(Math.min(12.123, 12.456));      
	      System.out.println(Math.min(23.12, 23.0));  
	      
//	      max()
//	      Returns the larger of the two arguments..
	      
	      System.out.println("");
	      System.out.println("Math.max");
	      System.out.println(Math.max(12.123, 12.456));      
	      System.out.println(Math.max(23.12, 23.0)); 
	      
//	      exp()
//	      Returns the base of the natural logarithms, e, to the power of the argument.
//	      
	      double x = 11.635;
	      double y1 = 2.76;
	      
	      System.out.println("");
	      System.out.println("Math.exp");
	      System.out.printf("The value of e is %.4f%n", Math.E);
	      System.out.printf("exp(%.3f) is %.3f%n", x, Math.exp(2));  
	      System.out.printf("pow(%.3f, %.3f) is %.3f%n", x, y1, Math.pow(x, y1));
	      System.out.printf("sqrt(%.3f) is %.3f%n", x, Math.sqrt(x));
	      System.out.println( Math.random() );
	}
}
