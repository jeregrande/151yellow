package login;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class login {

	static char loginType;
	private String startDate;
	private String endDate;
	ArrayList<account>accounts = new ArrayList<account>();

	public  void selectLogin()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("[G]uest or [M]anager");
		String selection = in.nextLine();
		
		if (selection.equals("g")) 
		{
			loginType = 'g';
			System.out.println("[S]ignup or [L]ogin");
			String input = in.nextLine();
			if(input.equals("s"))
			{
				signup();
			}
			else if(input.equals("l"))
			{
				checkGuestUsername();
			}
			else
			{
				System.out.println("Please enter either s or l . ");
				selectLogin();
			}
			
		}
		else if (selection.equals("m"))
		{
			System.out.println("Manager Option not Implemented.");
			selectLogin();
		} 
		else
		{
			System.out.println("Please type either g or m.");
			selectLogin();
		}
	}

	public  void checkGuestUsername() 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please input username.");
		String usernameInput = in.nextLine();
		for(int i=0; i < accounts.size(); i++)
		{
			if(accounts.get(i).getUsername().equals(usernameInput) )
			{
				checkGuestPassword(i);
			}
		}
		System.out.println("Wrong user");
		checkGuestUsername();
	}

	public void checkGuestPassword(int i)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter password.");
		String passwordInput = in.next();
		if(accounts.get(i).getPassword().equals(passwordInput))
		{
			loadGuestMenu();
		}
		else
		{
			System.out.println("Wrong password");
			checkGuestUsername();
		}
	}

	public  void loadGuestMenu() 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("[M]ake a reservation or [V]iew reservation or [Q]uit.");
		String selection = in.nextLine();

		if (selection.equals("m")) 
		{
			System.out.println("[M] chosen.");
			try {
				makeReservation();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (selection.equals("v")) 
		{
			System.out.println("[V] chosen.");
			viewReservation();
		}
		else if (selection.equals("q")) 
		{
			System.out.println("something");
			return;
		}
		else
		{
			System.out.println("Please type m, v, or q");
			loadGuestMenu();
		}
	}

	public void makeReservation() throws ParseException //split into 2 methods
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input Start Date");
		String input = in.nextLine();
		System.out.println("Input End Date");
		String input1 = in.nextLine();
		try {
			setReservationPeriod(input, input1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Select room number from 1 to 20. 1 to 10 are Premium ($300) and 11 to 20 are Standard ($100)");
		int number = in.nextInt();
		Date sDate = new SimpleDateFormat("MM/dd/yyyy").parse(startDate);
		Date eDate = new SimpleDateFormat("MM/dd/yyyy").parse(endDate);
		Room room = new Room(number, sDate, eDate, 0, false);
		if(number >= 1 && number <= 10)
		{
			room.setRoomType(0);
		}
		else if(number >= 11 && number <= 20)
		{
			room.setRoomType(1);
		}
		else {
			{
				System.out.println("Please input a number from 1 to 20");
				makeReservation();
			}
		}
		
		loadGuestMenu();
	}
	
	public void viewReservation()
	{
		System.out.println(getReservationPeriod());
		
		loadGuestMenu();
	}
	
	public void setReservationPeriod(String startDate, String endDate) throws Exception{
		this.startDate = startDate;
		this.endDate = endDate;
		Date sDate = new SimpleDateFormat("MM/dd/yyyy").parse(startDate);
		Date eDate = new SimpleDateFormat("MM/dd/yyyy").parse(endDate);
		System.out.println(getTotalDays(sDate, eDate));
		
	}
	
	public static long getTotalDays(Date startDate, Date endDate){
		long difference = endDate.getTime() - startDate.getTime();
		System.out.println("Total Days Booked is ");
		return  TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
	}
	
	public String getReservationPeriod(){
		return "Start Date is " + startDate + ": End Date is " + endDate;
	}
	
	
	public  void signup()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please input username.");
		String userID = in.nextLine();
		for(int i = 0; i < accounts.size(); i++)
		{
			if(accounts.get(i).getUsername().equals(userID))
			{
				System.out.println("Username already taken.");
				signup();
			}
		}
		System.out.println("Please input password.");
		String password = in.nextLine();
		System.out.println("Please input password again.");
		String confirmPassword = in.nextLine();
		if(password.equals(confirmPassword))
		{
			System.out.println("Please input first name.");
			String inputFName = in.nextLine();
			System.out.println("Please input last name.");
			String inputLName = in.nextLine();
			account newAccount = new account(userID, password, inputFName, inputLName);
			accounts.add(newAccount);
			System.out.println("Account has been created.");
			selectLogin();
		}
		else
		{
			System.out.println("Password does not match. Please try again.");
			signup();
		}
	}
	
	public static void main(String[] args) {
		boolean quit = true;

		while (quit) 
		{
			login log = new login();
			log.selectLogin();
			quit = false; 
		}
		System.out.println("Thank You and Have a Nice Day!");
	}
}
