package hotelReservationSystem;

import java.awt.event.*;
import javax.swing.*;

public class WelcomeView {

	public WelcomeView() {
		build();
	}

	private static void build() {
		JFrame welcomePage = new JFrame();
		JPanel panel = new JPanel();

		JButton guestLoginButton = new JButton();
		guestLoginButton.setText("Guest");
		guestLoginButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Guest button clicked.");
			}
		});

		JButton managerLoginButton = new JButton();
		managerLoginButton.setText("Manager");
		managerLoginButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Manager button clicked.");
				SignupLoginView selectLoginPage = new SignupLoginView();
				welcomePage.dispose();
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