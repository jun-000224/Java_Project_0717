package Quiz;

public class BookMain {
	public static void main(String[] args) {
	    EBook ebook = new EBook("자바의 정석", "홍길동", 5.2);
	    ebook.setTitle("Good JAVA");
	    ebook.setFileSize(3.8);
	    ebook.printInfo();
		
		 EBook defaultEBook = new EBook();  // 제목과 저자 Unknown, 파일 크기 0.0
		 defaultEBook.printInfo();

		 EBook ebook2 = new EBook("재밌는 오라클", "김철수", 4.5);
		 ebook2.setFileSize(6.0);
		 ebook2.printInfo();
		
		
		
	}

}
