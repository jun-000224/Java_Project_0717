package Quiz;

public class EBook extends Book{
	
	
	double size;
	
	
	public EBook() {
		this.size = size;
	}

	public EBook(String title, String author, double size) {
		super(title, author);
		this.size = size;
		
	}

	public void setFileSize(double size) {
		this.size = size;		
	}

	public void printInfo() {
		System.out.println(getTitle() + " - " + getAuthor() + ", 파일의 크기 : " + size + "MB");
	}
	
	

}
