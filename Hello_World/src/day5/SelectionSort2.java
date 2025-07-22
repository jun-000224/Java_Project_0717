package day5;

import java.util.Arrays;

public class SelectionSort2 {

	public static void main(String[] args) {	
	
		int arr[] = {3,4,1,5,2};
		
		for(int j=0; j<arr.length; j++) {
			int minIndex = j;
			for(int i=j+1; i<arr.length; i++) {
				if(arr[i]<arr[minIndex]) {
					minIndex = i;
				}
			}
			int temp = arr[j];
			arr[j]=arr[minIndex];
			arr[minIndex]=temp;
			System.out.println(Arrays.toString(arr));
			}
		}
		
	}		