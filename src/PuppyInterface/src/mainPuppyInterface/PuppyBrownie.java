package mainPuppyInterface;
//functionality_2
public class PuppyBrownie implements PuppyInterface {
	@Override
	public void ownersPuppyName() {
		System.out.println("Owner's Name: Alvin");
	}
	@Override
	public void puppyName() {
		System.out.println("Puppy's Name: Brownie");
	}
	@Override
	public void puppyAge() {
		System.out.println("Puppy's Age: 2");
	}
}
