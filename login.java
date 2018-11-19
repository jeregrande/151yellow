package login;

import java.util.Scanner;

public class login {
	
	static char loginType;
	static account guestOne = new account("user", "pass","Tester");
	static String guestUsername = guestOne.getUsername();
	static String guestPassword = guestOne.getPassword();
	static String guestName = guestOne.getName();

	public static void selectLogin()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("[G]uest or [M]anager");
		String selection = in.nextLine();
		
		if (selection.equals("g")) 
		{
			loginType = 'g';
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

	public static void checkGuestUsername() 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please input username");
		String selection = in.nextLine();

		if (selection.equals(guestUsername))
		{
			System.out.println("Welcome back " + guestName+ "!");
		} 
		else 
		{
			System.out.println("Invalid username");
			checkGuestUsername();
		}
	}

	public static void checkGuestPassword() 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please input your password " + guestName + ".");
		String selection = in.nextLine();

		if (selection.equals(guestPassword))
		{
			System.out.println("Login successful.");
		} 
		else 
		{
			System.out.println("Incorrect password.");
			checkGuestPassword();
		}
	}

	public static void loadGuestMenu() 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("[M]ake a reservation or [V]iew reservation or [Q]uit.");
		String selection = in.nextLine();

		if (selection.equals("m")) 
		{
			System.out.println("[M] chosen.");
			makeReservation();
		}
		else if (selection.equals("v")) 
		{
			System.out.println("[V] chosen.");
			loadGuestMenu();
		}
		else if (selection.equals("q")) 
		{
			return;
		}
		else
		{
			System.out.println("Please type m, v, or q");
			loadGuestMenu();
		}
	}

	public static void makeReservation() 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Select Room Type: [P]remium ($300) or [S]tandard ($100)");
		System.out.println("[C]anel");
		String selection = in.nextLine();
		if (selection.equals("p"))
		{
			System.out.println("Premium Selected");
			chooseDateP();
		} 
		else if (selection.equals("s"))
		{
			System.out.println("Standard Selected");
			chooseDateS();
		} 
		else if (selection.equals("c"))
		{
			loadGuestMenu();
		} 
		else 
		{
			System.out.println("Please select a valid option.");
			makeReservation();
		}
	}

	public static void chooseDateP()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please Select Month (1-12)");
		int selection = in.nextInt();
		if(selection < 13 && selection > 0)
		{
			System.out.println("You have selected "+ selection+".");
			System.out.println("Please input year!");
			int input = in.nextInt();
			if(selection == 2 )
			{
				if(input % 4 == 0 && input%100 != 0)
				{
					System.out.println("Leap Year! Please input a number from 1-29");
					int date = in.nextInt();
					if(date < 30 && date > 0)
					{
						System.out.println("You have selected Premium room for " + selection + "/"+ date + "/" + input +"!");
						chooseDateConfirm();
					}
					else
					{
						System.out.println("Please Select a number from 1 to 29");
						chooseDateP();
					}
				}
				else
				{
					System.out.println("Please input a number from 1-28");
					int date = in.nextInt();
					if(date < 29 && date > 0)
					{
						System.out.println("You have selected Premium room for " + selection + "/"+ date + "/" + input +"!");
						chooseDateConfirm();
					}
					else
					{
						System.out.println("Please select a number from 1 to 28");
						chooseDateP();
					}
				}
			}
			else if(selection == 1 ||selection == 3 ||selection == 5 ||selection == 7 ||selection == 8 ||selection == 10 ||selection == 12)
			{
				System.out.println("Please input a number from 1-31");
				int date = in.nextInt();
				if(date < 32 && date > 0)
				{
					System.out.println("You have selected Premium room for " + selection + "/"+ date + "/" + input +"!");
					chooseDateConfirm();
				}
				else
				{
					System.out.println("Please select a number from 1 to 31");
					chooseDateP();
				}					
			}
			else if(selection == 4 ||selection == 6 ||selection == 9 ||selection == 11)
			{
				System.out.println("Please input a number from 1-30");
				int date = in.nextInt();
				if(date < 31 && date > 0)
				{
					System.out.println("You have selected Premium room for " + selection + "/"+ date + "/" + input +"!");
					chooseDateConfirm();
				}
				else
				{
					System.out.println("Please select a number from 1 to 30");
					chooseDateP();
				}
			}
		}
		else
		{
			System.out.println("Please input a number from 1 to 12");
			chooseDateP();
		}
		
	}
	
	public static void chooseDateS()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please Select Month (1-12)");
		int selection = in.nextInt();
		if(selection < 13 && selection > 0)
		{
			System.out.println("You have selected "+ selection+".");
			System.out.println("Please input year!");
			int input = in.nextInt();
			if(selection == 2 )
			{
				if(input % 4 == 0 && input%100 != 0)
				{
					System.out.println("Leap Year! Please input a number from 1-29");
					int date = in.nextInt();
					if(date < 30 && date > 0)
					{
						System.out.println("You have selected Standard room for " + selection + "/"+ date + "/" + input +"!");
						chooseDateConfirm();
					}
					else
					{
						System.out.println("Please Select a number from 1 to 29");
						chooseDateS();
					}
				}
				else
				{
					System.out.println("Please input a number from 1-28");
					int date = in.nextInt();
					if(date < 29 && date > 0)
					{
						System.out.println("You have selected Standard room for " + selection + "/"+ date + "/" + input +"!");
						chooseDateConfirm();
					}
					else
					{
						System.out.println("Please select a number from 1 to 28");
						chooseDateS();
					}
				}
			}
			else if(selection == 1 ||selection == 3 ||selection == 5 ||selection == 7 ||selection == 8 ||selection == 10 ||selection == 12)
			{
				System.out.println("Please input a number from 1-31");
				int date = in.nextInt();
				if(date < 32 && date > 0)
				{
					System.out.println("You have selected Standard room for " + selection + "/"+ date + "/" + input +"!");
					chooseDateConfirm();
				}
				else
				{
					System.out.println("Please select a number from 1 to 31");
					chooseDateS();
				}					
			}
			else if(selection == 4 ||selection == 6 ||selection == 9 ||selection == 11)
			{
				System.out.println("Please input a number from 1-30");
				int date = in.nextInt();
				if(date < 31 && date > 0)
				{
					System.out.println("You have selected Standard room for " + selection + "/"+ date + "/" + input +"!");
					chooseDateConfirm();
				}
				else
				{
					System.out.println("Please select a number from 1 to 30");
					chooseDateS();
				}
			}
		}
		else
		{
			System.out.println("Please input a number from 1 to 12");
			chooseDateS();
		}
		
	}
	
	public static void chooseDateConfirm()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("[M]ake another reservation, [R]eturn to menu, [Q]uit");
		String choice = in.nextLine();
		if(choice.equals("m"))
		{
			makeReservation();
		}
		else if(choice.equals("r"))
		{
			loadGuestMenu();
		}
		else if(choice.equals("q"))
		{
			return;
		}
		else
		{
			System.out.println("Please select m , r , or q");
			chooseDateConfirm();
		}
	}
	
	public static void main(String[] args) {
		boolean quit = true;

		while (quit) 
		{
			selectLogin();
			checkGuestUsername();
			checkGuestPassword();
			loadGuestMenu();
			quit = false; 
		}
		System.out.println("Thank You and Have a Nice Day!");
	}
}
