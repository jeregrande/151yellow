
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuestCancelView {
	private Database database;
	private int ID;
	
	public GuestCancelView(Database database, int accountID) {
		this.database = database;
		this.ID = accountID;
		build();
	}
	
	private void build() {
		JFrame guestCancelPage = new JFrame();
		JPanel panel = new JPanel();
		
		panel.setSize(1200, 900);
		panel.setLayout(new GridLayout(2, 2));
//		For a vertical menu
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		JTextField selectedReservation = new JTextField();
		
		JTextArea reservedRoom = new JTextArea();
		reservedRoom.setEditable(false);
		reservedRoom.setSize(600,400);
		ArrayList<String> bookedRoooms = database.getGuestReserverationRecord(ID);
		String newText = " ";
		int numberInArray = 0;
		for(String s: bookedRoooms) {
			newText +="#"+numberInArray +" : " + s + "\n";
			numberInArray ++;
		}
		reservedRoom.setText("Reserved room(s) will be displayed here" + "\n" + "Input the number\nSTARTING FROM 0 (ZERO) AT THE TOP(STARTING RESERVATION)\nthat you wish cancel" + "\n" + "----ENTER NUMBER HERE------->"+ "\n" + newText);

		JButton deleteButton = new JButton();
		deleteButton.setText("Delete Reservation");
		deleteButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Delete Selected");
				int selected = Integer.parseInt(selectedReservation.getText());
				
				database.deleteReservation(selected);
				ArrayList<String> updated = database.getGuestReserverationRecord(ID);
				String updatedText = " ";
				int arrayNumber =0;
				for(String s: updated) {
					updatedText +="#"+ arrayNumber + " " +  s + "\n";
					arrayNumber ++;
				}
				reservedRoom.setText("Updated Reserved room(s) will be displayed here" + "\n" + "Input the number after the #\n that you wish cancel" + "\n" + "----ENTER NUMBER HERE------->"+ "\n" + updatedText);
			}
		});
		
		JButton menuButton = new JButton();
		menuButton.setText("Main Menu");
		menuButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("logout clicked.");
				GuestMenuView startupPage = new GuestMenuView(database,ID);
				guestCancelPage.dispose();
			}
		});
		
		panel.add(reservedRoom);
		panel.add(selectedReservation);
		panel.add(deleteButton);
		panel.add(menuButton);


		guestCancelPage.getContentPane().add(panel);
		

		guestCancelPage.setSize(500, 500);
		guestCancelPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guestCancelPage.pack();
		guestCancelPage.setVisible(true);
	}

	public static void main(String[] args) {
		Database database = new Database();
		int i = 0;
		GuestCancelView view = new GuestCancelView(database, i);
	}
}
