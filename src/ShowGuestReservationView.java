import java.awt.event.*;
import javax.swing.*;


public class ShowGuestReservationView {
	
	private Database database;
	
	public ShowGuestReservationView(Database database) {
		this.database = database;
		build();
	}

	private  void build() {
		JFrame guestViewPage = new JFrame();
		JPanel panel = new JPanel();

//		For a vertical menu
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JButton makeButton = new JButton();
		makeButton.setText("Make Reservations");
		makeButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Make clicked.");
				MakeReservationView reserveView = new MakeReservationView(database);
				guestViewPage.dispose();
			}
		});

		JButton viewButton = new JButton();
		viewButton.setText("View Reservations");
		viewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("View clicked.");
			}
		});

		JButton logoutButton = new JButton();
		logoutButton.setText("Logout");
		logoutButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("logout clicked.");
				StartupView welcomeView = new StartupView(database);
				guestViewPage.dispose();
			}
		});

		JButton quitButton = new JButton();
		quitButton.setText("Quit");
		quitButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Quit clicked.");
				System.out.println("--System Terminated--");
				guestViewPage.dispose();
			}
		});

		panel.add(makeButton);
		panel.add(viewButton);
		panel.add(logoutButton);
		panel.add(quitButton);

		guestViewPage.getContentPane().add(panel);

		guestViewPage.setSize(500, 500);
		guestViewPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guestViewPage.pack();
		guestViewPage.setVisible(true);
	}

	public  static void main(String[] args) {
		Database database = new Database();
		ShowGuestReservationView view = new ShowGuestReservationView(database);
		view.build();
	}

}