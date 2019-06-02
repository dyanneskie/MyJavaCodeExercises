package clientPuppyAbstract;

import mainPuppyAbstract.*;

public class RunnerPuppyAbstract {

	public static void main(String[] args) {
		PuppyAbstract puppy3 = new PuppyBunny();
		PuppyAbstract puppy4 = new PuppyQueenie();

		puppy3.ownersPuppyName();
		puppy3.puppyName();
		puppy3.puppyAge();
		puppy4.puppyName();
		puppy4.puppyAge();

	}

}
