package hotelReservationSystem;

import java.awt.event.*;
import javax.swing.*;

public class WelcomeView {

	Manager theManager = new Manager("testUser", "testPass");
	// private Database database;

	// Constructor calls build class upon initialization
	public WelcomeView() {
		build();
	}

	// Build the page
	private static void build() {
		JFrame welcomePage = new JFrame();
		JPanel panel = new JPanel();

		JButton guestLoginButton = new JButton();
		guestLoginButton.setText("Guest");

		// Guest button controller
		guestLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Guest button clicked.");
			}
		});

		JButton managerLoginButton = new JButton();
		managerLoginButton.setText("Manager");

		// Manager button controller
		managerLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Manager button clicked.");

				// Create an instance of the page to navigate to (SignupLoginView in this case)
				LoginView loginPage = new LoginView();

				welcomePage.dispose(); // Close this current page
			}
		});

		panel.add(guestLoginButton);
		panel.add(managerLoginButton);

		welcomePage.getContentPane().add(panel);
		welcomePage.setSize(500, 500);
		welcomePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		welcomePage.pack();
		welcomePage.setVisible(true);
	}

	public static void main(String[] args) {
		build();
	}
}