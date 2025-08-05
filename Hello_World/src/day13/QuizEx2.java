package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuizEx2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> list = new ArrayList<>();    //제너릭 클래스의 컬렉션 선언

        while (true) {
            System.out.print("[ (1) 추가 (2) 확인 (3) 삭제 (4) 종료 ] : ");
            int input = s.nextInt();
            s.nextLine();

            if (input == 1) {
                HashMap<String, Object> map = new HashMap<>();

                System.out.print("이름 : ");
                String name = s.next();
                map.put("name", name);

                System.out.print("나이 : ");
                int age = s.nextInt();
                s.nextLine();
                map.put("age", age);

                System.out.print("주소 : ");
                String addr = s.next();
                map.put("addr", addr);

                list.add(map);  // HashMap을 리스트에 추가

            } else if (input == 2) {
                for (int i = 0; i < list.size(); i++) {
                    HashMap<String, Object> h = list.get(i);
                    System.out.println((i + 1) + ". 이름 : " + h.get("name")
                            + ", 나이 : " + h.get("age")
                            + ", 주소 : " + h.get("addr"));
                }

            } else if (input == 3) {
                System.out.print("삭제할 사용자의 이름을 입력해주세요 : ");
                String name = s.next();

                boolean flg = false;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).get("name").equals(name)) {
                        list.remove(i);
                        System.out.println(name + " 삭제되었습니다.");
                        flg = true;
                        break;
                    }
                }

                if (!flg) {
                    System.out.println("해당 이름을 가진 사용자가 존재하지 않습니다.");
                }

            } else if (input == 4) {
                System.out.println("종료되었습니다.");
                break;

            } else {
                System.out.println("1~4중에 선택해주세요.");
            }
        }


    }
}
