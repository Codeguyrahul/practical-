package cognizant.shapes;

class Overiding_Method {
	void run() {
		System.out.println("running mode on");
	}

}
class TestOveriding extends Overiding_Method {
	void run() {
		System.out.println("runnning mode off");
	}
	public static void main(String[] args) {
		TestOveriding a= new TestOveriding();
		a.run();
	}
}
