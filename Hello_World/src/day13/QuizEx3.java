package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuizEx3 {
	
//	public static int scoreFunc(String subject, int max) {
//		Scanner s = new Scanner(System.in);
//		int score =0;
//		while(true) {
//			System.out.println(subject + ">>");
//			score = s.nextInt();
//			if(score < 0 || score > max) {
//				System.out.println(subject + "의 범위는 0부터 " + max + "까지 입니다.");
//			}else {break;}
//			
//		}return score;
		
		
	public static int scoreFunc(String subject, int max) {
		Scanner s = new Scanner(System.in);
		int score = 0;
		while(true) {
			System.out.print(subject + ">>");
			score = s.nextInt();
			if(score >=0 && score <= max) {
				return score;
			}
			else {
				System.out.println(subject + "의 범위는 0부터 " + max + "까지 입니다.");
			}
		}
	
		
		
	}

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> list = new ArrayList<>();

        System.out.println("====== 성적관리 시스템 ======");
        System.out.print("총 인원은 몇 명 입니까? : ");
        int people = s.nextInt();
        s.nextLine(); // 개행 제거

        for (int i = 0; i < people; i++) {
            HashMap<String, Object> map = new HashMap<>();

            System.out.print("이름 : ");
            String name = s.nextLine();
            map.put("name", name);

            map.put("java", scoreFunc("자바", 40));
            map.put("oracle", scoreFunc("오라클", 30));
            map.put("html", scoreFunc("html", 25));
            
            
            
//            // 자바 점수 입력 (0~35)
//            int java;
//            while (true) {
//                System.out.print("자바 점수 : ");
//                java = s.nextInt();
//                if (java >= 0 && java <= 35) break;
//                System.out.println("0~35점 사이로 다시 입력하세요.");
//            }
//            map.put("java", java);
//
//            
//            
//            // 오라클 점수 입력 (0~40)
//            int oracle;
//            while (true) {
//                System.out.print("오라클 점수 : ");
//                oracle = s.nextInt();
//                if (oracle >= 0 && oracle <= 40) break;
//                System.out.println("0~40점 사이로 다시 입력하세요.");
//            }
//            map.put("oracle", oracle);
//
//            
//            
//            // HTML 점수 입력 (0~25)
//            int html;
//            while (true) {
//                System.out.print("HTML 점수 : ");
//                html = s.nextInt();
//                if (html >= 0 && html <= 25) break;
//                System.out.println("0~25점 사이로 다시 입력하세요.");
//            }
//            map.put("html", html);

            list.add(map);
            s.nextLine(); 
        }

        
        
        System.out.println("====== 전체 성적 정보 ======");
        for (int i = 0; i < list.size(); i++) {
            HashMap<String, Object> student = list.get(i);  // i번 째에서 꺼낸 정보를 student변수에 담기. 
            											    // HashMap<String, Object>는 데이터 형식 표시하는 것.

            String name = (String) student.get("name");
            int java = (int) student.get("java");
            int oracle = (int) student.get("oracle");
            int html = (int) student.get("html");
            int total = java + oracle + html;

            System.out.println("이름 : " + name + ", 총점 : " + total + "점");
   

        }
    }
}
