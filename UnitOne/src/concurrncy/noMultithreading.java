package concurrncy;


class Good{
	void display() {
		for(int i = 0; i<5;i++) { //time to execute = 5 sec
			System.out.println("good");
			try {
				Thread.sleep(1000); //1000 milliseconds = 1 second
			} catch(Exception e) {
				
			}
		}
	}
}
class Morning{
	void display() {
		for(int i = 0; i<5;i++) { //time to execute = 5 sec
			System.out.println("morning");
			try {
				Thread.sleep(1000); //1000 milliseconds = 1 second
			} catch(Exception e) {
				
			}
		}
	}
}

public class noMultithreading {
	public static void main(String[] args) {
		Good good = new Good();
		Morning morning = new Morning();
		good.display(); //execute huna 5 sec lagxa.
		morning.display();//"      "   "   "    "
		//total execution time 10 sec.
	}

}
