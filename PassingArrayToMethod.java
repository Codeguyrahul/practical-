package Array;

public class PassingArrayToMethod {
	//creating a method which p[ass an array as a parameters
	static void maximumNo(int array[]) {//method name maximumNO
		int max= array[0];
		for(int i=1;i<array.length;i++) 
			if(max<array[i])
				max=array[i];
		System.out.println(max);
		
	}
	static void minimumNo(int array[]) {//method name minimumNO
		int min= array[0];
		for(int i=1;i<array.length;i++) 
			if(min>array[i])
				min=array[i];
		System.out.println(min);
	}
	public static void main(String[] args) {
		//declearing & initilising array
		// 
		int a[]= {5,7,9,2,10};
		maximumNo(a);// passing array to a method max
		minimumNo(a);//passing array to a method min
	}
}
