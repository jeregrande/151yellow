package hotelReservationSystem;

import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class HotelSystemDriver {

	private Database database;

	// Constructor calls build class upon initialization
	public HotelSystemDriver(Database database) {
		this.database = database;
		build();
	}

	// Build the page
	private void build() {
		JFrame startupPage = new JFrame();
		JPanel panel = new JPanel();

		JButton guestLoginButton = new JButton();
		guestLoginButton.setText("Guest");
		panel.setLayout(new GridLayout(1, 1));
		
		// Guest button controller
		guestLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Guest button clicked.");
				GuestSignupLoginView selectLoginPage = new GuestSignupLoginView(database);
				startupPage.dispose();
			}
		});

		JButton managerLoginButton = new JButton();
		managerLoginButton.setText("Manager");

		// Manager button controller
		managerLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Manager button clicked.");

				// Create an instance of the page to navigate to (SignupLoginView in this case)
				ManagerLoginView managerLoginPage = new ManagerLoginView(database);

				startupPage.dispose(); // Close this current page
			}
		});

		panel.add(guestLoginButton);
		panel.add(managerLoginButton);

		startupPage.getContentPane().add(panel);
		startupPage.setSize(300, 100);
		startupPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//startupPage.pack();
		startupPage.setVisible(true);
	}

	public static void main(String[] args) {
		Database database = new Database();
		HotelSystemDriver view = new HotelSystemDriver(database);
	}
}