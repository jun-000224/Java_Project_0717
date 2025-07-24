package day7;

public class Fruit_R {
	//필드
	private String name;
	private  int price;
	
	//생성자
	Fruit_R(String name, int price){
		this.name=name;
		this.price = price;
	}
	
	
	//메소드
	void sell(int x) {
		System.out.println(x + "개를 판매했습니다.");
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int p) {
	    String status = "A"; // 현재 상태 (예: "A"만 수정 권한 있음)

	    if (!status.equals("A")) {
	        System.out.println("가격 수정 권한이 없습니다.");
	        return; // 권한 없으면 메서드 종료
	    }

	    if (p < 0) {
	        System.out.println("가격 확인해 주세요.");
	        return; // 잘못된 가격이면 종료
	    }

	    this.price = p;
	    System.out.println("가격이 수정되었습니다.");
	}

}

