package hotelReservationSystem;

import java.awt.event.*;
import javax.swing.*;
/**
 * This class allows the guest to either sign up or login
 * @author Jeremiah, Justin, sanford
 *
 */
public class GuestSignupLoginView {
	private Database database;

	public GuestSignupLoginView(Database database) {
		this.database = database;
		build();
	}

	private void build() {
		JFrame signupLoginPage = new JFrame();
		JPanel panel = new JPanel();

		JButton signupButton = new JButton();
		signupButton.setText("Signup");
		signupButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Signup clicked. This option will only be for guests.");
				GuestSignupView signupPage = new GuestSignupView(database);
				signupLoginPage.dispose();
			}
		});

		JButton loginButton = new JButton();
		loginButton.setText("Login");
		loginButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Login clicked.");
				GuestLoginView loginPage = new GuestLoginView(database);
				signupLoginPage.dispose();
			}
		});

		panel.add(signupButton);
		panel.add(loginButton);

		signupLoginPage.getContentPane().add(panel);

		signupLoginPage.setSize(500, 500);
		signupLoginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		signupLoginPage.pack();
		signupLoginPage.setVisible(true);
	}

}