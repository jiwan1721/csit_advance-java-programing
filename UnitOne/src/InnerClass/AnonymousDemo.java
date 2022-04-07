package InnerClass;

interface manxekoAge {
	int x = 21;

	void getAge();
}

class AnonymousDemo {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.getAge();
	}
}

class MyClass implements manxekoAge {
	@Override

	public void getAge() {
		// TODO Auto-generated method stub
		System.out.println("Age is " + x);
	}
}
