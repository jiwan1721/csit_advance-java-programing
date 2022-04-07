package inheritance;


class Animal {
	int legs = 4;
	void eat() {
		System.out.println("eating");
	}
	
}
class Dog extends Animal {
	void bark() {
		System.out.println("barking.....");
	}
	
}
class cat extends Animal {
	void meow() {
		System.out.println("meowing...");
	}
}

public class Hierarchialinheritance {
	public static void main(String[] args) {
		cat c = new cat();
		c.meow();
		c.eat();
		System.out.println("cat have " + c.legs + " legs");
		//c.bark();
		Dog d = new Dog();
		d.bark();
		d.eat();
		System.out.println("dog have "+d.legs+ " legs");
		
		
	}

}
