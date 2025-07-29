package Review_day1;

public class IPTV extends ColorTV{
	
	String ip;
	
	IPTV(String ip, int size, int color){
		super(size, color);
		this.ip = ip;
	}
	
	//오버라이드 -> printProperty에서 ColorTV에서 정의한 메소드를 추가해서 재정의(ip추가)
	void printProperty() {
		System.out.println("나의 IPTV는 " + ip + "주소의 ");
		super.printProperty();
	}

}
