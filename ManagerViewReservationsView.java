package hotelReservationSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ManagerViewReservationsView {

	private Database database;
	private static int roomSelected; // Tentative

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

		JButton loadButton = new JButton();
		loadButton.setText("By Day Controller");

		JTextArea dayViewArea = new JTextArea();
		dayViewArea.setText("Day information will be displayed here.");

		// Room view
		JTextArea roomViewArea = new JTextArea();
		roomViewArea.setText("Room information will be displayed here.");

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
				roomSelected = 1;
				// TODO: Update room view
			}
		});

		room2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 2 clicked.");
				roomSelected = 2;
			}
		});

		room3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 3 clicked.");
				roomSelected = 3;
			}
		});

		room4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 4 clicked.");
				roomSelected = 4;
			}
		});

		room5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 5 clicked.");
				roomSelected = 5;
			}
		});

		room6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 6 clicked.");
				roomSelected = 6;
			}
		});

		room7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 7 clicked.");
				roomSelected = 7;
			}
		});

		room8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 8 clicked.");
				roomSelected = 8;
			}
		});

		room9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 9 clicked.");
				roomSelected = 9;
			}
		});

		room10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 10 clicked.");
				roomSelected = 10;
			}
		});

		room11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 11 clicked.");
				roomSelected = 11;
			}
		});

		room12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 12 clicked.");
				roomSelected = 12;
			}
		});

		room13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 13 clicked.");
				roomSelected = 13;
			}
		});

		room14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 14 clicked.");
				roomSelected = 14;
			}
		});

		room15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 15 clicked.");
				roomSelected = 15;
			}
		});

		room16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 16 clicked.");
				roomSelected = 16;
			}
		});

		room17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 17 clicked.");
				roomSelected = 17;
			}
		});

		room18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 18 clicked.");
				roomSelected = 18;
			}
		});

		room19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 19 clicked.");
				roomSelected = 19;
			}
		});

		room20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 20 clicked.");
				roomSelected = 20;
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

		panel.add(loadButton);
		panel.add(dayViewArea);
		panel.add(roomViewPanel);
		panel.add(roomViewArea);

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
