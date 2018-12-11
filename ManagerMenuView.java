package hotelReservationSystem;

/**
 * This class displays the menu for the manager 
 */
import java.awt.event.*;
import javax.swing.*;

public class ManagerMenuView {

	private Database database;

	public ManagerMenuView(Database database) {
		this.database = database;
		build();
	}

	private void build() {
		JFrame managerMenuPage = new JFrame();
		JPanel panel = new JPanel();

//		For a vertical menu
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JButton loadButton = new JButton();
		loadButton.setText("Load Reservations");
		loadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Load clicked.");
				// TODO: Load reservations from database.txt
				database.load();
			}
		});

		JButton viewButton = new JButton();
		viewButton.setText("View Reservations");
		viewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("View clicked.");
				ManagerViewReservationsView managerViewReservationsPage = new ManagerViewReservationsView(database);
				managerMenuPage.dispose();
			}
		});

		JButton saveButton = new JButton();
		saveButton.setText("Save Reservations");
		saveButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Save clicked.");
				// TODO: Save reservations into database.txt
				database.saveText();
			}
		});

		JButton logoutButton = new JButton();
		logoutButton.setText("Logout");
		logoutButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Logout clicked.");
				HotelSystemDriver startupPage = new HotelSystemDriver(database);
				managerMenuPage.dispose();
			}
		});

		JButton quitButton = new JButton();
		quitButton.setText("Quit");
		quitButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("Quit clicked.");
				System.out.println("--System Terminated--");
				managerMenuPage.dispose();
				System.exit(0);
			}
		});

		panel.add(loadButton);
		panel.add(viewButton);
		panel.add(saveButton);
		panel.add(logoutButton);
		panel.add(quitButton);

		managerMenuPage.getContentPane().add(panel);

		managerMenuPage.setSize(500, 500);
		managerMenuPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		managerMenuPage.pack();
		managerMenuPage.setVisible(true);
	}


}
