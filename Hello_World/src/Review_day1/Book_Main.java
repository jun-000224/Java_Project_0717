package Review_day1;

public class Book_Main {

	public static void main(String[] args) {
		
		Book b = new Book("헝거게임",	"나", "좋은 책", 12000);
		Book b2 = new Book("트와일라잇", "너", "재밌는 책", 15000);
		
		b.setprice(25000);
		
		System.out.println(b2.getTitle());
		b.printInfo();
		
		
		
	}

}
