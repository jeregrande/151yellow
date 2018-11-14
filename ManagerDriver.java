package hotelReservationSystem;

import java.util.*;

public class ManagerDriver {

	static char loginType;
	static Manager theManager = new Manager("testUser", "testPass");
	static String managerUser = theManager.getUsername();
	static String managerPass = theManager.getPassword();

	public static void selectLogin() {
		Scanner in = new Scanner(System.in);
		System.out.println("[G]uest or [M]anager?");
		String selection = in.nextLine();

		if (selection.equals("m")) {
			loginType = 'm';
		} else if (selection.equals("g")) {
			System.out.println("Only supporting Managers right now.");
			selectLogin();
		} else {
			System.out.println("Please select a valid option.");
			selectLogin();
		}
	}

	public static void checkManagerUsername() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input username");
		String selection = in.nextLine();

		if (selection.equals(managerUser)) {
			System.out.println("Hello Manager.");
		} else {
			System.out.println("Invalid username");
			checkManagerUsername();
		}
	}

	public static void checkManagerPassword() {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input password.");
		String selection = in.nextLine();

		if (selection.equals(managerPass)) {
			System.out.println("Login successful.");
		} else {
			System.out.println("Incorrect password.");
			checkManagerPassword();
		}
	}

	public static void loadManagerMenu() {
		Scanner in = new Scanner(System.in);
		System.out.println("Reservations will be displayed here.");
		System.out.println("Soon, you may [S]elect a reservation and [E]dit it, or [Q]uit.");
		String selection = in.nextLine();

		if (selection.equals("s")) {
			System.out.println("[S]elect chosen, but returning to menu.");
			loadManagerMenu();
		} else if (selection.equals("e")) {
			System.out.println("[E]dit chosen.");
			editReservation();
		} else if (selection.equals("q")) {
			return;
		} else {
			System.out.println("Please select a valid option");
			loadManagerMenu();
		}
	}

	public static void editReservation() {
		Scanner in = new Scanner(System.in);
		System.out.println("Reservation information would be displayed with editable fields here.");
		System.out.println("[C]onfirm, [D]elete, or Ca[N]cel.");
		String selection = in.nextLine();

		if (selection.equals("c")) {
			System.out.println("Reservation updated");
			loadManagerMenu();
		} else if (selection.equals("d")) {
			System.out.println("This reservation will be deleted. [Y] or [N]?");
			selection = in.nextLine();
			if (selection.equals("y")) {
				System.out.println("Deletion successful.");
				loadManagerMenu();
			} else {
				System.out.println("Deletion cancelled.");
				loadManagerMenu();
			}
		} else if (selection.equals("n")) {
			loadManagerMenu();
		} else {
			System.out.println("Please select a valid option.");
			editReservation();
		}
	}

	public static void main(String[] args) {
		boolean quit = true;

		while (quit) { // Loop until user quits
			selectLogin();
			checkManagerUsername();
			checkManagerPassword();
			loadManagerMenu();
			quit = false; // temp, swap false with last method
		}
		System.out.println("Bye");
	}
}
