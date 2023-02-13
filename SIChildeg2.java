package inheritance;
class SIParenteg2{
	int salary=30000;
}

public class SIChildeg2  extends SIParenteg2 {
	int bonus=1500;
	int annualsal=salary+bonus;
	public static void main(String[] args) {
		 SIChildeg2 object=new  SIChildeg2();
		 System.out.println("salary is:"+ object.salary);
		 System.out.println("Annual salary is:"+ object.annualsal);
	}

}
