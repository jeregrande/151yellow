package management;

import java.awt.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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
	
	public long getLength(String start, String end) throws ParseException {
		Date sDate = new SimpleDateFormat("MM/dd/yyyy").parse(start);
		Date eDate = new SimpleDateFormat("MM/dd/yyyy").parse(end);
		long difference = eDate.getTime() - sDate.getTime();
		return TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
	}
	
	public void addRooms(Room r) {
		rooms.add(r);
	}
	
	public java.util.List<Integer> checkRoom(String startDate, String endDate) throws ParseException {
		
		java.util.List<Integer> openRooms = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
		//ArrayList<Integer> openRooms = new ArrayList<>();
		//int[] open = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for(int i = 0; i < rooms.size(); i++) {
				if(getLength(startDate, rooms.get(i).getStartDate()) >= getLength(startDate, endDate)){
					/*for(int roomNumber : open) {
						openRooms.add(roomNumber);
					}
					*/
					return openRooms;
				}
				else if(getLength(startDate, rooms.get(i).getStartDate()) < getLength(startDate, endDate)) {
					int currentRoom = rooms.get(i).getRoomNumber();
					 openRooms.remove(currentRoom);
				}
			
		}
		System.out.println("this");
		return openRooms;
	}
}
