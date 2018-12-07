package management;

import java.awt.event.*;
import javax.swing.*;

public class GuestLoginView {
	
	private Database database;
	
	public GuestLoginView(Database database) {
		this.database = database;
		build();
	}

	private void build() {
		JFrame loginPage = new JFrame();
		JPanel panel = new JPanel();

		loginPage.setSize(600, 450);
		panel.setSize(600, 450);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

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

				if(database.checkLogin(inputUsername, inputPass) == true) {
					GuestMenuView gMenuView = new GuestMenuView(database);
					loginPage.dispose();
				}
				else {
					JOptionPane.showMessageDialog(new JFrame(), "Username Taken", "Dialog",
					        JOptionPane.ERROR_MESSAGE);
					loginPage.dispose();
					build();
				}
			}
		});

		panel.add(usernameLabel);
		panel.add(guestUserField);
		panel.add(passwordLabel);
		panel.add(guestPassField);
		panel.add(loginButton);

		loginPage.getContentPane().add(panel);

		loginPage.setSize(500, 500);
		loginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginPage.pack();
		loginPage.setVisible(true);
	}

	public static void main(String[] args) {
		Database database = new Database();
		GuestLoginView view = new GuestLoginView(database);
		view.build();
	}

}