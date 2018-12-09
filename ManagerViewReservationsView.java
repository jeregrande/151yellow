import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ManagerViewReservationsView {

	private Database database;

	public ManagerViewReservationsView(Database database) {
		this.database = database;
		build();
	}

	private void build() {
		JFrame managerViewReservationsPage = new JFrame();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));
		managerViewReservationsPage.setLayout(new GridLayout(2, 1));

		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(1, 1));

		JButton dayViewControllerFiller = new JButton();
		dayViewControllerFiller.setText("By Day Controller");

		// Views
		JTextArea dayViewDisplay = new JTextArea(); // Day view
		dayViewDisplay.setEditable(false);
		dayViewDisplay.setSize(600, 400);
		dayViewDisplay.setText("Day information will be displayed here.");

		JTextArea roomViewDisplay = new JTextArea(); // Room view
		roomViewDisplay.setEditable(false);
		roomViewDisplay.setSize(600, 400);
		roomViewDisplay.setText("Room information will be displayed here.");

		// Room view controller's elements
		JPanel roomViewPanel = new JPanel();
		roomViewPanel.setLayout(new GridLayout(4, 5));
		JButton room1 = new JButton();
		JButton room2 = new JButton();
		JButton room3 = new JButton();
		JButton room4 = new JButton();
		JButton room5 = new JButton();
		JButton room6 = new JButton();
		JButton room7 = new JButton();
		JButton room8 = new JButton();
		JButton room9 = new JButton();
		JButton room10 = new JButton();
		JButton room11 = new JButton();
		JButton room12 = new JButton();
		JButton room13 = new JButton();
		JButton room14 = new JButton();
		JButton room15 = new JButton();
		JButton room16 = new JButton();
		JButton room17 = new JButton();
		JButton room18 = new JButton();
		JButton room19 = new JButton();
		JButton room20 = new JButton();
		room1.setText("1");
		room2.setText("2");
		room3.setText("3");
		room4.setText("4");
		room5.setText("5");
		room6.setText("6");
		room7.setText("7");
		room8.setText("8");
		room9.setText("9");
		room10.setText("10");
		room11.setText("11");
		room12.setText("12");
		room13.setText("13");
		room14.setText("14");
		room15.setText("15");
		room16.setText("16");
		room17.setText("17");
		room18.setText("18");
		room19.setText("19");
		room20.setText("20");
		roomViewPanel.add(room1);
		roomViewPanel.add(room2);
		roomViewPanel.add(room3);
		roomViewPanel.add(room4);
		roomViewPanel.add(room5);
		roomViewPanel.add(room6);
		roomViewPanel.add(room7);
		roomViewPanel.add(room8);
		roomViewPanel.add(room9);
		roomViewPanel.add(room10);
		roomViewPanel.add(room11);
		roomViewPanel.add(room12);
		roomViewPanel.add(room13);
		roomViewPanel.add(room14);
		roomViewPanel.add(room15);
		roomViewPanel.add(room16);
		roomViewPanel.add(room17);
		roomViewPanel.add(room18);
		roomViewPanel.add(room19);
		roomViewPanel.add(room20);

		// Room view controllers
		room1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 1 clicked.");

				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(1);
				for(String s: entries) {
					reservationEntries += s + "\n";
				}
				roomViewDisplay.setText(reservationEntries);
			}
		});

		room2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 2 clicked.");
				
				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(2);
				for(String s: entries) {
					reservationEntries += s + "\n";
				}
				roomViewDisplay.setText(reservationEntries);
			}
		});

		room3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 3 clicked.");

				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(3);
				for(String s: entries) {
					reservationEntries += s + "\n";
				}
				roomViewDisplay.setText(reservationEntries);
			}
		});

		room4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 4 clicked.");

				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(4);
				for(String s: entries) {
					reservationEntries += s + "\n";
				}
				roomViewDisplay.setText(reservationEntries);
			}
		});

		room5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 5 clicked.");

				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(5);
				for(String s: entries) {
					reservationEntries += s + "\n";
				}
				roomViewDisplay.setText(reservationEntries);
			}
		});

		room6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 6 clicked.");

				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(6);
				for(String s: entries) {
					reservationEntries += s + "\n";
				}
				roomViewDisplay.setText(reservationEntries);
			}
		});

		room7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 7 clicked.");

				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(7);
				for(String s: entries) {
					reservationEntries += s + "\n";
				}
				roomViewDisplay.setText(reservationEntries);
			}
		});

		room8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 8 clicked.");

				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(8);
				for(String s: entries) {
					reservationEntries += s + "\n";
				}
				roomViewDisplay.setText(reservationEntries);
			}
		});

		room9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 9 clicked.");

				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(9);
				for(String s: entries) {
					reservationEntries += s + "\n";
				}
				roomViewDisplay.setText(reservationEntries);
			}
		});

		room10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 10 clicked.");

				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(10);
				for(String s: entries) {
					reservationEntries += s + "\n";
				}
				roomViewDisplay.setText(reservationEntries);
			}
		});

		room11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 11 clicked.");

				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(11);
				for(String s: entries) {
					reservationEntries += s + "\n";
				}
				roomViewDisplay.setText(reservationEntries);
			}
		});

		room12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 12 clicked.");

				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(12);
				for(String s: entries) {
					reservationEntries += s + "\n";
				}
				roomViewDisplay.setText(reservationEntries);
			}
		});

		room13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 13 clicked.");

				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(13);
				for(String s: entries) {
					reservationEntries += s + "\n";
				}
				roomViewDisplay.setText(reservationEntries);
			}
		});

		room14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 14 clicked.");

				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(14);
				for(String s: entries) {
					reservationEntries += s + "\n";
				}
				roomViewDisplay.setText(reservationEntries);
			}
		});

		room15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 15 clicked.");

				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(15);
				for(String s: entries) {
					reservationEntries += s + "\n";
				}
				roomViewDisplay.setText(reservationEntries);
			}
		});

		room16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 16 clicked.");

				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(16);
				for(String s: entries) {
					reservationEntries += s + "\n";
				}
				roomViewDisplay.setText(reservationEntries);
			}
		});

		room17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 17 clicked.");

				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(17);
				for(String s: entries) {
					reservationEntries += s + "\n";
				}
				roomViewDisplay.setText(reservationEntries);
			}
		});

		room18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 18 clicked.");

				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(18);
				for(String s: entries) {
					reservationEntries += s + "\n";
				}
				roomViewDisplay.setText(reservationEntries);
			}
		});

		room19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 19 clicked.");

				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(19);
				for(String s: entries) {
					reservationEntries += s + "\n";
				}
				roomViewDisplay.setText(reservationEntries);
			}
		});

		room20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 20 clicked.");

				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(20);
				for(String s: entries) {
					reservationEntries += s + "\n";
				}
				roomViewDisplay.setText(reservationEntries);
			}
		});

		JButton bottomButton = new JButton();
		bottomButton.setText("Back");
		bottomButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Back button clicked");
				ManagerMenuView managerMenuPage = new ManagerMenuView(database);
				managerViewReservationsPage.dispose();
			}
		});

		panel.add(dayViewControllerFiller);
		panel.add(dayViewDisplay);
		panel.add(roomViewPanel);
		panel.add(roomViewDisplay);

		bottomPanel.add(bottomButton);

		managerViewReservationsPage.getContentPane().add(panel);
		managerViewReservationsPage.getContentPane().add(bottomPanel);

		managerViewReservationsPage.setSize(500, 500);
		managerViewReservationsPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		managerViewReservationsPage.pack();
		managerViewReservationsPage.setVisible(true);
	}

	public static void main(String[] args) {
		Database database = new Database();
		ManagerViewReservationsView view = new ManagerViewReservationsView(database);
	}

}
