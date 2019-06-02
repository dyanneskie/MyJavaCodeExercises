package aso;

public class Puppy {
	public int puppyAge;

	public String name;

	public Puppy(String name) {
		// This constructor has one parameter, name.
		this.name = name;
		System.out.println("Name chosen is :" + name);
	}

	public void setAge(int age) {
		if (age < 0)
			puppyAge = 0;
		else
			puppyAge = age;
	}

	public int getAge (){
		System.out.println("Puppy's age is :" + puppyAge);
		
		return puppyAge;
	}

	public static void main(String[] args) {
		int futureAge = 0;
		/* Object creation */
		Puppy myPuppy = new Puppy("tommy");

		/* Call class method to set puppy's age */
		myPuppy.setAge(5);

		/* Call another class method to get puppy's age */
		futureAge = myPuppy.getAge() + 5;
		System.out.println("Puppys future age 5 years from now  :" + futureAge);
		/* You can access instance variable as follows as well */
		System.out.println("Variable Value :" + myPuppy.puppyAge);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
