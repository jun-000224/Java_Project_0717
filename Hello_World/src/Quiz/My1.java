package Quiz;

import java.util.Random;
import java.util.Scanner;

public class My1 {

	public static void main(String[] args) {
		// 랜덤 숫자를 받아서 배열로 저장하고, 해당 배열의 임의의 수를 골라서 오름차순으로정렬
		
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		int length = ran.nextInt(9)+1; //랜덤 배열 길이 생성
		int arr[] = new int [length];
		
		for(int i=0; i<arr.length; i++) {
			int ran_num = ran.nextInt(50)+1;
			arr[i]=ran_num;
		}
		for(int i=1; i<arr.length; i++) {
			int index = 0;
			if(arr[index]>arr[i]) {
				int temp = arr[index];
				int arr[index[]
			}
		}

	}

}
