package management;

import java.awt.event.*;
import javax.swing.*;

public class LoginView {
	
	private Database database;
	static Manager theManager = new Manager("testUser", "testPass");
	static String managerUser = theManager.getUsername();
	static String managerPass = theManager.getPassword();

	public LoginView(Database database) {
		this.database = database;
		build();
	}

	private static void build() {
		JFrame loginPage = new JFrame();
		JPanel panel = new JPanel();

		loginPage.setSize(600, 450);
		panel.setSize(600, 450);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

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
					ManagerMenuView managerMenuPage = new ManagerMenuView();
					loginPage.dispose();
				} else {
					System.out.println("Incorrect login credentials.");
					JOptionPane.showMessageDialog(new JFrame(), "Incorrect Inputs", "Dialog",
					        JOptionPane.ERROR_MESSAGE);
					loginPage.dispose();
					build();
				}
			}
		});

		panel.add(usernameLabel);
		panel.add(managerUserField);
		panel.add(passwordLabel);
		panel.add(managerPassField);
		panel.add(loginButton);

		loginPage.getContentPane().add(panel);

		loginPage.setSize(500, 500);
		loginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginPage.pack();
		loginPage.setVisible(true);
	}

	public static void main(String[] args) {
		build();
	}

}