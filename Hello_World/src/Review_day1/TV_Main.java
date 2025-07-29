package Review_day1;

public class TV_Main {
	public static void main(String[] args) {
		
		//지금까지 만들어놓은 생성자로 객체 생성
		
		
		//컬러티비 객체 생성
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		
		IPTV iptv = new IPTV("AIDKJQED", 50, 2048);
		iptv.printProperty();
		
	}

}
