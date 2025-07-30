package My;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Turn {

	public static void main(String[] args) {
		//사용자로 부터 숫자 5개를 입력받고 하나 회전
		
		Scanner s = new Scanner(System.in);
		int[] arr = new int[5];
		
		for (int i = 0; i<5; i++) {
			System.out.println("숫자 5개를 입력하세요.");
			int input = s.nextInt();
			arr[i] = input;
		}
		
		System.out.println(Arrays.toString(arr));
		
		int backup_last = arr[4];
		
		for(int i=5; i<1; i--) {
			int backup = arr[i-1]; //1백업
			arr[i-1] = arr[i]; //두 번째 칸에 1 넣음.
			arr[i] = backup; //첫 번째 칸에 1
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
