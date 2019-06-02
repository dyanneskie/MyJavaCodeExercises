package officeOrg;

public class EmployeeTest {

	public static void main(String[] args) {
		 /* Create two objects using constructor */
	      Employee empOne = new Employee("Alvin Lange");
	      Employee empTwo = new Employee("Dyanne Deyto");

	      // Invoking methods for each object created
	      empOne.empAge(35);
	      empOne.empDesignation("Assistant Application Development Manager");
	      empOne.empSalary(10000);
	      empOne.printEmployee();
	      
	      System.out.println(" ");
	      
	      empTwo.empAge(36);
	      empTwo.empDesignation("Senior Testing Engineer");
	      empTwo.empSalary(1500);
	      empTwo.printEmployee();

	}

}
