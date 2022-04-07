package AccessControl;

public class AccesSecondClass {

		//demonstrating default, public, private and protected modifiers
			int firstVar;// default access specifier
			public int secondVar;
			private int thirdVar;
			protected int fourthVar;
		}

		class AccessSpecifierSecondClass {

			public static void main(String[] args) {
				AccesSecondClass obj = new AccesSecondClass();
				obj.firstVar = 30;
				obj.secondVar = 40;
				//obj.thirdVar=50;//private variable not accessible in another class
				obj.fourthVar = 80;
			}
		}
