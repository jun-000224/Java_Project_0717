package BackUp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;


public class Hash {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int[] arr = new int[20];
		
		for(int i=0; i<arr.length; i++) {
			int random = ran.nextInt(10)+1;
			arr[i] = random;
		}
		System.out.println(Arrays.toString(arr)); //일단 배열 출력해보기
		System.out.println();
		
		
		HashMap<Integer, Integer> map = new HashMap<>(); //키로 묶기 위함
		for(int num : arr) {
			if(map.containsKey(num)) {
				int value = map.get(num);
				map.put(num, value+1);
			}else {
				map.put(num,1);
			}
		}
		
		System.out.println(map); //맵 출력해보기
		
		int MaxKey=-1;
		int MaxValue=0;
		
		for(int key : map.keySet()) {
			int tmp = map.get(key); //key변수에 들어간 벨류를 임시 변수에 넣음. 뒤에 비교하기 위
			if(tmp > MaxValue) {
				MaxValue = tmp;
				MaxKey = key;
			}
		}
		System.out.println("최고 많은 키 : " + MaxKey + ", 그 수는 : " + MaxValue);
	}

}
