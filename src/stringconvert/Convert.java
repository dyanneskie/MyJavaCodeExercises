package stringconvert;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String floatString = "34.75";
		float floatValue = Float.parseFloat(floatString);
		int intValue = (int) floatValue; //Integer.parseInt(floatString);
		System.out.println(intValue);
	}

}
