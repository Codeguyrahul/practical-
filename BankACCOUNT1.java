package polymorphism;

 interface BankACCOUNT1 {
   void deposit();
   void withdraw();
}

class cHECKING_aCCOUNT1 implements BankACCOUNT1{
	public  void deposit() {
		 System.out.println("successful deposit");
	 }
	public void withdraw() {
		System.out.println(" enter the vaild amount");
	}
	public static void main(String[] args) {
		cHECKING_aCCOUNT1 obj =new cHECKING_aCCOUNT1();
		obj.deposit();
		obj.withdraw();
	}
	 
}
