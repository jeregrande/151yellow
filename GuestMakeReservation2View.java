package hotelReservationSystem;

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

		makeReservationPage.setSize(600, 450);
		panel.setSize(600, 450);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		JTextField selectRoomField = new JTextField();
		
		JTextArea openRoom = new JTextArea();
		openRoom.setEditable(false);
		openRoom.setSize(600,400);
		String newText = " ";
		for(int i: open) {
			newText += i + "\n";
		}
		openRoom.setText("Available Rooms" + "\n" + "1-10 are Premium($300)" + "\n" + "11-20 are Standard($100) " +"\n" + "------ENTER ROOM NUMBER THEN CLICK CONFIRM------------->" +"\n" + newText );

		JButton confirmButton = new JButton();
		confirmButton.setText("Confirm");
		confirmButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Confirm Clicked.");
				int inputRoomNumber = Integer.parseInt(selectRoomField.getText());

				for (int i = 0; i < open.size(); i++) {
					if (open.get(i).equals(inputRoomNumber)) {
						if (i >= 1 && i <= 10) {
							Room newRoom = new Room(i, 0, startDate, endDate);
							int roomIndex = database.addRooms(newRoom);
							database.saveReserverationRecord(ID , roomIndex);
							error = false;
						} else {
							Room newRoom = new Room(i, 1, startDate, endDate);
							int roomIndex = database.addRooms(newRoom);
							database.saveReserverationRecord(ID, roomIndex);
							error = false;
						}
					}
				}
				if(error == true) {
						JOptionPane.showMessageDialog(new JFrame(), "Room Number Selected Is Not\n Available Within Date Chosen", "Dialog", JOptionPane.ERROR_MESSAGE);
						makeReservationPage.dispose();
						build();
				}
				GuestMenuView gMenuView = new GuestMenuView(database,ID);
				makeReservationPage.dispose();

			}
		});

		
		panel.add(openRoom);
		panel.add(selectRoomField);
		panel.add(confirmButton);

		makeReservationPage.getContentPane().add(panel);

		makeReservationPage.setSize(500, 500);
		makeReservationPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		makeReservationPage.pack();
		makeReservationPage.setVisible(true);
	}


}