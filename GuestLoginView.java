package hotelReservationSystem;

/**
 * Guess login view is the page which Guest see when login in
 * this pass passes the current account ID to all corresponding pages to keep track of who is logged in 
 */
import java.awt.event.*;
import javax.swing.*;
import java.awt.GridLayout;

public class GuestLoginView {

	private Database database;

	public GuestLoginView(Database database) {
		this.database = database;
		build();
	}

	private void build() {
		JFrame loginPage = new JFrame();
		JPanel panel = new JPanel();
		JPanel loginButtonPanel = new JPanel();

		loginPage.setSize(600, 450);
		panel.setSize(600, 450);
		panel.setLayout(new GridLayout(3, 2));

		JTextField guestUserField = new JTextField();
		JTextField guestPassField = new JTextField();

		JLabel usernameLabel = new JLabel();
		usernameLabel.setText("Enter Username:");
		usernameLabel.setBounds(10, 10, 100, 100);

		JLabel passwordLabel = new JLabel();
		passwordLabel.setText("Enter Password:");
		passwordLabel.setBounds(10, 10, 100, 100);

		JButton loginButton = new JButton();
		loginButton.setText("Login");
		loginButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Login clicked.");
				String inputUsername = guestUserField.getText();
				String inputPass = guestPassField.getText();

				if (database.checkLogin(inputUsername, inputPass) == -1) {
					JOptionPane.showMessageDialog(new JFrame(), "Invalid login credentials. Try again.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					loginPage.dispose();
					build();
				} else {
					int accountID = database.checkLogin(inputUsername, inputPass);
					GuestMenuView gMenuView = new GuestMenuView(database,accountID);
					loginPage.dispose();
				}
			}
		});

		panel.add(usernameLabel);
		panel.add(guestUserField);
		panel.add(passwordLabel);
		panel.add(guestPassField);
		panel.add(loginButtonPanel);
		panel.add(loginButton);

		loginPage.getContentPane().add(panel);

		loginPage.setSize(500, 500);
		loginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginPage.pack();
		loginPage.setVisible(true);
	}

}