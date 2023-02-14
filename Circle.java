package Inheritance2;

class AggregationEg {
int Square(int r) {
	return r*r;
}
}
public class Circle{
	AggregationEg ag;
	double Pi=3.14;
	double area(int radius) {
		AggregationEg 	ag= new AggregationEg();
		int psquare = ag.Square(radius);
		return Pi*psquare;
		
	}
	public static void main(String[] args) {
		Circle c= new Circle();
		double result = c.area(5);
		System.out.println("Area:"+result);
	}
}
