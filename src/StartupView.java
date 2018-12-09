import java.awt.event.*;
import javax.swing.*;


public class StartupView {

	private Database database;
	
	public StartupView(Database database) {
		this.database = database;
		build();
	}

	
	
	private void build() {
		JFrame welcomePage = new JFrame();
		JPanel panel = new JPanel();

		JButton guestLoginButton = new JButton();
		guestLoginButton.setText("Guest");
		guestLoginButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Guest button clicked.");
				GuestSignupLoginView selectLoginPage = new GuestSignupLoginView(database);
				welcomePage.dispose();
			}
		});

		JButton managerLoginButton = new JButton();
		managerLoginButton.setText("Manager");
		managerLoginButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Manager button clicked.");
				SignupLoginView selectLoginPage = new SignupLoginView(database);
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
		Database database = new Database();
		StartupView view = new StartupView(database);
		view.build();
	}
}