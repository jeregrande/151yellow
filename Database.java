package management;

import java.awt.List;
import java.io.FilterInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import javax.xml.transform.Templates;

public class Database {
	
	private ArrayList<Account>accounts;
	private ArrayList<Room>rooms;
	
	public Database() {
		accounts = new ArrayList<Account>();
		rooms = new ArrayList<Room>();
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
	
	public boolean checkLogin(String u, String p) {
		for(int i = 0; i < accounts.size() ; i++) {
			if(accounts.get(i).getUsername().equals(u))
			{
				if(accounts.get(i).getPassword().equals(p))
				{
					return true;
				}
				else {
					return false;
				}
			}
		}
		return false;
	}
	
	public ArrayList<Room> getRooms() {
		return rooms;
	}
	
	public int compareDay(String inputDate, String currentDate) throws ParseException{
		Date sDate = new SimpleDateFormat("MMddyyyy").parse(inputDate );
		Date eDate = new SimpleDateFormat("MMddyyyy").parse(currentDate);
		Calendar calS = new GregorianCalendar(sDate.getYear(), sDate.getMonth(), sDate.getDay());
		Calendar calE = new GregorianCalendar(eDate.getYear(), eDate.getMonth(), eDate.getDay());
		boolean compare = calS.equals(calE);
		if(compare == true) {
			return 1;
		}
		return -1;
	}
	
	public int compareBeforeDay(String inputStartDate, String currentEndDate) throws ParseException{
		Date sDate = new SimpleDateFormat("MMddyyyy").parse(inputStartDate );
		Date eDate = new SimpleDateFormat("MMddyyyy").parse(currentEndDate);
		Calendar calS = new GregorianCalendar(sDate.getYear(), sDate.getMonth(), sDate.getDay());
		Calendar calE = new GregorianCalendar(eDate.getYear(), eDate.getMonth(), eDate.getDay());
		boolean compare = calS.before(calE);
		if(compare == true) {
			return 1;
		}
		return -1;
	}
	
	public int compareAfterDay(String inputStartDate, String currentStartDate) throws ParseException{
		Date sDate = new SimpleDateFormat("MMddyyyy").parse(inputStartDate );
		Date eDate = new SimpleDateFormat("MMddyyyy").parse(currentStartDate);
		Calendar calS = new GregorianCalendar(sDate.getYear(), sDate.getMonth(), sDate.getDay());
		Calendar calE = new GregorianCalendar(eDate.getYear(), eDate.getMonth(), eDate.getDay());
		boolean compare = calS.after(calE);
		if(compare == true)
		{
			return 1;
		}
		return -1;
	}
	
	public void addRooms(Room r) {
		rooms.add(r);
	}
	
	public java.util.List<Integer> checkRoom(String startDate, String endDate) throws ParseException {
		java.util.List<Integer> openRooms = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
		
		for(int i = 0; i < rooms.size(); i++)
		{
			String currentStartDate = rooms.get(i).getStartDate();
			String currentEndDate = rooms.get(i).getEndDate();
			int roomNumber = rooms.get(i).getRoomNumber();
			
			if(compareDay(startDate, currentStartDate)== 1 || compareDay(endDate, currentStartDate)==1 || compareDay(endDate, currentEndDate)==1) {
				openRooms.remove(roomNumber);
			}
			else if((compareAfterDay(startDate, currentStartDate) ==1 && compareBeforeDay(startDate, currentEndDate) ==1) || 
					(compareAfterDay(endDate, currentStartDate) ==1 && compareBeforeDay(endDate, currentEndDate) ==1)||
					(compareAfterDay(endDate, currentEndDate)==1 && compareBeforeDay(startDate, currentEndDate)==1)) {
				openRooms.remove(roomNumber); 	
			}
		}
		return openRooms;
	}			
}
