package day6;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort1 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int x = ran.nextInt(20)+1;
		int arr[] = new int[x];

			for(int i=0; i<arr.length; i++) {
				int random = ran.nextInt(100)+1;
				arr[i]=random;
			}
		System.out.println(Arrays.toString(arr));
		
		for(int j=1; j<arr.length; j++) {
			for(int i=0; i<arr.length-j; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					}
				}
		
		}
				
			//2회차에서는 i+=1;한 상태로, arr.length-2인상태로
		
		System.out.println(Arrays.toString(arr));
		}

}


