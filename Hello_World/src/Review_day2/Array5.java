package Review_day2;

import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = ArrayFunc.randomArr(10, 1, 30);
		System.out.println(Arrays.toString(arr));
		
		int oddSize = ArrayFunc.arrLength(arr, "odd");
		int evenSize = ArrayFunc.arrLength(arr, "even");
		
		
		int oddArr[] = ArrayFunc.returnArr(arr, "odd", oddSize);
		// 홀수들만 담긴 배열을 리턴
		int oddArr2[] = ArrayFunc.returnArr(arr, "odd");
		// 홀수들만 담긴 배열을 리턴
		
	}
}