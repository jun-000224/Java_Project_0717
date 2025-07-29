package Review_day1;

import java.util.Arrays;
import java.util.Random;

public class Array1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int ranNum = ran.nextInt();
		
		int[] arr = new int[ranNum]; //랜덤 배열 생성
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
