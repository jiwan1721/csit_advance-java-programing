package packageTwo;


public class DerivedDifferentPackage extends packageOne.ProtectionLevel {
	public DerivedDifferentPackage() {
		System.out.println("Derived class different package accessibility");
		//System.out.println("Default value: " +defaultnumber);
		//System.out.println("Default value: " +privatenumber);
		System.out.println("Default value: " +protectednumber);
		System.out.println("Default value: " +publicnumber);
	}
	public static void main(String[] args) {
		new DerivedDifferentPackage();
		
	}

}
