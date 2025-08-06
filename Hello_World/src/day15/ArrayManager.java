package day15;

import java.util.Arrays;
import java.util.Random;

public class ArrayManager {
	
	//리턴값을 갖는 메소드
	public static int find(int[] x) {
		Random ran = new Random();
		int[] arr = new int[5];
		
		
		//난수로 5개의 배열 생성
		for(int i=0; i<5; i++) {
			int count = ran.nextInt(30)+1;
			if((count % 2) == 0) {
				arr[i] = count;
			}else {
				i--;
			}
		}
		
		//외부 함수로 정렬
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		return arr[arr.length-2];
	}
		
	
}
