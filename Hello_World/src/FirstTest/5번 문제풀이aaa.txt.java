package FirstTest;

import java.util.Arrays;
import java.util.Random;

public class ArrayManager {
	
	public static int minus(int[] arr) {
		
		Arrays.sort(arr);
		int answer = arr[arr.length-1] - arr[0];
		return answer;
	}
	
	
	
	public static int[] ranArr() {
		Random ran = new Random();
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			int random = ran.nextInt(31)-15;
				arr[i]=random;
		}
		
		return arr;
	}

}



