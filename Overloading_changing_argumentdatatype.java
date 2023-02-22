package cognizant.shapes;

public class Overloading_changing_argumentdatatype {

	static int sum(int a, int b) {//integer type argument
		return a+b;
	}
	static double sum (double a,double b) {//double type argument
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(Overloading_changing_argumentdatatype.sum(5,6));
        System.out.println(Overloading_changing_argumentdatatype.sum(2.5, 5.7));
	}
}
