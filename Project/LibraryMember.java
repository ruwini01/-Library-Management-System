public class LibraryMember{
	private String memberID;
	private String name;
	
	public LibraryMember(String memberID, String name){
		this.memberID = memberID;
		this.name = name;
	}
	
	//getter for memberID
	public String getMemberID(){
		return this.memberID;
	}
	
	//setter for memberID
	public void setMemberID(String memberID){
		this.memberID = memberID;
	}
	
	//getter for name
	public String getName(){
		return this.name;
	}
	
	//setter for name
	public void setName(String Name){
		this.name = name;
	}
	
	public void displayMemberDetails(){
		System.out.println("Member ID: "+this.memberID+"\nName: "+this.name);
	}
}