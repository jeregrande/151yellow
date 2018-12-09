import java.awt.TextArea;
import java.awt.event.*;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.*;

public class MakeReservationView {
	private  Database database;
	private JTextArea textArea;

	public MakeReservationView(Database database) {
		this.database = database;
		build();
	}

	private  void build() {
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
		textArea.setSize(100,400);
		
		JButton selectRoom = new JButton();
		selectRoom.setText("Select Room");
		selectRoom.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Select Room Clicked");
				String inputStartDate = startDateField.getText();
				String inputEndDate = endDateField.getText();
				try {
					MakeReservation2View selectRoom = new  MakeReservation2View(database,database.checkRoom(inputStartDate, inputEndDate), inputStartDate, inputEndDate);
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
					JList<Integer> displayRooms = new JList<>(database.checkRoom(inputStartDate, inputEndDate).toArray(new Integer[0]));
					//JScrollPane scrollPane = new JScrollPane(displayRooms);
					//panel.add(scrollPane);
					//makeReservationPage.getContentPane().add(scrollPane);
					
					textArea.setText("");
					String newText = "";
					ArrayList<Integer> roomNumbers = new ArrayList<Integer>();
					for(int i: database.checkRoom(inputStartDate, inputEndDate)) {
						roomNumbers.add(i);
					}
					for(int i: roomNumbers) {
						newText += i+"\n";
					}
					
					textArea.setText("Please Remember The Room Number You Would Like! Rooms 1-10 are Premium($300) and Rooms 11-20 are Standard($100) " + "\n" +newText);
					
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
		MakeReservationView view = new MakeReservationView(database);
		view.build();
	}

}