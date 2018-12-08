package hotelReservationSystem;

public class ReservationRecord {
	private String username;
	private int roomNumber;
	private String startDate;
	private String endDate;

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
