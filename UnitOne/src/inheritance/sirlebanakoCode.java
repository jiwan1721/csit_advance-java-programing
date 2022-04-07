package inheritance;

class Room {
	int length, breadth;// instance variable

	public Room(int length, int breadth) {// constructor local var
		this.length = length;// local variable assigned to instance var
		this.breadth = breadth;// local variable assigned to instance var
	}

	int roomArea() {// return type method
		return length * breadth;
	}
}

public class sirlebanakoCode extends Room {
	int height;//instance variale

	public sirlebanakoCode(int length, int breadth, int height) {
		
super(length, breadth);
		this.height = height;
	}

	int roomVolume() {
		return length * breadth * height;
	}

	public static void main(String[] args) {
		sirlebanakoCode broom = new sirlebanakoCode(22, 12, 23);
		System.out.println("volume is: " +broom.roomVolume());
		System.out.println("Area is: " +broom.roomArea());
	}
}
