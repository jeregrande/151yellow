package hotelReservationSystem;

/**
 * This class displays the login view for the manager. 
 * Manager login info is printed to the console for testing
 */
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class ManagerLoginView {

	private Database database;
	static String managerUser = "mUser";
	static String managerPass = "mPass";

	public ManagerLoginView(Database database) {
		this.database = database;
		build();
	}

	private void build() {
		System.out.println("Manager's username is: mUser");
		System.out.println("Manager's password is: mPass");
		JFrame managerLoginPage = new JFrame();
		JPanel panel = new JPanel();
		JPanel loginButtonPanel = new JPanel();

		managerLoginPage.setSize(600, 450);
		panel.setSize(600, 450);
		panel.setLayout(new GridLayout(3, 2));

		JTextField managerUserField = new JTextField();
		JTextField managerPassField = new JTextField();

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
				String inputUsername = managerUserField.getText();
				String inputPass = managerPassField.getText();

				if (inputUsername.equals(managerUser) && inputPass.equals(managerPass)) {
					ManagerMenuView managerMenuPage = new ManagerMenuView(database);
					managerLoginPage.dispose();
				} else {
					System.out.println("Invalid login credentials.");
					JOptionPane.showMessageDialog(new JFrame(), "Invalid login credentials.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerLoginPage.dispose();
					build();
				}
			}
		});

		panel.add(usernameLabel);
		panel.add(managerUserField);
		panel.add(passwordLabel);
		panel.add(managerPassField);
		panel.add(loginButtonPanel);
		panel.add(loginButton);

		managerLoginPage.getContentPane().add(panel);

		managerLoginPage.setSize(500, 500);
		managerLoginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		managerLoginPage.pack();
		managerLoginPage.setVisible(true);
	}


}