package day4;

import java.util.Scanner;

public class Array9 {

	public static void main(String[] args) {
		String arr[] = {"자바", "오라클", "html/css", "js", "jsp"};
		// 과목중에 '오라클'이 있으면 있다, 없으면 없다.
		
		Scanner s = new Scanner(System.in);
		System.out.print("검색할 과목명을 입력하세요 : ");
		String subject = s.next();
		
		int check = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(subject)) { //문자열을 비교할때는 arr[@].equals(문자형 변수);
				check = 0;				 //ex) "자바".equals("자바"))
				break;				     //ex) String ex = "자바";
			}else {					     //    "자바".equals(sub)); -> 부정의 경우 맨 앞에!  
				check = 1;
			}
		
		}
		if(check==0) {
			System.out.println("있다");
		}else {
			System.out.println("없다");
		}
		
		String result = fig? "있다" : "없다"
		
		
	}

}
