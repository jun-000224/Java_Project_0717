package Review_day3;

public class Fruit {
	private String name;
	private String color;
	private int price;
	
	public Fruit() {}
	public Fruit(String name) {}
	public void sell() {
		System.out.println(name + "를 판매했습니다.");
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		String status = "M"; // M이 관리자라고 가정
		if(!status.equals("M")) {
			System.out.println("수정 권한이 없습니다.");
			return;
		}
		if(price <= 0) {
			System.out.println("가격을 다시 확인해주세요.");
			return;
		}
		
		this.price = price;
	}
}