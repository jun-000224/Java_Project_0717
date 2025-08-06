package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class WordQuiz {

    public static ArrayList<HashMap<String, String>> quizList() {
        ArrayList<HashMap<String, String>> list = new ArrayList<>();
        String[] countries = {
            "멕시코", "스페인", "프랑스", "영국", "그리스",
            "독일", "중국", "러시아", "일본", "대한민국",
            "이탈리아", "캐나다", "브라질", "인도", "이집트",
            "호주", "터키", "노르웨이"
        };
        String[] capitals = {
            "멕시코시티", "마드리드", "파리", "런던", "아테네",
            "베를린", "베이징", "모스크바", "도쿄", "서울",
            "로마", "오타와", "브라질리아", "뉴델리", "카이로",
            "캔버라", "앙카라", "오슬로"
        };

        for (int i = 0; i < countries.length; i++) {
            HashMap<String, String> map = new HashMap<>();
            map.put("country", countries[i]);
            map.put("capital", capitals[i]);
            list.add(map);
        }

        return list;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList<HashMap<String, String>> quizList = quizList();
        Random ran = new Random();

        int[] used = new int[quizList.size()]; // 출제 여부 체크용
        int usedCount = 0;
        int score = 0;

        System.out.println("수도 퀴즈! [-1 입력 시 종료]");
        System.out.println("총 문제 수: 최대 10문제");

        while (usedCount < 10 && usedCount < quizList.size()) {
            int idx = ran.nextInt(quizList.size());

            // 이미 출제된 문제면 다시 뽑기
            if (used[idx] == 1) {
                continue;
            }

            used[idx] = 1; // 출제 표시
            usedCount++;

            HashMap<String, String> quiz = quizList.get(idx);
            String country = quiz.get("country");
            String capital = quiz.get("capital");

            System.out.print(usedCount + ". " + country + "의 수도는? >> ");
            String answer = s.next();

            if (answer.equals("-1")) {
                System.out.println("게임 종료");
                break;
            }

            if (answer.equals(capital)) {
                System.out.println("정답!");
                score += 10;
            } else {
                System.out.println("땡! 정답은 " + capital);
            }
        }

        System.out.println("최종 점수: " + score + "점");
    }
}
