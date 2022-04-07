package InnerClass;

class OuterClasses {
	  int x = 10;

	  class InnerClass {
	    public int myInnerMethod() {
	      return x;
	    }
	  }
	}

	public class staticclass {
	  public static void main(String[] args) {
		  OuterClasses myOuter = new OuterClasses();
		  OuterClasses.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.myInnerMethod());
	  }
	}