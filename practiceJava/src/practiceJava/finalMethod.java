package practiceJava;
class PersonalLoan{
	 public final String getName(){
	     return "personal loan";
	 }
	}
	class CheapPersonalLoan extends PersonalLoan{
	    @Override
	    public final String getName(){
	        return "cheap personal loan"; //compilation error: overridden method is final
	    }
	}
public class finalMethod {
	private

}
