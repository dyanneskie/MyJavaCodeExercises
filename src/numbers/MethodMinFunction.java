package numbers;

public class MethodMinFunction {

	public static void main(String[] args) {
		int a = 21;
		int b = 18;
		int c = minFunction(a, b);

		/** returns the minimum of two numbers */
		System.out.println("\nMinimum Value = " + c);

		/** The void Keyword */
		methodRankPoints(100.5);

		/** Passing Parameters by Value */
		System.out.println("\nBefore swapping, a = " + a + " and b = " + b);

		// Invoke the swap method
		swapFunction(a, b);
		System.out.println("\n**Now, Before and After swapping values will be same here**:");
		System.out.println("After swapping, a = " + a + " and b is " + b);
	}

	/** returns the minimum of two numbers */
	public static int minFunction(int n1, int n2) {
		int min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;

		return min;
	}

	/** The void Keyword */
	public static void methodRankPoints(double points) {
		if (points >= 202.5) {
			System.out.println("\nRank:A1");
		} else if (points >= 122.4) {
			System.out.println("\nRank:A2");
		} else {
			System.out.println("\nRank:A3");
		}
	}

	/** Passing Parameters by Value */
	public static void swapFunction(int a, int b) {
		System.out.println("\nBefore swapping(Inside), a = " + a + " b = " + b);

		// Swap n1 with n2
		int c = a;
		a = b;
		b = c;
		System.out.println("After swapping(Inside), a = " + a + " b = " + b);

	}
}