package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//arr1안에 있는 값들의 평균값 구하기
		int arr1[] = {1,5,11,2,10};
		int sum = 0;
		
		for(int i=0; i<arr1.length; i++) {
			sum += arr1[i];
		}
		System.out.println((double)sum/arr1.length);
		
		//arr2에 값 입력받기
		int arr2[] = new int[5];
	
		
		for(int i=0; i<5; i++) {
			System.out.println("값을 입력해서 넣으시오.");
			int input = s.nextInt();
			arr2[i]=input;
		}
		System.out.println(Arrays.toString(arr2));
		
		
	}

}
