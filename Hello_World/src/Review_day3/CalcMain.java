package Review_day3;

import Review_day2.ArrayFunc;

public class CalcMain {

	
	
	public static int max(int x, int y) {
		return x > y ? x : y;
	}
	
	public static double max(double x, double y) {
		return x > y ? x:y;
	}
	
	public static int max(int x, int y, int z) {
		int max = x > y ? x : y;
		return max > z ? max : y;
	}
	
	public static int max(int[] arr) {
		return ArrayFunc.max(arr);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = max(1,2);
		double b = max(1.5, 3.5);
		int c = max(1,3,2);
		int arr[] = {1,5,3,2,4};
		int d = max(arr);
		
		
	}

}
