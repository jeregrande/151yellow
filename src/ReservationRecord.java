import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *  Each reservation record knows who made this reservation, which room is assigned, 
 *  and the period of the reservation
 * @author sanford
 *
 */
public class ReservationRecord{

	private String firstName;
	private String lastName;
	private int roomNumber;
	private String startDate;
	private String endDate;
	private int roomType;
	
	//private double numberOfNights;
	//private int nextID = 0;
	

	
	public ReservationRecord(String firstName, String lastName, int roomNumber, String startDate, String endDate, int roomType){
		this.firstName = firstName;
		this.lastName = lastName;
		this.roomNumber = roomNumber;
		this.startDate = startDate;
		this.endDate = endDate;
		this.roomType = roomType;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setReservationPeriod(String startDate, String endDate){
		this.startDate = startDate;
		this.endDate = endDate;
	}
	

//	public void dateConversion(){
//		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
//		Date startDay = null;
//		try{
//			Date startingDay = format.parse(startDate);
//			
//			Date endingDay = format.parse(endDate);
//			long difference = 
//			
//			//double totalDays = endingDay - startingDay;
//		}catch (ParseException e){
//			
//		}
//		
//		int startValue;
//		
//		
//	}
	public static long getTotalDays(Date startDate, Date endDate){
		long difference = endDate.getTime() - startDate.getTime();
		return TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
	}
	
	public String getReservationPeriod(){
		return startDate + ": " + endDate;
	}
	
	public void setRoomNumber(int roomNumber){
		this.roomNumber = roomNumber;
	}
	
	public int getRoomNumber(){
		return roomNumber;
	}
	public String toString(){
		return ("Reservation Creator " + firstName + lastName + "Period of Reservation from " + startDate + "to end date " + endDate + "For room number " + roomNumber);
	}
	
	public String print(){
		return this.toString();
	}

	
//	public void uploadRerservations(String fileName){
//		
//		try(BufferedReader br = new BufferedReader(new FileReader(new File(fileName)))){
//			int numOfReservations = numberOfReservations(fileName);
//			
//			assignments = reArrangeReservations(assignments.length + numOfReservations);
//			
//			String hasLine = null;
//			while ((hasLine = br.readLine()) != null) {
//				String[] reservationDetail = hasLine.split(" ");
//				
//				String firstName = reservationDetail[1];
//				String lastName = reservationDetail[2];
//				
//				int nightsStaying = Integer.parseInt(reservationDetail[3]);
//				double rate = Double.parseDouble(reservationDetail[4]);
//				assignments[nextID++] = new ReservationRecord(firstName,lastName,nightsStaying,rate);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		
//	}
//	
//	//change names
//	private ReservationSystem[] reArrangeReservations(int length) {
//		ReservationSystem[] newReservation = new ReservationSystem[length+1];
//		for (int i=0; i< assignments.length; i++){
//			newReservation[i] = assignments[i];
//		}
//		return null;
//	}
//
//	private int numberOfReservations(String fileName){
//		int numOfReservations = 0;
//		try(BufferedReader br = new BufferedReader(new FileReader(new File(fileName)))){
//			String hasLine = null;
//			while ((hasLine = br.readLine()) != null) {
//				numOfReservations++;
//			}
//		}
//		catch(FileNotFoundException e){
//			e.printStackTrace();
//		}
//		catch(IOException e){
//			e.printStackTrace();
//		}	
//		return numOfReservations;
//	}
}
