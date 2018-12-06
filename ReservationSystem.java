package login;

import java.util.*;

public class ReservationSystem {

	private ArrayList<ReservationRecord> records;
	//make 20 room objects and put them in the room 
	private Room[] rooms = new Room[20];

	//if you book a room, it gets added into the reservationRecord
	
	
	public ReservationSystem(){
		records = new ArrayList<ReservationRecord>();
	}
	
	//adds to the arraylist
	public void addRoom(ReservationRecord addRoom){
		records.add(addRoom);
	}
	
	public void bookRoom(){
		//create a reservation record
		//createReservationRecord(firstName, lastName, roomNumber, startDate, endDate, roomType) 
		
		//add reservation records to the arraylist 
		//addRoom(ReservationRecord)
		//mark room is booked 
	}
	
	//need a generic method to start the record 
	public ReservationRecord createReservationRecord(String firstName, String lastName, int roomNumber, String startDate, String endDate, int roomType){
		ReservationRecord record = new ReservationRecord(firstName, lastName, roomNumber, startDate, endDate, roomType);
		return record;
	}
	
	//method that books room using addRoom
	//will use room.isBooked
	//update array of rooms
	
	public static void main(String[] args){
		ReservationRecord r = new ReservationRecord("sanford", "huynh", 10, "nov 3", "nov 4", 0);
	}
}