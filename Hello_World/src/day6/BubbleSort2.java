package day6;

import java.util.Arrays;

public class BubbleSort2 {

	public static void main(String[] args) {
		
		int arr[] = {3,5,1,4,2};
		
		for(int i=0; i<arr.length-1; i++) { //0~3까지 반복, 즉 4회 반복 
			
			for(int j=1; j<arr.length; j++) {
				if(arr[arr.length-j]>arr[(arr.length-j)-1]) {    //맨 뒤 인덱스와, 그 직전 인덱스 비교, 뒤의 인덱스값이 더 크다면?
					int temp = arr[arr.length-j];	 //뒤의 값을 앞에 넣어서 내림차순으로 
					arr[arr.length-j] = arr[(arr.length-j)-1];
					arr[(arr.length-j)-1] = temp;
				}
			}
			
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
