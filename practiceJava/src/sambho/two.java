package sambho;

import java.util.Random;

class calculatePrice{
	
	public static void main(String[] args) {
		Random objGenerator = new Random();
        for (int iCount = 0; iCount< 2; iCount++){
          int randomNumber = objGenerator.nextInt(100);
          System.out.println("Random No : " + randomNumber); 
         }
	}
}
