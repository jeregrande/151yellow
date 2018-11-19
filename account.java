package login;

public class account {
	private String username;
	private String password;
	private String name;
	
	public account(String u, String p, String n)
	{
		username = u;
		password = p;
		name = n;
	}
	
	public String getUsername() 
	{
		return username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String getName()
	{
		return name;
	}

	public void setUserID(String username) 
	{
		this.username = username;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
