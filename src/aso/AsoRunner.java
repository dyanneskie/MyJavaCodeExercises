package aso;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class AsoRunner {
	public static void main(String[] args) {
		Person myOwner = new Person();
		myOwner.setName("Dyanne");
//		System.out.println("Owner's name is " + myOwner.getName() + ".");

		Address address = new Address();
		address.setAddress1("Simei St 1");
		Address block = new Address();
		block.setBlockNumber("Block 137");
		System.out.println("Owner's address: " + block.getBlockNumber() + " " + address.getAddress1());

		myOwner.setMobileNumber("+6596674135");
		System.out.println("Mobile Number: " + myOwner.getMobileNumber());

		myOwner.setAge(36);
		System.out.println("Age: " + myOwner.getAge());
		
		
		
		
/*		Puppy myTuta = new Puppy("tommy");
		Puppy myTutaAge = new Puppy("2");*/
		
		
//System.out.println("Puppy: " + myTuta.getName());
	
		/* BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\Workspace\\samplefile1.txt"));
		    writer.write(myOwner);
		    writer.close();*/
	}
}
  
