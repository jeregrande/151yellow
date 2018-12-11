package hotelReservationSystem;

/**
 * This class is the view for allowing guest to choose what receipt they want
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestChooseReceiptView {

	//gonna pass in variables like int j for the number of days 
	//takes it in constructor from the guestmakereservation2 
	
	
	//when done, pass back database and accountID(the current account ID)
	
	private Database database;
	private int accountID;
	private ReservationRecord record;
	private double cost = 0;
	
	public GuestChooseReceiptView(Database database, int accountID){
		this.database = database;
		this.accountID = accountID;
		//this.numberOfNights = numberOfNights;
		build();
	}
	
	
	private void build() {
		JFrame GuestChooseReceiptViewPage = new JFrame();
		JPanel panel = new JPanel();

//		For a vertical menu
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JButton selectSimpleReceipt = new JButton();
		selectSimpleReceipt.setText("Select Simple Receipt");
		selectSimpleReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Simple Receipt View clicked");
				try {
					cost = database.getSingleCost(accountID);
					GuestSimpleReceiptView simpleReceiptView = new GuestSimpleReceiptView(database, accountID, cost);
					JOptionPane.showMessageDialog(new JFrame(), "Simple Reciept Only Shows The Most Recent Reservation", "Dialog", JOptionPane.INFORMATION_MESSAGE);
					
					GuestChooseReceiptViewPage.dispose();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		JButton selectComprehensiveReceipt = new JButton();
		selectComprehensiveReceipt.setText("Select Comprehensive Receipt");
		selectComprehensiveReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Comprehensive Receipt View clicked.");
				try {
					
					cost = database.getTotalCost(accountID);
					ArrayList<ReservationRecord> reservationRecord = database.getGuestRecord(accountID);
					GuestComplexReceiptView complexReceiptView = new GuestComplexReceiptView(database, reservationRecord, cost, accountID);
					GuestChooseReceiptViewPage.dispose();
				}
				catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		panel.add(selectSimpleReceipt);
		panel.add(selectComprehensiveReceipt);

		GuestChooseReceiptViewPage.getContentPane().add(panel);
		GuestChooseReceiptViewPage.setSize(500, 500);
		GuestChooseReceiptViewPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GuestChooseReceiptViewPage.pack();
		GuestChooseReceiptViewPage.setVisible(true);
	}

}