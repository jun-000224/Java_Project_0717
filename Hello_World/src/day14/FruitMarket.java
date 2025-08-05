package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitMarket {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> list = new ArrayList<>();

        System.out.println("====== 과일가게 프로그램 ======");

        while (true) {
            System.out.println("[ (1)추가 (2)확인 (3)판매 (4)가격수정 (-1)종료 ]");
            int menu = s.nextInt();

            // 메뉴 1: 과일 추가
            if (menu == 1) {
                System.out.print("과일명 : ");
                String f = s.next();

                boolean exists = false; //기존에 존재하는지 여부 체크
                
                
                //스캔값과 "fruitName"키값이 일치하는지 검사
                for (int i = 0; i < list.size(); i++) {
                    if (f.equals(list.get(i).get("fruitName"))) {
                        exists = true;

                        //유효성 검사 후 추가 입력 구현, addCount변수 등장
                        System.out.print("추가할 개수 : ");
                        int addCount = s.nextInt();
                        if (addCount < 0) {
                            System.out.println("음수는 안 됩니다.");
                            break;
                        }

                        //i번째의 수량에 바로 위에서 입력받은 addCount넣어서 넣기
                        int newCount = (int) list.get(i).get("count");
                        list.get(i).put("count", newCount + addCount);
                        System.out.println("기존 과일 개수에 업데이트");
                        break;
                    }
                }

                if (!exists) {
                    HashMap<String, Object> fruit = new HashMap<>();
                    fruit.put("fruitName", f);

                    System.out.print("가격 (100원 단위) : ");
                    int p = s.nextInt();
                    if (p < 0 || p % 100 != 0) {  //100원 단위가 되지 않는 조건 판별
                        System.out.println("가격은 100원 단위의 양수여야 합니다.");
                        continue;
                    }
                    fruit.put("price", p); //if문을 피했다면 price로 업데이트

                    
                    System.out.print("개수 : ");
                    int c = s.nextInt();
                    if (c < 0) { //음수 입력 방지
                        System.out.println("개수는 0 이상이어야 합니다.");
                        continue;
                    }
                    fruit.put("count", c); //if문을 피했다면 마찬가지로 맵에 추가

                    list.add(fruit);   
                    System.out.println("새 과일 등록 완료");
                }
            }

            
            
            
            
            // 메뉴 2: 과일 확인
            else if (menu == 2) {
                System.out.print("검색할 과일명 : ");
                String fruitName = s.next();
                boolean found = false;

                for (int i = 0; i < list.size(); i++) {
                    if (fruitName.equals(list.get(i).get("fruitName"))) {
                        System.out.println("가격 : " + list.get(i).get("price") + "원");
                        System.out.println("개수 : " + list.get(i).get("count") + "개");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("해당 과일이 존재하지 않습니다.");
                }
            }

            // 메뉴 3: 과일 판매
            else if (menu == 3) {
                System.out.print("판매할 과일명 : ");
                String fruitName = s.next();
                
                boolean found = false;

                for (int i = 0; i < list.size(); i++) {
                    if (fruitName.equals(list.get(i).get("fruitName"))) {
                        System.out.print("판매할 개수 : ");
                        int minus = s.nextInt();

                        if (minus < 0) {
                            System.out.println("음수는 입력할 수 없습니다.");
                            found = true;
                            break;
                        }

                        int currentCount = (int) list.get(i).get("count");

                        if (currentCount >= minus) {
                            list.get(i).put("count", currentCount - minus);
                            System.out.println(minus + "개가 판매되었습니다.");
                        } else {
                            System.out.println("판매 가능한 개수는 " + currentCount + "개입니다.");
                        }

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("해당 과일이 존재하지 않습니다.");
                }
            }

            // 메뉴 4: 가격 수정
            else if (menu == 4) {
                System.out.print("가격을 수정할 과일명 : ");
                String fruitName = s.next();
                boolean found = false;

                for (int i = 0; i < list.size(); i++) {
                    if (fruitName.equals(list.get(i).get("fruitName"))) {
                        System.out.print("새로운 가격 (100원 단위) : ");
                        int newPrice = s.nextInt();

                        if (newPrice < 0 || newPrice % 100 != 0) {
                            System.out.println("가격은 100원 단위의 양수여야 합니다.");
                        } else {
                            list.get(i).put("price", newPrice);
                            System.out.println("가격이 수정되었습니다.");
                        }

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("해당 과일이 존재하지 않습니다.");
                }
            }

            // 종료
            else if (menu == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 잘못된 입력
            else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
