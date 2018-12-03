package hotelReservationSystem;

import java.util.*;

public class ManagerDriver {

	static char loginType; // Tentative
	static Manager theManager = new Manager("testUser", "testPass");
	static String managerUser = theManager.getUsername();
	static String managerPass = theManager.getPassword();

	public static void selectLogin() {
		Scanner in = new Scanner(System.in);
		System.out.println("[G]uest or [M]anager?");
		String selection = in.nextLine();

		if (selection.toLowerCase().equals("m")) {
			loginType = 'm'; // Tentative
		} else if (selection.toLowerCase().equals("g")) {
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

	// Has 4 options: Load, View, Save, and Quit
	public static void loadManagerMenu() {
		Scanner in = new Scanner(System.in);
		System.out.println("--Manager Menu--");
		System.out.println("Options: [L]oad reservations, [V]iew reservations, [S]ave reservations, or [Q]uit");
		String selection = in.nextLine();

		if (selection.toLowerCase().equals("l")) {

			// TODO: Replace with Reservation loader.
			System.out.println("Reservations loaded from reservations.txt" + "\n");
			loadManagerMenu();

		} else if (selection.toLowerCase().equals("v")) {

			loadManagerView();

		} else if (selection.toLowerCase().equals("s")) {

			// TODO: Replace with reservation saver.
			System.out.println("Reservations saved to reservations.txt" + "\n");
			loadManagerMenu();

		} else if (selection.toLowerCase().equals("q")) {

			System.out.println("Goodbye, manager.");
			return;

		} else {

			System.out.println("Please select a valid option." + "\n");
			loadManagerMenu();

		}
	}

	public static void loadManagerView() {
		Scanner in = new Scanner(System.in);
		System.out.println("--Manager View Menu--");
		System.out.println("Options: [D]ay Select, [R]oom Selection, or [B]ack");
		String selection = in.nextLine();

		if (selection.toLowerCase().equals("d")) {
			System.out.println("Day view selected.");
			System.out.println("TODO: List room availabilities on a selected day." + "\n");
			loadManagerView();
		} else if (selection.toLowerCase().equals("r")) {
			System.out.println("Room view selected.");
			System.out.println("TODO: List all reservations of selected room." + "\n");
			loadManagerView();
		} else if (selection.toLowerCase().equals("b")) {
			loadManagerMenu();
		} else {
			System.out.println("Please select a valid option." + "\n");
			loadManagerView();
		}

	}

	// Editing is not actually needed
	/*
	 * public static void editReservation() { Scanner in = new Scanner(System.in);
	 * System.out.
	 * println("Reservation information would be displayed with editable fields here."
	 * ); System.out.println("[C]onfirm, [D]elete, or Ca[N]cel."); String selection
	 * = in.nextLine();
	 * 
	 * if (selection.equals("c")) { System.out.println("Reservation updated");
	 * loadManagerMenu(); } else if (selection.equals("d")) {
	 * System.out.println("This reservation will be deleted. [Y] or [N]?");
	 * selection = in.nextLine(); if (selection.equals("y")) {
	 * System.out.println("Deletion successful."); loadManagerMenu(); } else {
	 * System.out.println("Deletion cancelled."); loadManagerMenu(); } } else if
	 * (selection.equals("n")) { loadManagerMenu(); } else {
	 * System.out.println("Please select a valid option."); editReservation(); } }
	 */

	public static void main(String[] args) {
		boolean quit = true;

		while (quit) { // Loop until user quits
			selectLogin();
			checkManagerUsername();
			checkManagerPassword();
			loadManagerMenu();
			quit = false; // temp, swap false with last method
		}
		System.out.println("--System Terminated--");
	}
}
