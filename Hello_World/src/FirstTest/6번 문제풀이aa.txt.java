package FirstTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;


public class Num6 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] arr = new int[20];
		
		for(int i=0; i<arr.length; i++) {
			int random = ran.nextInt(10)+1;
			arr[i] = random;
		}
//		System.out.println(Arrays.toString(arr)); //배열 테스트
//		System.out.println();
		
		
		HashMap<Integer, Integer> map = new HashMap<>(); //키로 묶기 위함
		for(int num : arr) {
			if(map.containsKey(num)) {
				int value = map.get(num);
				map.put(num, value+1);
			}else {
				map.put(num,1);
			}
		}
		
//		System.out.println(map); //맵 테스트
		
		for(int key : map.keySet()) {   //키를 하나씩 key 변수에 넣었을 때
			if(map.get(key)>=3) {
				System.out.println(key + " => " + map.get(key) + "개");
			}
		}
	}

}