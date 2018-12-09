
import java.awt.event.*;
import javax.swing.*;

public class GuestMenuView {

	private Database database;
	private int ID;

	public GuestMenuView(Database database, int accountID) {
		this.database = database;
		this.ID = accountID;
		build();
	}

	private void build() {
		JFrame guestMenuPage = new JFrame();
		JPanel panel = new JPanel();

//		For a vertical menu
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JButton makeButton = new JButton();
		makeButton.setText("Make Reservations");
		makeButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Make clicked.");
				GuestMakeReservationView reserveView = new GuestMakeReservationView(database,ID);
				guestMenuPage.dispose();
			}
		});

		JButton viewButton = new JButton();
		viewButton.setText("View Reservations");
		viewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("View clicked.");
				GuestViewReservationView checkView = new GuestViewReservationView(database, ID);
				guestMenuPage.dispose();
			}
		});

		JButton logoutButton = new JButton();
		logoutButton.setText("Logout");
		logoutButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("logout clicked.");
				HotelSystemDriver startupPage = new HotelSystemDriver(database);
				guestMenuPage.dispose();
			}
		});

		JButton quitButton = new JButton();
		quitButton.setText("Quit");
		quitButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Quit clicked.");
				System.out.println("--System Terminated--");
				guestMenuPage.dispose();
				System.exit(0);
			}
		});

		panel.add(makeButton);
		panel.add(viewButton);
		panel.add(logoutButton);
		panel.add(quitButton);

		guestMenuPage.getContentPane().add(panel);

		guestMenuPage.setSize(500, 500);
		guestMenuPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guestMenuPage.pack();
		guestMenuPage.setVisible(true);
	}

	public static void main(String[] args) {
		Database database = new Database();
		int i = 1;
		GuestMenuView view = new GuestMenuView(database, i);
	}

}
