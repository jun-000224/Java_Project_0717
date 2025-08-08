package BackUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class HashMap_Advanced {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int arr[] = new int[20];
		for(int i=0; i<arr.length; i++) {
			int random = ran.nextInt(10)+1;
			arr[i]=random;
		}
		System.out.println("일단 생성된 배열 >> " + Arrays.toString(arr));
		
		
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int num : arr) {
			if(map.containsKey(num)) { //num에 들어간 배열의 값이 존재할때 (이미 키가 존재할 때)
				map.put(num, map.get(num)+1);
			}else {
				map.put(num, 1);
			}
		}
		System.out.println("일단 생성된 맵 >> " + map); 
		
		
		ArrayList<Integer> maxKey = new ArrayList<>(); //중복 1등이 있을 수 있으므로 key값은 인티져로 저장함.
	    int maxValue = 0;
	    
	    
	    for(int key : map.keySet()) { //새로운 key변수에 map의 key값들은 하나씩 때려넣음
	    	int tmp = map.get(key);
	    	if(maxValue < map.get(key)) {
	    		maxValue = tmp;
	    		maxKey.clear();
	    		maxKey.add(key);
	    	}else if(tmp == maxValue) {
	    		maxKey.add(key);
	    	}
	    }
	    System.out.print("최다 빈도 키는 ");
	    for(int i = 0; i<maxKey.size(); i++) {
	    	System.out.print(maxKey.get(i) + " ");
	    }
	    System.out.println("이고, 그 수는 " + maxValue + "입니다");
	}

}
