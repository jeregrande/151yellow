package hotel;

public class Account {
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	
	public Account(String u, String p, String f, String l)
	{
		username = u;
		password = p;
		firstName = f;
		lastName = l;
	}	
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
