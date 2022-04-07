package inheritance;
class BaseSuperParent {
	float salary = 50000.00f;
	
	
}

public class ConceptOfInheritance extends BaseSuperParent {
	int bonus = 20000;
	public static void main(String[] args) {
		ConceptOfInheritance obj = new ConceptOfInheritance();
		System.out.println("my salary " + obj.salary);
		
	}

}
