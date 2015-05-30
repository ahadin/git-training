class Book {
	private String bookName;
	public Book(String name) {bookName=name; }

public boolean isBookAvailable() {
	if (bookName=="Java introductionn")	{
		return true;
	}else{
	return false; 
	}
}


public static void main(String[]args) {
	Book b= new Book("janvva Ingroduction");
	
	if (b.isBookAvailable()) {
			System.out.println("Book is available:" + b.bookName);
			}
else {
	System.out.println("Book is not available:" +b.bookName);
}
}
}