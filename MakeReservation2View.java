package hotelReservationSystem;

import java.awt.event.*;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class MakeReservation2View {
	private Database database;
	private List<Integer> open;
	private String startDate;
	private String endDate;

	public MakeReservation2View(Database database, List<Integer> a, String start, String end) {
		this.database = database;
		this.open = a;
		this.startDate = start;
		this.endDate = end;
		build();
	}

	private void build() {
		JFrame makeReservationPage = new JFrame();
		JPanel panel = new JPanel();

		makeReservationPage.setSize(600, 450);
		panel.setSize(600, 450);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		JTextField selectRoomField = new JTextField();

		JLabel selectRoomLabel = new JLabel();
		selectRoomLabel.setText("Room Number 1- 20. 1 - 10 are Premium ($300) and 11-20 are Standard ($100)");
		selectRoomLabel.setBounds(10, 10, 100, 100);

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
							database.addRooms(newRoom);
							System.out.println(database.getAccounts());
							System.out.println(database.getRooms());
						} else {
							Room newRoom = new Room(i, 1, startDate, endDate);
							database.addRooms(newRoom);
						}
					}
				}

				GuestMenuView gMenuView = new GuestMenuView(database);
				makeReservationPage.dispose();

			}
		});

		panel.add(selectRoomLabel);
		panel.add(selectRoomField);
		panel.add(confirmButton);

		makeReservationPage.getContentPane().add(panel);

		makeReservationPage.setSize(500, 500);
		makeReservationPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		makeReservationPage.pack();
		makeReservationPage.setVisible(true);
	}

	public static void main(String[] args) {
		Database database = new Database();
		ArrayList<Integer> array = new ArrayList<>();
		String string1 = new String();
		String string2 = new String();
		MakeReservation2View view = new MakeReservation2View(database, array, string1, string2);
	}

}