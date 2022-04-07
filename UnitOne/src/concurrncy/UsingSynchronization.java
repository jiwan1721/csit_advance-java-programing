package concurrncy;
class CSITBookSeatSycn {
	int csit_Seats = 48;

	synchronized public void bookSeat(int seats) {//Synchronized method
		System.out.println("i m also synchrnoized: " + Thread.currentThread().getName());
		System.out.println("i m also synchrnoized: " + Thread.currentThread().getName());
		System.out.println("i m also synchrnoized: " + Thread.currentThread().getName());
		System.out.println("i m also synchrnoized: " + Thread.currentThread().getName());
		System.out.println("i m also synchrnoized: " + Thread.currentThread().getName());
		if (csit_Seats >= seats) {
			System.out.println(seats + " booked sucessfully");
			csit_Seats = csit_Seats - seats;
			System.out.println(csit_Seats+"seats are available");
		}
		else {
			System.out.println(seats+" seats are not  available");
			System.out.println(csit_Seats+" seats are available");
		}
	}
}

public class UsingSynchronization extends Thread{
	static CSITBookSeatSycn CsitBookSeat; //refernce of class
	int seats;//mathi ko seats ra yo seats different ho
	@Override
	public void run(){
		CsitBookSeat.bookSeat(seats);//starting Thread means we are calling bookseat Method.
	}
	public static void main(String[] args) {
		CsitBookSeat = new CSITBookSeatSycn();//object of class
		UsingSynchronization ws1 = new UsingSynchronization();
		ws1.seats = 30;//seats ma input deko
		ws1.start();
		
		
		UsingSynchronization ws2 = new UsingSynchronization();
		ws2.seats = 20;
		ws2.start();
		
	}

	

}
