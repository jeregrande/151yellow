import java.awt.GridLayout;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class GuestMakeReservation2View {
	private Database database;
	private List<Integer> open;
	private String startDate;
	private String endDate;
	private int ID;
	private boolean error = true;
	private ReservationRecord record;
	
	public GuestMakeReservation2View(Database database, List<Integer> a, String start, String end,int accountID) {
		this.database = database;
		this.open = a;
		this.startDate = start;
		this.endDate = end;
		this.ID = accountID;
		build();
	}

	private void build() {
		JFrame makeReservationPage = new JFrame();
		JPanel panel = new JPanel();

		panel.setSize(600, 450);
		panel.setLayout(new GridLayout(2, 3));

		JTextField selectRoomField = new JTextField();
		
		JTextArea selectRoomLabel = new JTextArea();
		selectRoomLabel.setEditable(false);
		selectRoomLabel.setSize(100,100);
		selectRoomLabel.setText("Input Room Number");
		
		JTextArea openRoom = new JTextArea();
		openRoom.setEditable(false);
		openRoom.setSize(100,400);
		String newText = " ";
		for(int i: open) {
			newText += i + ",";
		}
		openRoom.setText("Available Rooms" + "\n" + "1-10 are Premium($300)" + "\n" + "11-20 are Standard($100) " +"\n" + newText );

		JButton confirmButton = new JButton();
		confirmButton.setText("Make Another");
		confirmButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Confirm Clicked.");
				int inputRoomNumber = Integer.parseInt(selectRoomField.getText());

				for (int i = 0; i < open.size(); i++) {
					if (open.get(i).equals(inputRoomNumber)) {
						if (i >= 1 && i <= 10) {
							Room newRoom = new Room(i, 0, startDate, endDate);
							int roomIndex = database.addRooms(newRoom);
							database.saveReservationRecord(ID , roomIndex);
							error = false;
						} else {
							Room newRoom = new Room(i, 1, startDate, endDate);
							int roomIndex = database.addRooms(newRoom);
							database.saveReservationRecord(ID, roomIndex);
							error = false;
						}
					}
				}
				if(error == true) {
						JOptionPane.showMessageDialog(new JFrame(), "Room Number Selected Is Not\n Available Within Date Chosen", "Dialog", JOptionPane.ERROR_MESSAGE);
						makeReservationPage.dispose();
						build();
				}
				else {
					GuestMakeReservationView menuView = new GuestMakeReservationView(database, ID);
				
				makeReservationPage.dispose();
				}
			}
		});
		
		JButton recieptButton = new JButton();
		recieptButton.setText("Confirm");
		recieptButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Confirm Clicked.");
				int inputRoomNumber = Integer.parseInt(selectRoomField.getText());

				for (int i = 0; i < open.size(); i++) {
					if (open.get(i).equals(inputRoomNumber)) {
						if (i >= 1 && i <= 10) {
							Room newRoom = new Room(i, 0, startDate, endDate);
							int roomIndex = database.addRooms(newRoom);
							database.saveReservationRecord(ID , roomIndex);
							error = false;
						} else {
							Room newRoom = new Room(i, 1, startDate, endDate);
							int roomIndex = database.addRooms(newRoom);
							database.saveReservationRecord(ID, roomIndex);
							error = false;
						}
					}
				}
				if(error == true) {
						JOptionPane.showMessageDialog(new JFrame(), "Room Number Selected Is Not\n Available Within Date Chosen", "Dialog", JOptionPane.ERROR_MESSAGE);
						makeReservationPage.dispose();
						build();
				}
				else {
					GuestChooseReceiptView receiptView = new GuestChooseReceiptView(database, ID);
				
				makeReservationPage.dispose();
				}
			}
		});

		panel.add(selectRoomLabel);
		panel.add(selectRoomField);
		panel.add(openRoom);
		panel.add(confirmButton);
		panel.add(recieptButton);

		makeReservationPage.getContentPane().add(panel);

		makeReservationPage.setSize(685, 300);
		makeReservationPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//makeReservationPage.pack();
		makeReservationPage.setVisible(true);
	}


}