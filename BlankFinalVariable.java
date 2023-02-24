package cognizant.shapes;

public class BlankFinalVariable {
	
	final int value;// blank initialization of final variable
	BlankFinalVariable(){//default construct
		value =70;
		System.out.println(value);
		// we can't change the value of final variable 
		// compile time error
	}
	public static void main(String[] args) {
		BlankFinalVariable fv= new BlankFinalVariable();
	}

}
