package day6;

public class Car_Test {

	
	//필드 영역
	private String name;
	private String color;
	private int speed;
	
	
	//생성자 영역
	
	
	//파라미터를 받는 생성자
	Car_Test(String name, String color, int speed){
//		this(name, color, speed); 
		this.name = name;          //각각의 필드 영역에 초기화
		this.color = color;
		this.speed = speed;
	}
	
	
	
	//기본 생성자 -> Car_Test()라는 빈 생성자가 있기 때문, 즉 기본 생성자
	Car_Test() {
		this("기본차", "하얀색", 0); //다른 생성자를 호출하는 함수
//		this.name = "기본차";
//		this.color = "하얀색";
//		this.speed = 0;
	}
	
	
	
	
	void carInfo() {
		System.out.println("자동차의 이름은 " + name + ", 색상은 " + color + "입니다.");
	}		
		
		
		
	//간접 허용
	void setInfo(String name, String color, int speed){
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	void speedUp(int speed) {
		if(this.speed + speed > 200) {
			System.out.println("200초과 불가. 200으로 변경됩니다.");
			this.speed = 200;
		}
		else {
			this.speed += speed;
		}
	}
		
	void speedDown(int speed) {
		if(this.speed - speed < 0) {
			System.out.println("0미만 불가. 0으로 변경합니다.");
			this.speed = 0;
		}
		else {
			this.speed -= speed;
		}
	}
}