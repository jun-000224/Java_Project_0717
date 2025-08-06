package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Number6 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] arr = new int[20];
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			int random = ran.nextInt(10)+1;
			arr[i] = random;
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1); //그냥 arr[i]하면 ,기준으로 좌측은 키값, 우측은 벨류를 나타내는 것?
			}else {
				map.put(arr[i], 1);
			}
		}
		//그리고 .add는 언제하는거지
		
		System.out.println(map);
		int max = 0;
		for(int key : map.keySet()) { //keySet()이 정확히 머임
			if(max<map.get(key)) {
				max = map.get(key);
			}
		}
		System.out.println(max);
		for(int key : map.keySet()) {
			if(max == map.get(key)) {
				System.out.println("가장 많은 수는 : " + key + ", 개수 : " + map.get(key));
			}
		}
		
	}

}
