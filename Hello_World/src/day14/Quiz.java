package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> list = new ArrayList<>();

        while (true) {
            System.out.print("[ (1) 추가 (2) 확인 (3) 점수수정 (4) 종료 ] : ");
            int input = s.nextInt();
            
            //이름과 각 과목 점수 입력
            if (input == 1) {
                HashMap<String, Object> map = new HashMap<>();

                System.out.print("이름 : ");
                String name = s.next();
                map.put("name", name);

                System.out.print("국어 점수 : ");
                int korean = s.nextInt();
                map.put("korean", korean);

                System.out.print("영어 점수 : ");
                int english = s.nextInt();
                map.put("english", english);

                System.out.print("수학 점수 : ");
                int math = s.nextInt();
                map.put("math", math);

                list.add(map);
            
            //이름 입력받아서 점수 확인하기
            } else if (input == 2) {
                int idx = 1; //몇 번째지 체크하는 변수
                for (HashMap<String, Object> student : list) {
                    String name = (String) student.get("name");
                    int korean = (int) student.get("korean");
                    int english = (int) student.get("english");
                    int math = (int) student.get("math");

                    double avg = (korean + english + math) / 3.0;
                    idx++;

                    System.out.println(idx + ". 이름 : " + name);
                    System.out.println("   국어 : " + korean + ", 영어 : " + english + ", 수학 : " + math +
                    						", 평균 : " + avg);  
                }

            } else if (input == 3) {
                System.out.print("점수를 수정할 학생의 이름을 입력하세요 : ");
                String targetName = s.next();

                boolean found = false; //true을 찾지 못하면 수정 불가
                
                for (HashMap<String, Object> student : list) {
                    if (student.get("name").equals(targetName)) {
                        found = true;
                        System.out.print("수정할 과목을 선택하세요 (1. 국어 2. 영어 3. 수학) : ");
                        int subject = s.nextInt();

                        String key = "";
                        switch (subject) {
                            case 1:
                                key = "kor";
                                break;
                            case 2:
                                key = "eng";
                                break;
                            case 3:
                                key = "math";
                                break;
                            default:
                                System.out.println("잘못된 과목 번호입니다.");
                                break;
                        }

                        if (!key.equals("")) {
                            System.out.print("새로운 점수를 입력하세요 : ");
                            int newScore = s.nextInt();
                            student.put(key, newScore);
                            System.out.println("점수가 수정되었습니다.");
                        }
                        break;
                    }
                }

                if (!found) {
                    System.out.println("해당 이름의 학생을 찾을 수 없습니다.");
                }

            } else if (input == 4) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
