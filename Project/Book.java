public class Book extends LibraryItem{
	private String author;
	private int numPages;
	
	public Book(String title, String itemID, String author, int numPages){
		super(title, itemID);
		this.author = author;
		this.numPages = numPages;
	}
	
	//getter for author
	public String getAuthor(){
		return this.author;
	}
	
	//setter for author
	public void setAuthor(String author){
		this.author = author;
	}
	
	//getter for numPages
	public int getNumPages(){
		return this.numPages;
	}
	
	//setter for numPages
	public void setNumPages(int numPages){
		this.numPages = numPages;
	}
	
	public void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("Author: " + author+"\nNumber of Pages: " + numPages);
    }
	
}
	