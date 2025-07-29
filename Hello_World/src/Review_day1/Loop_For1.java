package Review_day1;

import java.util.Random;

public class Loop_For1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int count = 0;
		// 100번동안 랜덤한 숫자를 갱신해가면서 
		// 50이라는 숫자가 몇 번째에 나오는지	
		for(int i = 0; i<=100; i++) {
			int input= ran.nextInt(100)+1;
			count ++;
			if (input == 50) {
			System.out.println(count + "번 째에 50 찾음");
			break;}
			
			if(count == 100) {
				System.err.println("100번 안에 50을 찾지 못함");
			}
		}
		
		
	}

}
