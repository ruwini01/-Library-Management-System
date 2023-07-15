public abstract class LibraryItem{
	private String title;
	private String itemID;
	private boolean checkOut;
	
	public LibraryItem(String title, String itemID){
		this.title = title;
		this.itemID = itemID;
		this.checkOut = false;
		
	}
	
	//getter for title
	public String getTitle(){
		return this.title;
	}
	
	//setter for title
	public void setTitle(String Title){
		this.title = title;
	}
	
	//getter for itemID
	public String getItemID(){
		return this.itemID;
	}
	
	//setter for itemID
	public void setItemID(String itemID){
		this.itemID = itemID;
	}
	
	public void checkOut(){
        if(!checkOut){
			checkOut = true;
            System.out.println(title + " has been checked out");
        } 
		else{
            System.out.println(title + " is already checked out");
        }
    }
	
	public void checkIn() {
        if(checkOut){
			checkOut = false;
           System.out.println(title + " has been checked in");
        } 
		else{
            System.out.println(title + " is already checked in");
        }
    }
	
	public void displayItemDetails(){
		System.out.println( "Title: "+this.title+"\nItem ID: "+itemID+"\n"+"Checked Out: "+(checkOut ? "Yes" : "No"));
	}
	
}