package Review_day3;

public class Fruit {
	String name;
	String color;
	int price;
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		String status = "M" //M이 마스터라고 가정
		if(price <= 0 ) {
			System.out.println("가격을 다시 확인해 주세요.");
	} else {
		this.price = price;
		System.out.println();

		}
	}

}
