package day7;

public class Review_Main1 {

	public static void main(String[] args) {
		Fruit_R apple = new Fruit_R("사과", 1000);
		
	System.out.println(apple.getPrice());
	apple.setPrice(2000);
	
	System.out.println(apple.getPrice());
	}
}
