package cognizant.shapes;

 class Batch{
	int id;
	String name;
  double fees;
	Batch(int id,String name, double fees){
		this.fees=fees;
		this.id=id;
		this.name=name;
	}

}
class BatchMember extends Batch{
	long phone_no;
	BatchMember(int id ,String name, double fees,long phone_no){
		super(id   ,  name,  fees);
		this.phone_no=phone_no;  
	}

	void show() {
		System.out.println(id+" "+ name+" "+fees+" "+ phone_no);
	}
	
}
class Delhi_Batch{
	public static void main(String[] args) {
		BatchMember obj =new BatchMember(1," pinki",1500.00,12345);
		obj.show();
		
	}
}
