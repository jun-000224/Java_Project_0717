package day4;

import java.util.Arrays;
import java.util.Random;

public class Array6 {

	public static void main(String[] args) {
		//가장 작은 값의 위치도 찾기
		//가장 큰 값과 작은 값의 위치를 바꾸기
		int arr[] = {1, 5, 25, 10, 3};
		int arr2[] = new int[6]; //arr2는 배열공간이 6개
		Random ran = new Random();
		int ran_number = ran.nextInt(99); // 0~98까지의 수
		
		int maxindex = 0;
		int minindex =0;
		int copy = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>arr[maxindex]) {
				maxindex = i;
			}		
			
			if(arr[i]<arr[minindex]) {
				minindex = i;
			}	
		}
		System.out.println((maxindex+1) + "번 째의 수가 가장 큽니다.");
		System.out.println((minindex+1) + "번 째의 수가 가장 작습니다.");
		
		copy = arr[maxindex];
		arr[maxindex]=arr[minindex];
		arr[minindex]=copy;
		
		System.out.println("교체가 완료되었습니다.");
		System.out.println(Arrays.toString(arr));
		
	}

}
