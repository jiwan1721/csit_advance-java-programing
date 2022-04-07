package concurrncy;
//yo program ma data inconsistency problem xa.
//so we have to use synchronization method.
import InnerClass.staticclass;

class CsitBookSeat {
	int csit_Seats = 48;

	public void bookSeat(int seats) {
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

public class withoutSynchronization extends Thread{
	static CsitBookSeat csitBookSeat; //refernce of class
	int seats;//mathi ko seats ra yo seats different ho
	@Override
	public void run() {
		csitBookSeat.bookSeat(seats);//starting Thread means we are calling bookseat Method.
	}
	public static void main(String[] args) {
		csitBookSeat = new CsitBookSeat();//object of class
		withoutSynchronization ws1 = new withoutSynchronization();
		ws1.seats = 30;//seats ma input deko
		ws1.start();
		
		
		withoutSynchronization ws2 = new withoutSynchronization();
		ws2.seats = 20;
		ws2.start();
		
	}

}
