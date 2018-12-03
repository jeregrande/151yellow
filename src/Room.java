import java.util.Date;
import java.util.Scanner;


public class Room {

	private String roomNumber; 
	private final int luxuriousRoom = 300;
	private final int economicRoom = 100;
	private int totalCost;
	private Date startDate;
	private Date endDate;
	private int roomType;
	private boolean isBooked = false;
	
	public Room(String roomNumber,Date startDate,  Date endDate, int roomType, boolean isBooked){
		this.roomNumber = roomNumber;
		this.startDate = startDate;
		this.endDate = endDate;
		this.roomType = roomType;
		this.isBooked = isBooked;
	}
	
	public void bookRoom(){
		isBooked = true;
	}
	
	public void setRoomType(int value){
		if(value ==0){
			roomType = luxuriousRoom;
		}
		else{
			roomType = economicRoom;
		}
	}
	
	public void printRmNumber(ReservationRecord room){
		roomNumber = String.valueOf(room.getRoomNumber());
		System.out.println("Your reserved room number is: " + roomNumber);
	}
	
	public double getTotalCost(ReservationRecord userReservation){
		
		if(userReservation.getRoomNumber() >= 1 && userReservation.getRoomNumber() <=10){
			totalCost = (int) (luxuriousRoom * ReservationRecord.getTotalDays(startDate, endDate));
		}
		else if(userReservation.getRoomNumber() >= 11 && userReservation.getRoomNumber() <=20){
			totalCost = (int) (economicRoom * ReservationRecord.getTotalDays(startDate, endDate));
		}
		
		return totalCost;
	}
	
}
