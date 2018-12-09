
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * the receipt shows all valid reservations made by this user with the corresponding total amount due. 
 * For example, it is 10/11/28 and a user made 3 reservations on 10/11/18 for the period of 10/24/18-10/28/18. 
 * The user also made 2 reservations on 10/1/18 for the period of 12/25/18-12/30/18
 */

//room number, start~end date, total cost

public class GuestComplexReceiptView {
	
	private Database database;
	private double cost;
	private int accountID;
	ArrayList<ReservationRecord> rec;

	public GuestComplexReceiptView(Database database, ArrayList<ReservationRecord> reservationRecord, double cost, int accountID){
		this.database = database;
		this.rec = reservationRecord;
		this.cost = cost;
		this.accountID = accountID;
		build();
	}
	
	public void build(){
		JFrame GuestComplexReceipt = new JFrame();
		JPanel panel = new JPanel();
		
		JTextArea receipt = new JTextArea();
		receipt.setEditable(false);
		receipt.setSize(500,500);
		ArrayList<String> bookedRooms = new ArrayList<String>();
		String entries = "";
		String username = rec.get(0).getUsername();
		for(int i = 0; i<rec.size(); i++) {
			int roomNumber = rec.get(i).getRoomNumber() +1;
			String startDate = rec.get(i).getStartDate();
			String endDate = rec.get(i).getEndDate();
			bookedRooms.add("Room Number: " + roomNumber + " | Check In Date: " + startDate + " | Check Out Date: " + endDate);
		}
		for(String s:bookedRooms) {
			entries += s  + "\n";
		}
		
		receipt.setText(username +"\n" + entries + "\n" + "Total Cost is : " + cost);
		
		JButton menuButton = new JButton();
		menuButton.setText("Menu");
		menuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Menu Clicked");
				GuestMenuView viewGuestMenu = new GuestMenuView(database, accountID);			
				GuestComplexReceipt.dispose();
				
			}

		});
		panel.add(receipt);
		panel.add(menuButton);
		
		GuestComplexReceipt.getContentPane().add(panel);
		GuestComplexReceipt.setSize(500, 500);
		GuestComplexReceipt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GuestComplexReceipt.pack();
		GuestComplexReceipt.setVisible(true);	
	}
	
}