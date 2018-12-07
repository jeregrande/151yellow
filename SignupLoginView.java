package management;

import java.awt.event.*;
import javax.swing.*;

public class SignupLoginView {
	private  Database database;

	public SignupLoginView(Database database) {
		this.database = database;
		build();
	}

	private  void build() {
		JFrame signupLoginPage = new JFrame();
		JPanel panel = new JPanel();

		JButton signupButton = new JButton();
		signupButton.setText("Signup");
		signupButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Signup clicked. This option will only be for guests.");
				SignupView signupPage = new SignupView(database);
				signupLoginPage.dispose();
			}
		});

		JButton loginButton = new JButton();
		loginButton.setText("Login");
		loginButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Login clicked.");
				LoginView loginPage = new LoginView(database);
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
		Database database = new Database();
		SignupLoginView view = new SignupLoginView(database);
		view.build();
	}

}