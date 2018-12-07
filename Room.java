package management;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Room {
	private int roomNumber;
	private int type;
	private String startDate;
	private String endDate;
	private final int Premium = 300;
	private final int Standard = 100;
	
	public Room(int r, int t, String s, String e)
	{
		this.roomNumber = r;
		this.type = t;
		this.startDate = s;
		this.endDate = e;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public int getType() {
		return type;
	}
	public String getStartDate() {
		return startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public long getTotalDays(String start, String end) throws ParseException {
		Date sDate = new SimpleDateFormat("MM/dd/yyyy").parse(startDate);
		Date eDate = new SimpleDateFormat("MM/dd/yyyy").parse(endDate);
		long difference = eDate.getTime() - sDate.getTime();
		return TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public void setType(int type) {
		this.type = type;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
}