import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ReservationRecord {
	private String username;
	private int roomNumber;
	private String startDate;
	private String endDate;
	
	private int totalCost;
	private final int luxuriousRoom = 300;
	private final int economicRoom = 100;
	
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

	public long getTotalDays(String start, String end) throws ParseException{
		Date sDate = new SimpleDateFormat("MM/dd/yyyy").parse(startDate);
		Date eDate = new SimpleDateFormat("MM/dd/yyyy").parse(endDate);
		long difference = eDate.getTime() - sDate.getTime();
		return TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
	}
	
	public double getTotalCost(ReservationRecord user) throws ParseException{
		
		if(user.getRoomNumber() >=1 && user.getRoomNumber() <=10){
			totalCost = (int) (luxuriousRoom * user.getTotalDays(user.getStartDate(), user.getEndDate()));
		}else if(user.getRoomNumber() >=11 && user.getRoomNumber() <= 20){
			totalCost = (int) (economicRoom *user.getTotalDays(user.getStartDate(), user.getEndDate()));
		}
		else{
			System.out.println("Cost is wrong");
		}
		return totalCost;
	}
	
	public void displayReceipt(Account a, Room r) throws ParseException{
		ReservationRecord record = new ReservationRecord(a,r);
		
		System.out.println("You have booked room number: " + record.getRoomNumber() + "Your state date is:  " + record.getStartDate()
		+"You end date is : " + record.getEndDate() + "And the total cost of stay is: " + record.getTotalCost(record) + "Days staying: "
		+record.getTotalDays(startDate, endDate));
		
	}

}