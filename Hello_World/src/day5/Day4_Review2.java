package day5;

import java.util.Arrays;

public class Day4_Review2 {

	public static void main(String[] args) {
		int arr[] = {3,5,1,4,2};
		//가장 작은 값의 위치(index)
		//가자 작은 값의 위치를 0번으로 바꾸기
		
		int min = 0;
		int tmp = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<arr[min]){
				min = i;
			}
			
		tmp = arr[0];
		arr[0] = arr[min];
		arr[min]=tmp;
		}
		System.out.println(min+ "가 최소값의 인덱스 넘버입니다.");
		System.out.println(Arrays.toString(arr));
	
	}

}
