public class Magazine extends LibraryItem{
	private String issueDate;
	private String publisher;
	
	public Magazine(String title, String itemID, String issueDate, String publisher){
		super(title, itemID);
		this.issueDate = issueDate;
		this.publisher = publisher;
	}
	
	//getter for issueDate
	public String getIssueDate(){
		return this.issueDate;
	}
	
	//setter for issueDate
	public void setIssueDate(String issueDate){
		this.issueDate = issueDate;
	}
	
	//getter for publisher
	public String getPublisher(){
		return this.publisher;
	}
	
	//setter for publisher
	public void setPublisher(String publisher){
		this.publisher = publisher;
	}
	
	public void displayItemDetails() {
        super.displayItemDetails();
        System.out.println("Issue Date: " + issueDate+"\nPublisher: " + publisher);
    }
}