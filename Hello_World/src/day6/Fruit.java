package day6;

public class Fruit {
	
	String name;
	private int price; //민감한 정보는 private로 막기
	
	
	void info() {
		System.out.println(name + "의 가격은 " + price + "입니다.");
	}
	
//	int getPrice() {
//		return price;
//	}
//	
//	void setPrice(int price) { //set으로는 입력값을 제어할 수 있음.
//		if(price<= 0 || price >= 10000) {
//			System.out.println("가격을 다시 확인해주세요.");
//		}
//		else  {
//			this.price = price;		
//		}
//	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//생성자
	Fruit(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	
	
	
	

}
