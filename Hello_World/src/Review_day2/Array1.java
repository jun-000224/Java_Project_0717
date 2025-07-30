
package Review_day2;

import java.util.Arrays;

public class Array1 {
	
//	static void minusArr(int[] arr) {
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = -arr[i];
//		}
	

	public static void main(String[] args) {
		
		int arr[] = {5,8,2,6,10,4};
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
//		for(int i = 0; i < (arr.length/2); i++) {
//			int backup = arr[i];
//			arr[i]=arr[arr.length-(i+1)];
//			arr[arr.length-(i+1)] = backup;
//		}
		
		ArrayFunc.minusArr(arr);
		System.out.println(Arrays.toString(arr));
		
		int max = ArrayFunc.max(arr);
		System.out.println(max);
		
		
	}

}
