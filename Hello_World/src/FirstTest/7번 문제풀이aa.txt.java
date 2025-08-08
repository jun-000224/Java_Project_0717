package FirstTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Num7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> list = new ArrayList<>();
        
        
        
        
        System.out.println("======= 포인트 계산 프로그램 =======");
        
        

        while (true) {
            System.out.print("[ (1)사용자 등록 (2)포인트 적립 (3)포인트 차감 (4)포인트 확인 (5)종료 ] : ");
            int menu = s.nextInt();  

            
            
            //1번 메뉴 구현(사용자 등록)
            if (menu == 1) {
                System.out.print("등록할 사용자의 이름 : ");
                String userName = s.next();

                HashMap<String, Object> user = null;  //일단 객체는 만들지 않고 변수 선언
                for (int i = 0; i < list.size(); i++) {
                    HashMap<String, Object> getUser = list.get(i);
                    if (getUser.get("userName").equals(userName)) { 
                        user = getUser;
                        System.out.println("이미 등록된 유저입니다.");
                        break;
                    }
                }

                if (user == null) { 					//위의 과정에서 동일 과일을 찾지 못했으므로 null
                    user = new HashMap<>();				//없기때문에 선언만 해두었던 해시맵을 객체화
                    user.put("userName", userName); 	//입력받은 이름을 키에 등록

                    int age; 
                    while (true) {
                        System.out.print("나이 : "); 
                        age = s.nextInt();

                        if (age <= 0) { 
                            System.out.println("음수는 불가능 합니다. 다시 입력해주세요.");
                        } else {
                            break;  //여기까지 도달하면 유효한 가격이므로 예외처리에서 탈출
                        }
                    }
                    user.put("age", age); 
                    list.add(user);
                }  
                    

                
                
                
            //2번 메뉴 구현(포인트 적립)
            } else if (menu == 2) {
                System.out.print("적립할 대상 유저의 이름 : ");
                String userName = s.next();

                HashMap<String, Object> user = null;
                for (int i = 0; i < list.size(); i++) {
                    HashMap<String, Object> getUser = list.get(i);
                    if (getUser.get("userName").equals(userName)) {
                        user = getUser;
                        break;
                    }
                }

                if (user == null) {
                    System.out.println("해당 사용자가 존재하지 않습니다.");
                } else {
                    int newPoint;
                    int sum = 0;
                    
                    while (true) {
                        System.out.print("적립할 포인트 입력 : ");
                        newPoint = s.nextInt();
  
                        if (newPoint <= 0) {
                            System.out.println("음수는 불가능 합니다. 다시 입력해주세요.");
                        } else {
                            break;
                        }
                    }
                    user.put("Point", sum+newPoint);
                    System.out.println(user.get("userName") + "의 포인트가" + user.get("Point") + "적립되었습니다.");
                }
                

                
                
            
                
            //3번 메뉴 구현(포인트 차감)
            } else if (menu == 3) {
                System.out.print("포인트 차감할 유저명 : ");
                String userName = s.next();

                HashMap<String, Object> user = null;
                for (int i = 0; i < list.size(); i++) {
                    HashMap<String, Object> getUser = list.get(i);
                    if (getUser.get("userName").equals(userName)) {
                        user = getUser;
                        break;
                    }
                }

                if (user == null) {
                    System.out.println("해당 유저가 존재하지 않습니다.");
                } else {
                    int minusPoint;
                    
                    while (true) {
                        System.out.print("차감할 포인트 : ");
                        minusPoint = s.nextInt();
                        if (minusPoint <= 0) {
                            System.out.println("음수는 불가능 합니다. 다시 입력해주세요.");
                        } else {
                            break;
                        }
                    }
                    int currentPoint = (int) user.get("Point");
                    
                    if (currentPoint < minusPoint) {
                        System.out.println("현재 차감 가능한 포인트는 " + currentPoint + "점 입니다.");
                    } else {
                        user.put("Point", currentPoint - minusPoint);
                        System.out.println(minusPoint + "점이 차감되었습니다.");
                    }
                }

                
                
                
          
            //4번 메뉴 구현(포인트 확인)
            } else if (menu == 4) {
                System.out.print("검색할 사용자 이름 : ");
                String userName = s.next();

                HashMap<String, Object> user = null;
                for (int i = 0; i < list.size(); i++) {
                    HashMap<String, Object> getUser = list.get(i);
                    if (getUser.get("userName").equals(userName)) {
                        user = getUser;
                        break;
                    }
                }

                if (user == null) {
                    System.out.println("해당 사용자가 존재하지 않습니다.");
                } else {
                    System.out.println(user.get("userName") +"의 현재 포인트 " + user.get("Point") + "포인트 입니다.");
                }
                

             
                
                
                
            //5번 구현   
            } else if (menu == 5) {
                System.out.println("종료되었습니다.");
                break;

            } else {
                System.out.println("잘못된 메뉴입니다. 다시 입력하세요.");
            }
        }
    }
}
