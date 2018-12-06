package login;

import java.util.ArrayList;
import java.util.Scanner;

public class login {
	
	static char loginType;
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

	public  void makeReservation() 
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

	public void chooseDateP()
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
	
	public  void chooseDateS()
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
	
	public  void chooseDateConfirm()
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
	
	public  void signup()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please input username.");
		String input = in.nextLine();
		for(int i = 0; i < accounts.size(); i++)
		{
			if(accounts.get(i).getUsername().equals(input))
			{
				System.out.println("Username already taken.");
				signup();
			}
		}
		System.out.println("Please input password.");
		String input1 = in.nextLine();
		System.out.println("Please input password again.");
		String input2 = in.nextLine();
		if(input1.equals(input2))
		{
			System.out.println("Please input name.");
			String input3 = in.nextLine();
			account newAccount = new account(input, input1, input3);
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
