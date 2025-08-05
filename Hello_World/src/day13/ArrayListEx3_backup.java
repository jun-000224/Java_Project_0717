//package day13;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//
//public class ArrayListEx3_backup {
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        ArrayList<Human> list = new ArrayList<>();
//
//        while (true) {
//            System.out.print("[ (1) 추가 (2) 확인 (3) 삭제 (4) 종료 ] : ");
//            int input = s.nextInt();
//            s.nextLine(); 
//
//            //1번 추가 메뉴 구현하기
//            if (input == 1) {
//                System.out.print("이름 : ");    			//이름 입력받기
//                String name = s.nextLine();
//
//                System.out.print("나이 : ");	  		    //나이 입력받기
//                int age = s.nextInt();
//                s.nextLine(); 
//
//                System.out.print("주소 : ");   		    //주소 입력받기
//                String addr = s.nextLine();
//
//                Human h = new Human(name, age, addr);   //리스트에 추가하기
//                list.add(h);
//
//                
//            } else if (input == 2) {
//                for (int i = 0; i < list.size(); i++) {
//                    Human h = list.get(i);
//                    System.out.println(         //(i+1)로 몇 번째인지 표시. 나머지는 메소드 활용
//                    		(i+1) + ". 이름 : " + h.getName() + ", 나이 : " + h.getAge() + ", 주소 : " + h.getAddr()
//                    		);
//                }
//
//            } else if (input == 3) {
//                System.out.print("삭제할 사용자의 이름을 입력해주세요 : ");
//                String name = s.nextLine();
//
//                boolean flg = false;
//                for (int i = 0; i < list.size(); i++) {
//                    if (list.get(i).getName().equals(name)) {
//                        list.remove(i);
//                        System.out.println(name + " 삭제되었습니다.");
//                        flg = true;
//                        break;
//                    }
//                }
//
//                if (!flg) {     //flg값이 달라졌다면,
//                    System.out.println("해당 이름을 가진 사용자가 존재하지 않습니다.");
//                }
//
//                
//            } else if (input == 4) {
//                System.out.println("종료되었습니다.");
//                break;
//
//            } else {
//                System.out.println("1~4중에 선택해주세요.");
//            }
//        }
//
//    }
//}
