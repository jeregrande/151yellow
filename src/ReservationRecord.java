
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservationRecord {
	private String username;
	private int roomNumber;
	private String startDate;
	private String endDate;
	
	
	public ReservationRecord(String username, int roomNumber, String startDate, String endDate) {
		this.username = username;
		this.roomNumber = roomNumber;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public ReservationRecord(Account a, Room r) {
		this.username = a.getUsername();
		this.roomNumber = r.getRoomNumber();
		this.startDate = r.getStartDate();
		this.endDate = r.getEndDate();
	}

	public String getUsername() {
		return username;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getEndDate() {
		return endDate;
	}
	
}