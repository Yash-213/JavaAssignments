package oops;

// Interface for checking book available or not
// Ready for borrow and return
interface Borrowbook {
	void borrowBook();
	void returnBook();
}

// implemented abstract class for library book 
abstract class LibraryBook {
	private int bookID; // book ID
	private String title; // Book title
	
	public LibraryBook(int bookID, String title) {
		this.bookID = bookID;
		this.title = title;
	}
//	use Encapsulation
//	accessing class by using getter and setter methods
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookTitle() {
		return title;
	}
	public void setBookTitle(String title) {
		this.title = title;
	}
	
	public abstract void displayDetails(); //Abstract class for Display details 
}
class Book extends LibraryBook implements Borrowbook{
	private String author;
	private boolean buy;
//	Encapsulation
	public Book(int bookID, String title, String author) {
		super(bookID, title);
		this.author = author;
		this.buy = false;
	}
//	Accessing using getter and setter 
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
//	Show book is borrowed or Not
	@Override
	public void borrowBook() {
		if(!buy) {
			buy = true;
			System.out.println(getBookTitle() + " has been borrowed");
		} else {
			System.out.println(getBookTitle() + " is already borrowed");
		}
	}
//	tell us book is returned or Not 
	@Override
	public void returnBook() {
		if(buy ) {
			buy = false;
			System.out.println(getBookTitle() + " has been returned");
		} else {
			System.out.println(getBookTitle() + " was not borrowed");
		}
	}
//	for display overall details about books
	@Override
	public void displayDetails() {
		System.out.println("Book ID: " + getBookID());
        System.out.println("Title: " + getBookTitle());
        System.out.println("Author: " + author);
        System.out.println("Borrowed: " + buy);
	}
}

public class LibraryManagementSystem {

	public static void main(String[] args) {
		Book book1 = new Book(101, "Java Programming", "James Gosling");
		
//		Show all book details
		System.out.println("Library Book Details: ");
		book1.displayDetails();
	
//		Tell us book is for borrowing or Not
		System.out.println("Buy Book: ");
		book1.borrowBook();
	
//		Tell us book is returned or Not 
		System.out.println("Return Book: ");
		book1.returnBook();
	}

}
