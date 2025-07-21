package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		//사용자로부터 5개의 숫자 받아서 배열로 입력
		//0 이하의 숫자를 입력할때 다시 입력하도록
		Scanner s = new Scanner(System.in);

		
		int arr[] = new int[5];

		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번 째 수를 입력하세요 : ");
			int input = s.nextInt();
			
			if(input<0) {
				System.out.println("다시 입력하세요.");
				i-=1;
				continue;
				
			}else {
				arr[i]= input;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
