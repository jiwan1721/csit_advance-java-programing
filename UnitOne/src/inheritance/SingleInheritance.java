package inheritance;

public class SingleInheritance {
	int length, breadth;
	public SingleInheritance(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		
	}
	int roomArea() {
		return length * breadth;
	}

}
class Bedroom extends SingleInheritance {
	int height;
	public Bedroom(int length, int breadth, int height) {
		super(length, breadth);
		this.height = height;
	}
	int roomVolume() {
		return length * breadth * height;
	}
	public static void main(String[] args) {
		Bedroom room = new Bedroom(22, 45, 34);
		System.out.println("the room volume is " + room.roomVolume());
		System.out.println("the area of room is" + room.roomArea());
	}
}
