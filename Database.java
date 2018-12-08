package hotelReservationSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Database {
	
	private ArrayList<Account>accounts;
	private ArrayList<Room>rooms;
	private ArrayList<ReservationRecord> reservationRecords;
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	public Database() {
		accounts = new ArrayList<Account>();
		rooms = new ArrayList<Room>();
		reservationRecords = new ArrayList<ReservationRecord>();
	}
	
	public ArrayList<String> getGuestReserverationRecord(int accountID) {
		ArrayList<String> records = new ArrayList<String>();
		
		for(ReservationRecord r: reservationRecords) {
			if(r.getUsername().equals(accounts.get(accountID).getUsername())) {
				int roomNumber = r.getRoomNumber() + 1;
				String startDate = r.getStartDate();
				String endDate = r.getEndDate();
				records.add("Username: " + r.getUsername() + " | Room Number: " + roomNumber + " | Check In Date: " + startDate + " | Check Out Date: " + endDate);
			}
		}
		if(records.size() == 0)
		{
			records.add("Username: " + accounts.get(accountID).getUsername() + " has no reservation(s)!");
			return records;
		}
		return records;
	}
	
	public void deleteReservation(int targetValue)
	{
		reservationRecords.remove(targetValue);
	}
	
	public void saveReservationRecord(int accountID,int roomID ) {
		ReservationRecord reserved = new ReservationRecord(accounts.get(accountID),rooms.get(roomID) );
		reservationRecords.add(reserved);
	}
	
	public String getAccounts(){
		if(accounts.size() != 0){
		for(Account a: accounts) {
			return a.getUsername();
		 }
		}
			return "no accounts";
	}
	
	public void addAccounts(Account a) {
		accounts.add(a);
	}
	
	public boolean checkUsername(String username) {
		for(int i = 0; i < accounts.size() ; i++)
		{
			if(accounts.get(i).getUsername().equals(username))
			{
				return true;
			}
		}
		return false;
	}
	
	public int checkLogin(String u, String p) {
		for(int i = 0; i < accounts.size() ; i++) {
			if(accounts.get(i).getUsername().equals(u))
			{
				if(accounts.get(i).getPassword().equals(p))
				{
					return i;
				}
				else {
					return -1;
				}
			}
		}
		return -1;
	}
	
	public ArrayList<Room> getRooms() {
		return rooms;
	}
	
	public int compareDay(String inputDate, String currentDate) throws ParseException{
		Date sDate = dateFormat.parse(inputDate);
		Date eDate = dateFormat.parse(currentDate);
		Calendar calS = new GregorianCalendar(sDate.getYear(), sDate.getMonth(), sDate.getDate());
		Calendar calE = new GregorianCalendar(eDate.getYear(), eDate.getMonth(), eDate.getDate());
		boolean compare = calS.equals(calE);
		if(compare == true) {
			return 1;
		}
		return -1;
	}
	
	public int compareBeforeDay(String inputDate, String currentDate) throws ParseException{
		Date sDate = dateFormat.parse(inputDate);
		Date eDate = dateFormat.parse(currentDate);
		Calendar calS = new GregorianCalendar(sDate.getYear(), sDate.getMonth(), sDate.getDate());
		Calendar calE = new GregorianCalendar(eDate.getYear(), eDate.getMonth(), eDate.getDate());
		boolean compare = calS.before(calE);
		if(compare == true) {
			return 1;
		}
		return -1;
	}
	
	public int compareAfterDay(String inputDate, String currentDate) throws ParseException{
		Date sDate = dateFormat.parse(inputDate);
		Date eDate = dateFormat.parse(currentDate);
		Calendar calS = new GregorianCalendar(sDate.getYear(), sDate.getMonth(), sDate.getDate());
		Calendar calE = new GregorianCalendar(eDate.getYear(), eDate.getMonth(), eDate.getDate());
		boolean compare = calS.after(calE);
		if(compare == true)
		{
			return 1;
		}
		return -1;
	}
	
	public int isBetween(String inputDate, String currentStartDate, String currentEndDate) throws ParseException{
		Date theDate = dateFormat.parse(inputDate);
		Date startDate = dateFormat.parse(currentStartDate);
		Date endDate = dateFormat.parse(currentEndDate);
		Calendar cal = new GregorianCalendar(theDate.getYear(), theDate.getMonth(), theDate.getDate());
		Calendar calS = new GregorianCalendar(startDate.getYear(), startDate.getMonth(), startDate.getDate());
		Calendar calE = new GregorianCalendar(endDate.getYear(), endDate.getMonth(), endDate.getDate());		
		boolean after = cal.after(calS);
		boolean before = cal.before(calE);
		if(after == true && before == true)
		{
			return 1;
		}
		return -1;
	}
	
	public int addRooms(Room r) {
		rooms.add(r);
		int lastAdded = rooms.size() - 1;
		return lastAdded;
	}
	
	public java.util.List<Integer> checkRoom(String startDate, String endDate) throws ParseException {
		java.util.List<Integer> openRooms = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
		
		for(int i = 0; i < rooms.size(); i++)
		{
			String currentStartDate = rooms.get(i).getStartDate();
			String currentEndDate = rooms.get(i).getEndDate();
			int roomNumber = rooms.get(i).getRoomNumber();
			
			if(compareDay(startDate, currentStartDate)==1||compareDay(startDate, currentEndDate)==1||
					compareDay(endDate, currentStartDate)==1||compareDay(endDate, currentEndDate)==1) {
				openRooms.remove(roomNumber);
			}
			else if((compareBeforeDay(startDate, currentStartDate)==1 && isBetween(endDate, currentStartDate, currentEndDate)==1)
					|| (isBetween(startDate, currentStartDate, currentEndDate)==1)
					||(compareBeforeDay(startDate, currentStartDate)==1 && compareAfterDay(endDate, currentStartDate)==1)) {
				openRooms.remove(roomNumber);
			}
		}
		return openRooms;
	}			

	public boolean correctStartDate(String inputStartDate) throws ParseException {
		Date today = new Date();
		Calendar cal = new GregorianCalendar(today.getYear(), today.getMonth(),today.getDate());
		Date inputDate = dateFormat.parse(inputStartDate);
		Calendar inputCal = new GregorianCalendar(inputDate.getYear(), inputDate.getMonth(), inputDate.getDate());
		if( inputCal.equals(cal) || inputCal.after(cal))
		{
			return true;
		}
		System.out.println("today's date is " + today + " inputDate is " + inputDate +" Result is " + inputCal.equals(cal) + " " + inputCal.before(cal));
		return false;
	}
	
	public boolean correctEndDate(String inputStartDate, String inputEndDate) throws ParseException{
		Date startDate = dateFormat.parse(inputStartDate);
		Date endDate = dateFormat.parse(inputEndDate);
		Calendar calS = new GregorianCalendar(startDate.getYear(), startDate.getMonth(), startDate.getDate());
		Calendar calE = new GregorianCalendar(endDate.getYear(), endDate.getMonth(), endDate.getDate()); 
		if(endDate.after(startDate) && startDate.compareTo(endDate) <= 60) {
			return true;
		}
		
		return false;
	}
	
		// For view-by-room info
	public ArrayList<String> getRoomReservations(int roomNumber) {
		
		
		
		
		ArrayList<String> records = new ArrayList<String>();
		
		// Find all reservations of the given room number
		for (ReservationRecord r : reservationRecords) {
			if (r.getRoomNumber() == roomNumber) {
				String username = r.getUsername();
				String startDate = r.getStartDate();
				String endDate = r.getEndDate();
				
				// Convert the reservation details to a string and add to records
				records.add("Username: " + username + " - Room Number: " + roomNumber + ", " + startDate + " to " + endDate);
			}
		}

		// Return the reservations as an array list
		if (records.size() == 0) {
			records.add("No reservations for room " + roomNumber);
			return records;
		} else {
			return records;
		}
	}
}