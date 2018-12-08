package hotelReservationSystem;

public class Manager {

	private String username;
	private String password;

	public Manager(String user, String pass) {
		username = user;
		password = pass;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String newName) {
		username = newName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String newPass) {
		password = newPass;
	}

}
