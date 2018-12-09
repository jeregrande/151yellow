import java.awt.TextArea;
import java.awt.event.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import javax.swing.*;

public class GuestMakeReservationView {
	private Database database;
	private JTextArea textArea;
	private int ID;
	
	public GuestMakeReservationView(Database database, int accountID) {
		this.database = database;
		this.ID = accountID;
		build();
	}

	private void build() {
		JFrame makeReservationPage = new JFrame();
		JPanel panel = new JPanel();

		makeReservationPage.setSize(600, 450);
		panel.setSize(600, 450);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		JTextField startDateField = new JTextField();
		JTextField endDateField = new JTextField();

		JLabel startDateLabel = new JLabel();
		startDateLabel.setText("Input Check In Date (MM/DD/YYYY):");
		startDateLabel.setBounds(10, 10, 100, 100);

		JLabel endDateLabel = new JLabel();
		endDateLabel.setText("Input Check Out Date (MM/DD/YYYY):");
		endDateLabel.setBounds(10, 10, 100, 100);

		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setSize(100, 400);

		JButton selectRoom = new JButton();
		selectRoom.setText("Select Room");
		selectRoom.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Select Room Clicked");
				String inputStartDate = startDateField.getText();
				String inputEndDate = endDateField.getText();
				try {
					GuestMakeReservation2View selectRoom = new GuestMakeReservation2View(database,
							database.checkRoom(inputStartDate, inputEndDate), inputStartDate, inputEndDate,ID);
					makeReservationPage.dispose();

				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				makeReservationPage.dispose();

			}
		});

		JButton displayButton = new JButton();
		displayButton.setText("Display Avaiable Rooms");
		displayButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Display Clicked.");
				String inputStartDate = startDateField.getText();
				String inputEndDate = endDateField.getText();

				try {
					if(database.correctStartDate(inputStartDate)==true && database.correctEndDate(inputStartDate, inputEndDate)==true) {
						textArea.setText(" ");
						String newText = " ";
						ArrayList<Integer> roomNumbers = new ArrayList<Integer>();
						for(int i:database.checkRoom(inputStartDate, inputEndDate)) {
							roomNumbers.add(i);
						}
						for(int i: roomNumbers) {
							newText += i + "\n";
						}
						textArea.setText("Please Remember The Room Number You Would Like!\nRooms 1-10 are Premium($300)\nRooms11-20 are Standard($100)"+ "\n" +newText);
					}
					else if(database.correctStartDate(inputStartDate)==false || database.correctEndDate(inputStartDate, inputEndDate)==false) {
						JOptionPane.showMessageDialog(new JFrame(), "Start Date Must Be From Today Onwards\nEnd Date Must Be From Day After Start Date Up To 60 Days!!", "Dialog", JOptionPane.ERROR_MESSAGE);
						makeReservationPage.dispose();
						build();
					}
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		
		panel.add(startDateLabel);
		panel.add(startDateField);
		panel.add(endDateLabel);
		panel.add(endDateField);
		panel.add(displayButton);
		panel.add(selectRoom);
		panel.add(textArea);
		makeReservationPage.getContentPane().add(panel);

		makeReservationPage.setSize(500, 500);
		makeReservationPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		makeReservationPage.pack();
		makeReservationPage.setVisible(true);
	}

	public static void main(String[] args) {
		Database database = new Database();
		int i = 1;
		GuestMakeReservationView view = new GuestMakeReservationView(database,i);
	}

}