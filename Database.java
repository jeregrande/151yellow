package hotelReservationSystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Database class has all the data structure to store account rooms and reservation records
 * Database class is the model which is passed between all views
 * @author Jeremiah, Justin, Sanford
 *
 */
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
	
	
	public ArrayList<ReservationRecord> getGuestRecord (int accountID){
		ArrayList<ReservationRecord> records = new ArrayList<ReservationRecord>();
		for(int i=0; i<reservationRecords.size();i++) {
			if(reservationRecords.get(i).getUsername().equals(accounts.get(accountID).getUsername())) {
				records.add(reservationRecords.get(i));
			}
		}
		return records;
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
	
	public String getLastAddedReservation(int accountID){
		return accounts.get(accountID).getUsername() + "\n" +  "Room Number: " + reservationRecords.get(reservationRecords.size()-1).getRoomNumber() +
				" | Check In Date: " + reservationRecords.get(reservationRecords.size()-1).getStartDate() + " | Check Out Date: " + 
				reservationRecords.get(reservationRecords.size()-1).getEndDate();
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
	
	public long getTotalDays(String start, String end) throws ParseException{
		Date sDate = new SimpleDateFormat("MM/dd/yyyy").parse(start);
		Date eDate = new SimpleDateFormat("MM/dd/yyyy").parse(end);
		long difference = eDate.getTime() - sDate.getTime();
		return TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
	}
	
	public double getTotalCost(int accountID) throws ParseException{
		ArrayList<ReservationRecord> rec = new ArrayList<ReservationRecord>();
		for(int i=0; i<reservationRecords.size();i++) {
			if(reservationRecords.get(i).getUsername().equals(accounts.get(accountID).getUsername())) {
				rec.add(reservationRecords.get(i));
			}
		}
		double standard = 0;
		double premium = 0;
		double total = 0;
		System.out.println(rec.size());
		for(int i=0; i<rec.size(); i++) {
			if(rec.get(i).getRoomNumber() >= 11 && rec.get(i).getRoomNumber() <=20) {
				String startDate = rec.get(i).getStartDate();
				String endDate = rec.get(i).getEndDate();
				long days = getTotalDays(startDate, endDate);
				
				standard += (100 * days);
			}
			else {
				String startDate = rec.get(i).getStartDate();
				String endDate = rec.get(i).getEndDate();
				long days = getTotalDays(startDate, endDate);
				premium += (300 * days);
			}
		}
		total = standard + premium;
		return total;
	}
	
	public ReservationRecord lastAdded (int accountID) {
		return reservationRecords.get(reservationRecords.size() - 1);
	}
	
	public double getSingleCost(int accountID) throws ParseException {
		if(lastAdded(accountID).getRoomNumber() >= 11 && lastAdded(accountID).getRoomNumber() <=20) {
			return 100 * getTotalDays(lastAdded(accountID).getStartDate(), lastAdded(accountID).getEndDate());
		}
		else {
			return 300 * getTotalDays(lastAdded(accountID).getStartDate(), lastAdded(accountID).getEndDate());
		}
	}
	public void saveText(){
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try{
			fw = new FileWriter("reservations.txt");
			bw = new BufferedWriter(fw);
			
			for(Account a: accounts){
				bw.write("1 "+ a.getUsername()+ " " + a.getPassword() + " " + a.getinputFName()+ " "+ a.getinputLName());
			}
			for(Room r: rooms){
				bw.write("2 " + r.getRoomNumber() + " " + r.getType() + " " + r.getStartDate() + " " + r.getEndDate());
			}
			for(ReservationRecord rr: reservationRecords){
				bw.write("3 " + rr.getUsername() + " " + rr.getRoomNumber() + " "+ rr.getStartDate() + " " + rr.getEndDate());
			}		
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} 
			catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	
	public void load(){
		FileReader fr = null;
		BufferedReader br = null;
		boolean done = false;
		
		try{
			fr = new FileReader("reservations.txt");
			br = new BufferedReader(fr);
			
			ArrayList<Account> acc = new ArrayList<Account>();
			ArrayList<Room> rm = new ArrayList<Room>();
			ArrayList<ReservationRecord> reserve = new ArrayList<ReservationRecord> ();
			
			String currentLine;
			while(!done){
				currentLine = br.readLine();
				if(currentLine ==null){
					done = true;
				}
				else{
					for(Account a: accounts){
						System.out.println("Username: " + a.getUsername()+ " Password: " + a.getPassword() +" First Name: " + a.getinputFName()+ " Last Name: "+ a.getinputLName());
						acc.add(a);
					}
					for(Room r: rooms){
						System.out.println("Room Number: " + r.getRoomNumber() + " Rm Type: " + r.getType() + " Start Date: " + r.getStartDate() + " End Date: " + r.getEndDate());
						rm.add(r);
					}
					for(ReservationRecord rr : reservationRecords){
						System.out.println("Username: " + rr.getUsername() + " Room Number#:  " + rr.getRoomNumber() + " Start Date: " + rr.getStartDate() + " End Date: " + rr.getEndDate());
						reserve.add(rr);
					}
				}
			}
		}catch (IOException e) {

			e.printStackTrace();

		} 
		finally {

			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} 
			catch (IOException ex) {

				ex.printStackTrace();
			}
		}
	}
	
	//For view-by-day info
	public List<Integer> getAvailableRooms(String date) throws ParseException {
		List<Integer> openRooms = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

		for (int i = 0; i < reservationRecords.size(); i++) {
			if (compareDay(date, reservationRecords.get(i).getStartDate()) == 1
					|| compareDay(date, reservationRecords.get(i).getEndDate()) == 1 || isBetween(date,
							reservationRecords.get(i).getStartDate(), reservationRecords.get(i).getEndDate()) == 1) {
				openRooms.remove(reservationRecords.get(i).getRoomNumber());
			}
		}
		return openRooms;
	}

	public ArrayList<ReservationRecord> getReservedRooms(String date) throws ParseException {
		ArrayList<ReservationRecord> bookedRooms = new ArrayList<ReservationRecord>();
		for (int i = 0; i < reservationRecords.size(); i++) {
			if (compareDay(date, reservationRecords.get(i).getStartDate()) == 1
					|| compareDay(date, reservationRecords.get(i).getEndDate()) == 1 || isBetween(date,
							reservationRecords.get(i).getStartDate(), reservationRecords.get(i).getEndDate()) == 1) {
				String username = reservationRecords.get(i).getUsername();
				int roomNumber = reservationRecords.get(i).getRoomNumber();
				String startDate = reservationRecords.get(i).getStartDate();
				String endDate = reservationRecords.get(i).getEndDate();
				ReservationRecord booked = new ReservationRecord(username, roomNumber, startDate, endDate);
				bookedRooms.add(booked);
			}
		}
		return bookedRooms;
	}

}