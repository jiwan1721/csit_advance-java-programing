package Overriding;

class employees {
	public static int base = 10000;
	int salary()
	{
		return base;
	}
}
class Manager extends employees {
	int salary() {
		return base + 20000;
		
	}
}
class Clerk extends employees {
	int salary()
	{
		return base + 14000;
	}
}
class Employee {
	static void GetSalary(employees e) {
		System.out.println(e.salary());
	}
	public static void main(String[] args) {
		employees obj = new Manager();
		System.out.println("Manager's salary is" );
		GetSalary(obj);
		employees obj2 = new Clerk();
		System.out.println("Clerk salary is");
		GetSalary(obj2);
		
	}

}
