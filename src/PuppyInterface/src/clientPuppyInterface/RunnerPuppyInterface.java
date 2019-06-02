package clientPuppyInterface;

import mainPuppyInterface.*;
//runner
public class RunnerPuppyInterface {

	public static void main(String[] args) {
		PuppyInterface puppy1 = new PuppyBrownie();
		PuppyInterface puppy2 = new PuppyBuster();

		puppy1.ownersPuppyName();
		puppy1.puppyName();
		puppy1.puppyAge();

		System.out.println("");

		puppy2.ownersPuppyName();
		puppy2.puppyName();
		puppy2.puppyAge();
	}
}
