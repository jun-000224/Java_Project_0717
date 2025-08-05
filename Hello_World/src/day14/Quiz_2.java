package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz_2 {
	
	//메소드 구현하기
	public static Object getInput(Scanner s, String subject) {
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		while(true) {
			System.out.print("[ (1) 추가 (2) 확인 (3) 점수수정 (4) 종료 ] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("이름 : ");
				String name = s.next();
				map.put("name", name);
				
				System.out.print("국어 : ");
				int kor = s.nextInt();
				map.put("kor", kor);
				
				System.out.print("영어 : ");
				int eng = s.nextInt();
				map.put("eng", eng);
				
				System.out.print("수학 : ");
				int math = s.nextInt();
				map.put("math", math);
				
				list.add(map);
				
				
			} else if(menu == 2) {
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					String name = (String) map.get("name");
					int kor = (int) map.get("kor");
					int eng = (int) map.get("eng");
					int math = (int) map.get("math");
					double avg = (kor+eng+math) / (double) 3;
					System.out.println((i+1) + ". 이름 : " + name);
					System.out.println("   국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math + ", 평균 : " + avg);
				}
				
				
			} else if(menu == 3) {
				System.out.print("점수를 수정할 학생의 이름을 입력해 주세요 : ");
				String inputName = s.next();
				boolean searchFlg = false;
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					if(map.get("name").equals(inputName)) {
						searchFlg = true;
						System.out.print("수정할 과목 선택해주세요 (1. 국어, 2. 영어, 3. 수학) ");
						int subject = s.nextInt();
						String key = "";
						switch(subject) {
							case 1 : key = "kor"; break; 
							case 2 : key = "eng"; break;
							case 3 : key = "math"; break;
							default : 
								System.out.println("잘못된 과목 번호입니다.");
								continue;
						}
						System.out.print("새로운 점수를 입력해주세요 : ");
						int newScore = s.nextInt();
						map.put(key, newScore);
						System.out.println("점수가 수정되었습니다.");
					}
				}
				
				
				if(searchFlg == false) { // (!searchFlg)
					System.out.println("해당 이름을 가진 사람이 없습니다.");
				}
				
				
				
			} else if(menu == 4) {
				System.out.println("종료되었습니다.");
				break;
				
				
			} else {
				System.out.println("없는 메뉴 번호 입니다. ");
			}
		}
	}
}