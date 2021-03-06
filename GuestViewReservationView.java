package hotelReservationSystem;

/**
 * This class displays the reservations the guest made and the guest may delete them.
 */
import java.awt.GridLayout;
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
		panel.setLayout(new GridLayout(2, 2));
		
		JTextArea reservedRoom = new JTextArea();
		reservedRoom.setEditable(false);
		reservedRoom.setSize(600,400);
		reservedRoom.setText("Reserved room(s) will be displayed here");
		
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
				GuestCancelView deleteView = new GuestCancelView(database, ID);
				guestViewPage.dispose();
			}
		});
		panel.add(viewButton);
		panel.add(reservedRoom);
		panel.add(deleteButton);
		panel.add(menuButton);

		guestViewPage.getContentPane().add(panel);
		

		guestViewPage.setSize(1100, 300);
		guestViewPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//guestViewPage.pack();
		guestViewPage.setVisible(true);
	}

}
