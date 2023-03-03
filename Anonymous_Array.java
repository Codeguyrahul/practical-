package Array;
// no need to declare the array inside the method
public class Anonymous_Array {
	static void print(int arr[]) {
		
		for( int i =1 ;i<arr.length;i++)
	
		System.out.println(arr[i]);
	}
	public static void main(String args[]) {
		
		print(new int[] {10,20,30,40,50,5});//paasing anonymous array to method
	}

}
