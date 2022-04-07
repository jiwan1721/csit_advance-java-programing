package concurrncy;



class CSITSEATS{
	static int csit_seats = 48;
	static synchronized public void bookseat(int seats) {
		if(csit_seats>=seats) {
			System.out.println(seats+"seats books sucessfully");
			csit_seats = csit_seats - seats;
			System.out.println(csit_seats+" sets are available");
		}else {
			System.out.println(seats+" seats are not valable");
			System.out.println(csit_seats+" seats are available");
		}
	}
	
}
class Mythread1 extends Thread {
	CSITSEATS b;
	int seats;
	Mythread1(CSITSEATS b, int seats){
		this.b = b;
		this.seats = seats;
	}
	public void run() {
		b.bookseat(seats);
	}
}
class Mythread2 extends Thread{
	CSITSEATS b;
	int seats;
	public Mythread2(CSITSEATS b, int seats) {
		this.b = b;
		this.seats = seats;
	}
	public void run() {
		b.bookseat(seats);
	}
}

public class staticSynchronized {
	public static void main(String[] args) {
		CSITSEATS b1 = new CSITSEATS();
		//it works fine for single object
		Mythread1 t1 = new Mythread1(b1, 35);
		t1.start();
		
		Mythread2 t2 = new Mythread2(b1, 20);
		t2.start();
		 CSITSEATS b2 = new CSITSEATS();
		 Mythread1 t3 = new Mythread1(b2, 8);
		 t3.start();
		 
		 Mythread2 t4 = new Mythread2(b2, 18);
		 t4.start();
		
	}

}
