package day2;
import java.util.Scanner;
//스캐너 먼저 넣고 ctrl + shift + o 

public class Scanner1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("원하는 숫자를 입력하세요.");
		
		long num1 = s.nextInt();
		
		System.out.println("이름을 입력해주세요 : ");
		String name = s.next();
		
		
		System.out.println("입력한 숫자 : " + num1);
		System.out.println("나의 이름: " + name);
		}

	}


