package hotelReservationSystem;

import java.awt.event.*;
import javax.swing.*;
import java.awt.GridLayout;

public class GuestSignupView {

	private Database database;

	public GuestSignupView(Database database) {
		this.database = database;
		build();
	}

	private void build() {
		JFrame signupPage = new JFrame();
		JPanel panel = new JPanel();
		JPanel signupButtonPanel = new JPanel();

		signupPage.setSize(600, 450);
		panel.setSize(600, 450);
		panel.setLayout(new GridLayout(6, 2));

		JTextField guestUserField = new JTextField();
		JTextField guestPassField = new JTextField();
		JTextField guestPassConfirmField = new JTextField();
		JTextField guestFirstNameField = new JTextField();
		JTextField guestLastNameField = new JTextField();

		JLabel usernameLabel = new JLabel();
		usernameLabel.setText("Enter Username:");
		usernameLabel.setBounds(10, 10, 100, 100);

		JLabel passwordLabel = new JLabel();
		passwordLabel.setText("Enter Password:");
		passwordLabel.setBounds(10, 10, 100, 100);

		JLabel passwordConfirmLabel = new JLabel();
		passwordConfirmLabel.setText("Enter Password Again:");
		passwordConfirmLabel.setBounds(10, 10, 100, 100);

		JLabel firstNameLabel = new JLabel();
		firstNameLabel.setText("Enter First Name:");
		firstNameLabel.setBounds(10, 10, 100, 100);

		JLabel lastNameLabel = new JLabel();
		lastNameLabel.setText("Enter Last Name:");
		lastNameLabel.setBounds(10, 10, 100, 100);

		JButton signupButton = new JButton();
		signupButton.setText("Signup");
		signupButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Signup Clicked.");
				String inputUsername = guestUserField.getText();
				String inputPass = guestPassField.getText();
				String inputPassC = guestPassConfirmField.getText();
				String inputFirst = guestFirstNameField.getText();
				String inputLast = guestLastNameField.getText();

				if (database.checkUsername(inputUsername) == true) {
					System.out.println("Username already taken.");
					JOptionPane.showMessageDialog(new JFrame(), "Username Taken", "Dialog", JOptionPane.ERROR_MESSAGE);
					signupPage.dispose();
					build();
				}
				else {

				if (inputPass.equals(inputPassC)) {
					Account a = new Account(inputUsername, inputPass, inputFirst, inputLast);
					database.addAccounts(a);
					JOptionPane.showMessageDialog(new JFrame(), "Account Created!", "Dialog",
							JOptionPane.INFORMATION_MESSAGE);
					GuestSignupLoginView guestSignupLoginPage = new GuestSignupLoginView(database);
					signupPage.dispose();
				} else {
					System.out.println("Incorrect Password Input.");
					JOptionPane.showMessageDialog(new JFrame(), "Password does not match!", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					signupPage.dispose();
					build();
				}

			}
			}
		});

		panel.add(usernameLabel);
		panel.add(guestUserField);
		panel.add(passwordLabel);
		panel.add(guestPassField);
		panel.add(passwordConfirmLabel);
		panel.add(guestPassConfirmField);
		panel.add(firstNameLabel);
		panel.add(guestFirstNameField);
		panel.add(lastNameLabel);
		panel.add(guestLastNameField);
		panel.add(signupButtonPanel);
		panel.add(signupButton);

		signupPage.getContentPane().add(panel);

		signupPage.setSize(500, 500);
		signupPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		signupPage.pack();
		signupPage.setVisible(true);
	}

	public static void main(String[] args) {
		Database database = new Database();
		GuestSignupView view = new GuestSignupView(database);
	}

}