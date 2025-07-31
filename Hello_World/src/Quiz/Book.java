package Quiz;

class Book {
    private String title;
    private String author;
    
    public Book(){
    	this.title = "Unknown";
    	this.author = "Unknown";
    }

    public Book(String title, String author) {
        this.title = title; this.author = author;
    }

    protected void setTitle(String title) { this.title = title; }
    protected void setAuthor(String author) { this.author = author; }

    protected String getTitle() { return title; }
    protected String getAuthor() { return author; }

	public void setFileSize(double d) {
		// TODO Auto-generated method stub
		
	}
}

