package aso;

public class Person {
	private String name;
	private Address address;
	private String mobileNumber;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String ownerName) {
		name = ownerName;
		System.out.println("Owner's name is " + name + ".");
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mNumber) {
		this.mobileNumber = mNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int ownerAge) {
		if (ownerAge < 0)
		age = 0;	
		else
		age = ownerAge;
	}

	
}

