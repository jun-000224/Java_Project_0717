package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		//사용자로부터 배열의 크기를 입력받아서 생성, 배열 내의 값은 1부터 배열 크기까지
		
		Scanner s = new Scanner(System.in);
		
		
		int size=0;
		
		while(true) {
			System.out.print("숫자 하나를 입력하세요 : ");
			int input = s.nextInt();
			if(input <= 0) {
				System.out.println("1이상의 숫자를 입력해주세요.");
			} else {
				size = input;
				break;
			}
		}
		
		int arr[] = new int[size];
		for(int i = 0; i<size; i++) {
			arr[i-1]=i;
		}
		System.out.println(Arrays.toString(arr));
	}
}
