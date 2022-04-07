package inheritance;
class Address {
	String city, state, country;
	Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
}
class Employee {
	int EmployeeId;
	String employename;
	Address add;
	Employee(int EmployeeId, String employename, Address add) {
		this.EmployeeId = EmployeeId;
		this.employename = employename;
		this.add = add;
	}
	void GetInfo() {
		System.out.println("Employeeid is " +EmployeeId);
		System.out.println("Employee name is " +employename);
		System.out.println("employee city is "+ add.city);
		System.out.println("employee state is "+ add.state);
		System.out.println("employee country is "+ add.country);
		
	}
	
}

public class AggregationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address = new Address("lalitpr", "bagmati", "nepal");
		Employee empl = new Employee(123, "jiwan", address);
		empl.GetInfo();

	}

}
