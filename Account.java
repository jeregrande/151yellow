package management;

public class Account {
	private String username;
	private String password;
	private String inputFName;
	private String inputLName;
	
	public Account(String username, String password, String inputFName, String inputLName)
	{
		this.username = username;
		this.password = password;
		this.inputFName = inputFName;
		this.inputLName = inputLName;
	}
	
	public String getUsername() 
	{
		return username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String getinputFName()
	{
		return inputFName;
	}
	
	public String getinputLName(){
		return inputLName;
	}

	public void setUserID(String username) 
	{
		this.username = username;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public void setFName(String fName)
	{
		this.inputFName = fName;
	}
	
	public void setLName(String lName){
		this.inputLName = lName;
	}
}