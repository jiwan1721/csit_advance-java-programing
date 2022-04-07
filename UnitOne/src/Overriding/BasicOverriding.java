package Overriding;


class parent {
	void getParent(){
		System.out.println("parents show");
	}
}
class child extends parent {
	@Override
	void getParent() {
		System.out.println("childs show");
		
	}
}

public class BasicOverriding {
	public static void main(String[] args) {
		parent objParent = new parent();
		objParent.getParent();
		parent obj2 = new child();
		obj2.getParent();
	}

}
