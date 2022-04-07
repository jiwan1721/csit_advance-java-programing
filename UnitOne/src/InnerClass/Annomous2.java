package InnerClass;

interface Age {
	int x = 43;

	void getAge();

}

public class Annomous2 {
	public static void main(String[] args)
	{
Age object = new Age() {
	public void getAge() {
		System.out.println("Age is "+x);
	}
};
object.getAge();
}
}
