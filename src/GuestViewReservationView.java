import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GuestViewReservationView {
	private Database database;
	private int ID;
	
	public GuestViewReservationView(Database database, int accountID) {
		this.database = database;
		this.ID = accountID;
		build();
	}
	
	private void build() {
		JFrame guestViewPage = new JFrame();
		JPanel panel = new JPanel();

//		For a vertical menu
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JTextArea reservedRoom = new JTextArea();
		reservedRoom.setEditable(false);
		reservedRoom.setSize(600,400);
		reservedRoom.setText("Reserved room(s) will br displayed here");
		
		JButton viewButton = new JButton();
		viewButton.setText("View Reservations");
		viewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("View clicked.");
				String reservationEntries = "";
				ArrayList<String> entries = database.getGuestReserverationRecord(ID);
				for(String s: entries)
				{
					reservationEntries += s + "\n";
				}
				reservedRoom.setText(reservationEntries);
			}
		});

		JButton menuButton = new JButton();
		menuButton.setText("Main Menu");
		menuButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("logout clicked.");
				GuestMenuView startupPage = new GuestMenuView(database,ID);
				guestViewPage.dispose();
			}
		});

		JButton deleteButton = new JButton();
		deleteButton.setText("Delete Reservation");
		deleteButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Delete Selected");
				
				guestViewPage.dispose();
			}
		});
		panel.add(reservedRoom);
		panel.add(viewButton);
		panel.add(deleteButton);
		panel.add(menuButton);

		guestViewPage.getContentPane().add(panel);
		

		guestViewPage.setSize(500, 500);
		guestViewPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guestViewPage.pack();
		guestViewPage.setVisible(true);
	}

	public static void main(String[] args) {
		Database database = new Database();
		int i = 1;
		GuestViewReservationView view = new GuestViewReservationView(database, i);
	}
}