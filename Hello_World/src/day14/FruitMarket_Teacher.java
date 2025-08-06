package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitMarket_Teacher {

	public static int checkNumber(String msg) {
		Scanner s = new Scanner(System.in);
		int input;
		while(true) {
			System.out.print(msg + " : ");
			input = s.nextInt();
			
			// 가격 100단위 인지 체크하는 조건문
			if(msg.equals("가격")) {
				if(input % 100 != 0) {
					System.out.println("가격은 100단위로 입력해 주세요 ");
					continue;
				}
			}
			
			// 숫자 0 혹은 음수인지 체크하는 조건문
			if(input <= 0) {
				System.out.println("음수는 불가능 합니다. 다시 입력해주세요.");
			} else {
				break;
			}
		}
		
		return input;
	}
	
	public static HashMap<String, Object> searchFruit(ArrayList<HashMap<String, Object>> list, String fruitName){
		for(int i=0; i<list.size(); i++) {
			HashMap<String, Object> getFruit = list.get(i);
			if(getFruit.get("fruitName").equals(fruitName)) {
				return getFruit;
			} 
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// * 과일가게 프로그램 *
		// 메뉴 1(추가). 과일명, 가격, 개수 추가(map)한 후 list에 담기
		// 메뉴 2(확인). 과일명을 입력받고, 해당 과일명의 가격, 개수 출력
		// 		       만약 없는 과일명이면 '해당 과일이 존재하지 않습니다' 출력
		// 메뉴 3(판매). 과일명과 개수를 입력받아서 해당 과일명의 개수에서 차감
		//             'oo개가 판매되었습니다.' 출력
		//			   만약 없는 과일명이면 '해당 과일이 존재하지 않습니다' 출력
		// 메뉴 -1(종료). '종료되었습니다' 출력 후 프로그램 종료
		
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("======= 과일가게 프로그램 =======");
		while(true) {
			System.out.print("[ (1)추가 (2)확인 (3)판매 (4)가격 수정 (-1)종료 ] : ");
			int menu = s.nextInt();
			
			if(menu == 1) {
				System.out.print("과일명 : ");
				String fruitName = s.next();
				HashMap<String, Object> fruit = searchFruit(list, fruitName);
				if(fruit == null) {
					// 과일 map만들고 list에 추가
					fruit = new HashMap<String, Object>();
					fruit.put("fruitName", fruitName);
					fruit.put("price", checkNumber("가격"));
					fruit.put("count", checkNumber("개수"));
					list.add(fruit);
				} else {
					// fruit에 있는 과일 개수만 변경(기존거에 입력한거 추가)
					int sum = (int) fruit.get("count") + checkNumber("개수");
					fruit.put("count", sum);
				}
				
				
			} else if(menu == 2) {
				System.out.print("검색할 과일명 : ");
				String fruitName = s.next();
				HashMap<String, Object> fruit = searchFruit(list, fruitName);
				if(fruit == null) {
					System.out.println("해당 과일이 존재하지 않습니다.");
				} else {
					System.out.print("가격 : " + fruit.get("price") + "원, ");
					System.out.println("개수 : " + fruit.get("count") + "개");
				}
				
				
			} else if(menu == 3) {
				System.out.print("판매할 과일명 : ");
				String fruitName = s.next();
				HashMap<String, Object> fruit = searchFruit(list, fruitName);
				if(fruit == null) {
					System.out.println("해당 과일이 존재하지 않습니다.");
				} else {
					int sellCount = checkNumber("판매할 개수");
					int currentCount = (int) fruit.get("count");
					if(currentCount < sellCount) {
						System.out.println("현재 판매 가능한 개수는 " + currentCount + "개 입니다.");
						break;
					}
					fruit.put("count", (int) fruit.get("count") - sellCount);
				}
				
			} else if(menu == 4) {
				System.out.print("가격 수정할 과일명 : ");
				String fruitName = s.next();
				HashMap<String, Object> fruit = searchFruit(list, fruitName);
				if(fruit == null) {
					System.out.println("해당 과일이 존재하지 않습니다.");
				} else {
					System.out.print("수정할 가격 입력 : ");
					int newPrice = checkNumber("수정할 가격 입력");
					fruit.put("price", newPrice);
				}
				
			} else if(menu == -1) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				
			}
			
		}
	}
}