package Review_day1;

public class Array_Score2 {

	public static void main(String[] args) {
		String[] subjectArr = {"JAVA", "oracle", "html", "javascript", "css"};
		int[] scoreArr = {90,85, 60, 95,100};
		
		int score = 0;
		int sum = 0;
		for(int socre : scoreArr) {
			sum += score;
		}
		double avg = (double) sum/scoreArr.length;
		
		String subStr = "";
		for(int i=0; i<scoreArr.length; i++) {
			if(scoreArr[i] > avg) {
				subStr += subjectArr[i] + " ";
			}
		}
		System.out.println("평균이 넘는 과목은 " + subStr + "입니다.");
	}
}

