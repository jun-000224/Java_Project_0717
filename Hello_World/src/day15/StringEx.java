package day15;

public class StringEx {

	public static void main(String[] args) {
		
		String str = "Show Me The Money";
		for(int i=0; i<str.length(); i++) {
		//캐릭터를 문자열로
		String word = Character.toString(str.charAt(i));
		//문자열을 소문자로
		System.out.println(word.toLowerCase());
		}
	}
}
