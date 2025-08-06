package day15;

import java.util.Scanner;
import java.util.TreeMap;

public class Quiz7 {
	public static void main(String[] args) {
		//문자열을 입력받아서
		//문자열 빈도 찾기
		//ex)show me the money
		//결과 : s : 1, h : 2, o : 2, w:1 ..., y:1
		//대소문자 구분없이 같이 카운팅
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("문자열 입력 : ");
		String input = s.nextLine();
		
		input=input.toLowerCase(); //소문자로 변환
		
		TreeMap<Character, Integer> map = new TreeMap<>(); //문자 빈도 저장을 위한 해시맵
		
		
		
		for(int i = 0; i<input.length(); i++) {
			char ch = input.charAt(i);  //ch변수에다가 각 알파벳 한 글자를 넣음
			//String word = Character.toString(str.charAt(i));
			
			if (ch == ' ')continue; //여백은 스킵
			
			if(map.containsKey(ch)) {		//ch에 해당하는 키가 존재하면
				map.put(ch, map.get(ch)+1); 
			}else {
				map.put(ch, 1);
			}
		}
		
		System.out.println("문자열 빈도수는 ");
		for(char key : map.keySet()) {
			System.out.print(key + " : " + map.get(key));
		}
		
		
	}

}
