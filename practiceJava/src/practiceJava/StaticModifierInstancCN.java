package practiceJava;

public class StaticModifierInstancCN {
	private static int number = 5;
	protected static int getCount(){
		return number;
		
	}
	private static void addnumIns() {
		number++;
	}
	public StaticModifierInstancCN() {
		StaticModifierInstancCN.addnumIns();
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		System.out.println("SUURU garerw " + StaticModifierInstancCN.getCount() + " instances");
		
		for (int i = 0; i < 600; ++i) {
			new StaticModifierInstancCN();
		}
		System.out.println("Created " + StaticModifierInstancCN.getCount() +" instances");
	}

}
