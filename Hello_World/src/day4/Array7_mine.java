package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array7_mine {

	public static void main(String[] args) {
		//사용자로부터 배열의 크기를 입력받아서 생성, 배열 내의 값은 랜덤 생성 후 오름차순
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();

		
		System.out.print("배열의 크기를 입력하세요 : ");
		int input = s.nextInt();
		int arr[] = new int[input];
		
		for(int i=1; i<=input; i++) {
			int random = ran.nextInt(10)+1;
			arr[i-1]=random;	
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
