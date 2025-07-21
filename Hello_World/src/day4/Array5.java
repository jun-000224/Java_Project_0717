package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		//6개의 공간을 가지는 배열을 만들어서 랜덤1~45 넣기
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		int arr[] = new int[6];
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			count++;
			arr[i]=ran.nextInt(45)+1;
				for(int j=0; j<=i-1; j++ ) {
					if(arr[i]==arr[j]) {
						i-=1;
						break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
