package day6;

public class FruitMain {

	public static void main(String[] args) {
		
		Fruit banana = new Fruit("바나나", 1000);
		int price = banana.getPrice();
		//과연 바나나의 가격을 아무나 수정해도 될까?
		
		System.out.println(price);
		
		banana.setPrice(2000);
		System.out.println(banana.getPrice());

	}

}
