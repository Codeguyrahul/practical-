package Array;

public class CopyArray {
public static void main(String[] args) {
	char[]copyFrom = {'a','s','d','f','g','j','h','t'};
	char[]copyTo= new char[7];
	
	System.arraycopy(copyFrom,1,copyTo, 1,5);
	
	System.out.println(String.valueOf(copyTo));
}}