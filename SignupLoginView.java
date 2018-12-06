package hotelReservationSystem;

import java.awt.event.*;
import javax.swing.*;

public class SignupLoginView {

	public SignupLoginView() {
		build();
	}

	private static void build() {
		JFrame signupLoginPage = new JFrame();
		JPanel panel = new JPanel();

		JButton signupButton = new JButton();
		signupButton.setText("Signup");
		signupButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Signup clicked. This option will only be for guests.");
			}
		});

		JButton loginButton = new JButton();
		loginButton.setText("Login");
		loginButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Login clicked.");
				LoginView loginPage = new LoginView();
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

	public static void main(String[] args) {
		build();
	}

}
