package Review_day1;

public class Book {
	
	private String title;
	private String author;
	private String publisher;
	private int price;
	
	
	Book(String a, String b, String c, int d){
		this.title = a;
		this.author = b;
		this.publisher = c;
		this.price = d;
	}
	
	public void setprice(int p) {   //세팅만 하는거니까 리턴값이 필요없음.
		this.price = p;
	}
	
	public String getTitle() {
		return title;
	}
	
	
	public void printInfo() {
		System.out.println("도서명 : " + title + "저자 : " + author + "출판사 : " + publisher + "가격 : " + price + "원");
	}
	
	
	
}
