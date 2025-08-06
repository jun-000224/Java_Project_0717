import java.util.HashMap;
import java.util.Scanner;

public class quiz7_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("문자열 입력 : ");
		String input = s.nextLine();

		input = input.toLowerCase();

		HashMap<Character, Integer> map = new HashMap<>(); // key를 Character로

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch == ' ') continue;

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		System.out.println("문자열 빈도수는 ");
		for (char key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
	}
}
