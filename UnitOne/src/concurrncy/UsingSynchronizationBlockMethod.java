package concurrncy;
class CsitBookSeatBlock {
	int csit_Seats = 48;

	public void bookSeat(int seats) {
		synchronized (this ) {
		if (csit_Seats >= seats) {
			System.out.println(seats + " booked sucessfully");
			csit_Seats = csit_Seats - seats;
			System.out.println(csit_Seats+"seats are available");
		}
		else {
			System.out.println(" seats are not  available");
			System.out.println(csit_Seats+" seats are available");
		}
	}
	}
}
public class UsingSynchronizationBlockMethod extends Thread {
	static CsitBookSeatBlock csitBookSeat; //refernce of class
	int seats;//mathi ko seats ra yo seats different ho
	@Override
	public void run() {
		csitBookSeat.bookSeat(seats);//starting Thread means we are calling bookseat Method.
	}
	public static void main(String[] args) {
		csitBookSeat = new CsitBookSeatBlock();//object of class
		UsingSynchronizationBlockMethod usb = new UsingSynchronizationBlockMethod();
		usb.seats = 30;//seats ma input deko
		usb.start();
		System.out.println("i m also synchrnoized: " + Thread.currentThread().getName());
		System.out.println("i m also synchrnoized: " + Thread.currentThread().getName());
		System.out.println("i m also synchrnoized: " + Thread.currentThread().getName());
		System.out.println("i m also synchrnoized: " + Thread.currentThread().getName());
		System.out.println("i m also synchrnoized: " + Thread.currentThread().getName());
		
		
		UsingSynchronizationBlockMethod ws2 = new UsingSynchronizationBlockMethod();
		ws2.seats = 20;
		ws2.start();
		
	}

}

