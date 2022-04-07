package packageOne;

public class ProtectionLevel {
	int defaultnumber = 23; //default modifier
	private int privatenumber = 56;
	protected int protectednumber = 45;
	public int publicnumber = 99;
	public ProtectionLevel() {//Constructor
		// in same class all are accessible
		System.out.println("Accebility in same class");
		System.out.println("Default value: " +defaultnumber);
		System.out.println("Default value: " +privatenumber);
		System.out.println("Default value: " +protectednumber);
		System.out.println("Default value: " +publicnumber);
		
	}

	public static void main(String[] args) {
		// in same class all are accesible
		new ProtectionLevel();//object instantiate and constructor call
		
	}

}
