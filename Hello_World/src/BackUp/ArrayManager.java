package BackUp;

import java.util.Arrays;
import java.util.Random;

public class ArrayManager {
	
	public static int second(int[] arr) {
		
		Arrays.sort(arr);
		
		return arr[arr.length-2];
	}
	
	
	
	public static int[] ranArr() {
		Random ran = new Random();
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			int random = ran.nextInt(30)+1;
			if(random%2!=0) {
				arr[i]=random;
			}else {
				i--;
			}
		}
		
		return arr;
	}

}
