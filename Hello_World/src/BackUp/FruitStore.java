package BackUp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitStore {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> list = new ArrayList<>(); //해시맵의 리스트 미리 선언
        System.out.println("======= 과일가게 프로그램 =======");

        while (true) {
            System.out.print("[ (1)추가 (2)확인 (3)판매 (4)가격 수정 (-1)종료 ] : ");
            int menu = s.nextInt();  //메뉴 선택지 입력받기

            if (menu == 1) {
                System.out.print("과일명 : ");
                String fruitName = s.next();

                HashMap<String, Object> fruit = null;  //일단 객체는 만들지 않고 변수 선언
                for (int i = 0; i < list.size(); i++) {
                    HashMap<String, Object> getFruit = list.get(i); //리스트의 i번째 데이터를 해시맵의 getFruit에 넣기
                    if (getFruit.get("fruitName").equals(fruitName)) { 
                        fruit = getFruit;
                        break;
                    }
                }

                if (fruit == null) { //위의 과정에서 동일 과일을 찾지 못했으므로 null
                    fruit = new HashMap<>(); //없기때문에 선언만 해두었던 해시맵을 객체화
                    fruit.put("fruitName", fruitName); //입력받은 과일이름을 키에 등록

                    int price; //이제 가격차례
                    while (true) {
                        System.out.print("가격 : "); 
                        price = s.nextInt();
                        if (price % 100 != 0) {  //100원단위 예외처리
                            System.out.println("가격은 100단위로 입력해 주세요 ");
                            continue; 
                        }
                        if (price <= 0) { //음수 예외처리
                            System.out.println("음수는 불가능 합니다. 다시 입력해주세요.");
                        } else {
                            break;  //여기까지 도달하면 유효한 가격이므로 예외처리에서 탈출
                        }
                    }
                    fruit.put("price", price); //여기까지 왔으면 마찬가지로 가격에 price업데이트

                    int count;
                    while (true) {
                        System.out.print("개수 : ");
                        count = s.nextInt();
                        if (count <= 0) {
                            System.out.println("음수는 불가능 합니다. 다시 입력해주세요.");
                        } else {
                            break;  //개수도 음수 조건 만족시 탈출
                        }
                    }
                    fruit.put("count", count);
                    
                    list.add(fruit);

                } else {  //if(fruit == null에 대한 것
                    int addCount;
                    while (true) {
                        System.out.print("개수 : ");
                        addCount = s.nextInt();
                        if (addCount <= 0) {
                            System.out.println("음수는 불가능 합니다. 다시 입력해주세요.");
                        } else {
                            break;
                        }
                    }
                    int sum = (int) fruit.get("count") + addCount; //오브젝이므로 형변환 해주고 개수들고와서 입력받은 addCount랑 결합
                    fruit.put("count", sum);
                }

                
                
                
            } else if (menu == 2) {
                System.out.print("검색할 과일명 : ");
                String fruitName = s.next();

                HashMap<String, Object> fruit = null;
                for (int i = 0; i < list.size(); i++) {
                    HashMap<String, Object> getFruit = list.get(i);
                    if (getFruit.get("fruitName").equals(fruitName)) {
                        fruit = getFruit;
                        break;
                    }
                }

                if (fruit == null) {
                    System.out.println("해당 과일이 존재하지 않습니다.");
                } else {
                    System.out.print("가격 : " + fruit.get("price") + "원, ");
                    System.out.println("개수 : " + fruit.get("count") + "개");
                }
                
                

            } else if (menu == 3) {
                System.out.print("판매할 과일명 : ");
                String fruitName = s.next();

                HashMap<String, Object> fruit = null;
                for (int i = 0; i < list.size(); i++) {
                    HashMap<String, Object> getFruit = list.get(i);
                    if (getFruit.get("fruitName").equals(fruitName)) {
                        fruit = getFruit;
                        break;
                    }
                }

                if (fruit == null) {
                    System.out.println("해당 과일이 존재하지 않습니다.");
                } else {
                    int sellCount;
                    while (true) {
                        System.out.print("판매할 개수 : ");
                        sellCount = s.nextInt();
                        if (sellCount <= 0) {
                            System.out.println("음수는 불가능 합니다. 다시 입력해주세요.");
                        } else {
                            break;
                        }
                    }
                    int currentCount = (int) fruit.get("count");
                    if (currentCount < sellCount) {
                        System.out.println("현재 판매 가능한 개수는 " + currentCount + "개 입니다.");
                    } else {
                        fruit.put("count", currentCount - sellCount);
                        System.out.println(sellCount + "개가 판매되었습니다.");
                    }
                }

            } else if (menu == 4) {
                System.out.print("가격 수정할 과일명 : ");
                String fruitName = s.next();

                HashMap<String, Object> fruit = null;
                for (int i = 0; i < list.size(); i++) {
                    HashMap<String, Object> getFruit = list.get(i);
                    if (getFruit.get("fruitName").equals(fruitName)) {
                        fruit = getFruit;
                        break;
                    }
                }

                if (fruit == null) {
                    System.out.println("해당 과일이 존재하지 않습니다.");
                } else {
                    int newPrice;
                    while (true) {
                        System.out.print("수정할 가격 입력 : ");
                        newPrice = s.nextInt();
                        if (newPrice % 100 != 0) {
                            System.out.println("가격은 100단위로 입력해 주세요 ");
                            continue;
                        }
                        if (newPrice <= 0) {
                            System.out.println("음수는 불가능 합니다. 다시 입력해주세요.");
                        } else {
                            break;
                        }
                    }
                    fruit.put("price", newPrice);
                    System.out.println("가격이 수정되었습니다.");
                }

            } else if (menu == -1) {
                System.out.println("종료되었습니다.");
                break;

            } else {
                System.out.println("잘못된 메뉴입니다. 다시 입력하세요.");
            }
        }
    }
}
