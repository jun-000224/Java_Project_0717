package Review_day1;

import java.util.Scanner;

public class True {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean a = true;

//        while (true) {
//            s.nextLine(); // 엔터 입력 기다림
//            if (a == true) {
//                a = false;
//            } else {
//                a = true;
//            }
//            System.out.println(a);
//        }
        
        while(true) {
            s.nextLine();  // 사용자가 엔터 입력할 때까지 대기
            a = !a;
            System.out.println(a);
        }

    }
}
