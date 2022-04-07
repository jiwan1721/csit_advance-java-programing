package concurrncy;

class BscCsitBookSeat{
	static int csit_seats = 48;
	 static synchronized public void bookseat(int seats) {
		if(csit_seats>=seats) {
			System.out.println(seats+"seats books sucessfully");
			csit_seats = csit_seats - seats;
			System.out.println(csit_seats+" sets are available");
		}else {
			System.out.println(seats+" seats are not available");
			System.out.println(csit_seats+" seats are available");
		}
	}
}
class thread1 extends Thread{
	BscCsitBookSeat bbSeat;//instance reference
	int seats;
	
	public thread1(BscCsitBookSeat bbSeat,int seats) {
		this.bbSeat = bbSeat;//instance reference initialize
		this.seats = seats;
		//TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		bbSeat.bookseat(seats);
	}
}
class thread2 extends Thread{
	BscCsitBookSeat bbSeat;
	int seats;
	
	public thread2 (BscCsitBookSeat bbSeat,int seats) {
		this.bbSeat = bbSeat;
		this.seats = seats;
		//TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		bbSeat.bookseat(seats);
	}
}

public class newSyn {
	public static void main(String[] args) {
		BscCsitBookSeat bbSeat1 = new BscCsitBookSeat();
		thread1 t1 = new thread1(bbSeat1, 5);
		t1.start();
		
		BscCsitBookSeat bbSeat2 = new BscCsitBookSeat();
		thread1 t2 = new thread1(bbSeat2, 20);
		t2.start();
		
		BscCsitBookSeat bbSeat3 = new BscCsitBookSeat();
		thread1 t3 = new thread1(bbSeat3, 30);
		t3.start();
		
	}

}
