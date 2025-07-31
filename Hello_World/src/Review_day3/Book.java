package Review_day3;

public class Book {
	
	String title;
	String author;
	int price;
	
	
	public Book() {
		this.title = "제목없음";
		this.author = "저자미상";
		this.price = 0;
	}
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author=author;
		this.price=price;
	}
	
	
	public void bookInfo() {
		System.out.println("책 제목 : " + title + ", 저자 : " + author+ ", 가격 : " + price);
	}
	
	
	
	public void setInfo(String title, String author, int price) {
		this.title = title;
		this.author=author;
		this.price=price;
	}
	
	
	public void discount(int dis) {
		if(this.price < dis) {
			System.out.println("할인 금액이 너무 큽니다. 가격은 0으로 설정됩니다.");
			this.price = 0;
			}else {
				this.price -= dis;
			}
		
	}
	
	public int getPrice() {
		return this.price;
	}
	
	
	
	
	
}
