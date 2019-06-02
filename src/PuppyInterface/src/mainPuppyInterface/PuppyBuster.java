package mainPuppyInterface;
//functionality_1
public class PuppyBuster implements PuppyInterface {
	@Override
	public void ownersPuppyName() {
		System.out.println("Owner's Name: Dyanne");
	}
	@Override
	public void puppyName() {
		System.out.println("Puppy's Name: Buster");
	}
	@Override
	public void puppyAge() {
		System.out.println("Puppy's Age: 1");
	}
}
