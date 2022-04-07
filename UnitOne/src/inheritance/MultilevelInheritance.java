package inheritance;
abstract class car {  //abstract le car class ko object banauna didaiinw
	//abstract garnu vaneko class laii hide garnu ho
	int numofWheels = 4;
	car() { //constructor
		System.out.println("Classic car");
	}
	public void typecar() {
		System.out.println("type of vehical is : car");
	}
}
abstract class Maruti extends car { //derived level 1
	Maruti() {
		System.out.println("i am a maruti car");
	}
	public void brand() {
		System.out.println("Brand name : Maruti");
	}
	public void speed() {
		System.out.println("Maximum speed: 123kmph");
	}
}
class Maruti500 extends Maruti { //derived level2
	public Maruti500() {
		System.out.println("I am a class Maruti500");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void speed() {
		System.out.println("Maximum speed: 120kmph");
	}
}
public class MultilevelInheritance {
	public static void main(String[] args) {
		Maruti500 car = new Maruti500();
		car.typecar();
		car.brand();
		System.out.println(car.numofWheels);
		car.speed();
	}

}
