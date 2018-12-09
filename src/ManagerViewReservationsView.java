package hotelReservationSystem;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.YearMonth;

import javax.swing.*;
import java.util.*;

public class ManagerViewReservationsView {

	private Database database; // THE MODEL
	SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

	public ManagerViewReservationsView(Database database) {
		this.database = database;
		try {
			build();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void build() throws ParseException {
		JFrame managerViewReservationsPage = new JFrame();
		JPanel topPanel = new JPanel();
		JPanel midPanel = new JPanel();
		JPanel botPanel = new JPanel();

		managerViewReservationsPage.setLayout(new GridLayout(3, 1));
		topPanel.setLayout(new GridLayout(1, 2));
		midPanel.setLayout(new GridLayout(1, 2));
		botPanel.setLayout(new GridLayout(1, 1));

		// Day view controller elements
		JPanel dayViewControllerPanel = new JPanel();
		JPanel dayViewControllerTop = new JPanel();
		JPanel dayViewControllerBot = new JPanel();
		JPanel dayViewControllerTopDiv = new JPanel();

		dayViewControllerPanel.setLayout(new GridLayout(2, 1));
		dayViewControllerTop.setLayout(new GridLayout(1, 2));
		dayViewControllerBot.setLayout(new GridLayout(4, 7));
		dayViewControllerTopDiv.setLayout(new GridLayout(2, 2));

		dayViewControllerPanel.add(dayViewControllerTop);
		dayViewControllerPanel.add(dayViewControllerBot);
		dayViewControllerTop.add(dayViewControllerTopDiv);

		JLabel selectYear = new JLabel();
		JLabel selectMonth = new JLabel();
		JTextField inputYear = new JTextField();
		String[] months = { "--Choose month--", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY",
				"AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" };
		JComboBox<String> inputMonth = new JComboBox<String>(months);
		selectYear.setText("Input year: ");
		selectMonth.setText("Input month: ");
		inputYear.setEditable(true);

		dayViewControllerTopDiv.add(selectYear);
		dayViewControllerTopDiv.add(selectMonth);
		dayViewControllerTopDiv.add(inputYear);
		dayViewControllerTopDiv.add(inputMonth);

		JButton day1 = new JButton();
		JButton day2 = new JButton();
		JButton day3 = new JButton();
		JButton day4 = new JButton();
		JButton day5 = new JButton();
		JButton day6 = new JButton();
		JButton day7 = new JButton();
		JButton day8 = new JButton();
		JButton day9 = new JButton();
		JButton day10 = new JButton();
		JButton day11 = new JButton();
		JButton day12 = new JButton();
		JButton day13 = new JButton();
		JButton day14 = new JButton();
		JButton day15 = new JButton();
		JButton day16 = new JButton();
		JButton day17 = new JButton();
		JButton day18 = new JButton();
		JButton day19 = new JButton();
		JButton day20 = new JButton();
		JButton day21 = new JButton();
		JButton day22 = new JButton();
		JButton day23 = new JButton();
		JButton day24 = new JButton();
		JButton day25 = new JButton();
		JButton day26 = new JButton();
		JButton day27 = new JButton();
		JButton day28 = new JButton();
		JButton day29 = new JButton();
		JButton day30 = new JButton();
		JButton day31 = new JButton();

		day1.setText("1");
		day2.setText("2");
		day3.setText("3");
		day4.setText("4");
		day5.setText("5");
		day6.setText("6");
		day7.setText("7");
		day8.setText("8");
		day9.setText("9");
		day10.setText("10");
		day11.setText("11");
		day12.setText("12");
		day13.setText("13");
		day14.setText("14");
		day15.setText("15");
		day16.setText("16");
		day17.setText("17");
		day18.setText("18");
		day19.setText("19");
		day20.setText("20");
		day21.setText("21");
		day22.setText("22");
		day23.setText("23");
		day24.setText("24");
		day25.setText("25");
		day26.setText("26");
		day27.setText("27");
		day28.setText("28");
		day29.setText("29");
		day30.setText("30");
		day31.setText("31");

		dayViewControllerBot.add(day1);
		dayViewControllerBot.add(day2);
		dayViewControllerBot.add(day3);
		dayViewControllerBot.add(day4);
		dayViewControllerBot.add(day5);
		dayViewControllerBot.add(day6);
		dayViewControllerBot.add(day7);
		dayViewControllerBot.add(day8);
		dayViewControllerBot.add(day9);
		dayViewControllerBot.add(day10);
		dayViewControllerBot.add(day11);
		dayViewControllerBot.add(day12);
		dayViewControllerBot.add(day13);
		dayViewControllerBot.add(day14);
		dayViewControllerBot.add(day15);
		dayViewControllerBot.add(day16);
		dayViewControllerBot.add(day17);
		dayViewControllerBot.add(day18);
		dayViewControllerBot.add(day19);
		dayViewControllerBot.add(day20);
		dayViewControllerBot.add(day21);
		dayViewControllerBot.add(day22);
		dayViewControllerBot.add(day23);
		dayViewControllerBot.add(day24);
		dayViewControllerBot.add(day25);
		dayViewControllerBot.add(day26);
		dayViewControllerBot.add(day27);
		dayViewControllerBot.add(day28);
		dayViewControllerBot.add(day29);
		dayViewControllerBot.add(day30);
		dayViewControllerBot.add(day31);

		/*
		 * VIEWS
		 */
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

		room1.setText("Room 1");
		room2.setText("Room 2");
		room3.setText("Room 3");
		room4.setText("Room 4");
		room5.setText("Room 5");
		room6.setText("Room 6");
		room7.setText("Room 7");
		room8.setText("Room 8");
		room9.setText("Room 9");
		room10.setText("Room 10");
		room11.setText("Room 11");
		room12.setText("Room 12");
		room13.setText("Room 13");
		room14.setText("Room 14");
		room15.setText("Room 15");
		room16.setText("Room 16");
		room17.setText("Room 17");
		room18.setText("Room 18");
		room19.setText("Room 19");
		room20.setText("Room 20");

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

		/*
		 * CONTROLLERS
		 */
		// Year & month controller
		inputMonth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				if (selectedYear.equals("")) {
					System.out.println("Year not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {
					int theYear = Integer.parseInt(selectedYear);
					Month theMonth = Month.valueOf(selectedMonth);
					System.out.println("Year: " + selectedYear + "\n" + "Month: " + selectedMonth);
					// TODO: Make Gregorian Calendar and blank out unavailable dates
					YearMonth monthLength = YearMonth.of(theYear, theMonth);
					System.out.println("Length of date: " + monthLength.lengthOfMonth());

					if (monthLength.lengthOfMonth() == 28) {
						day29.setEnabled(false);
						day30.setEnabled(false);
						day31.setEnabled(false);
					} else if (monthLength.lengthOfMonth() == 29) {
						day29.setEnabled(true);
						day30.setEnabled(false);
						day31.setEnabled(false);
					} else if (monthLength.lengthOfMonth() == 30) {
						day29.setEnabled(true);
						day30.setEnabled(true);
						day31.setEnabled(false);
					} else if (monthLength.lengthOfMonth() == 31) {
						day29.setEnabled(true);
						day30.setEnabled(true);
						day31.setEnabled(true);
					}
				}
			}
		});

		// Day controllers
		day1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 1 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "01/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 2 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "02/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});

		day3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 3 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "03/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 4 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "04/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 5 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "05/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 6 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "06/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 7 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "07/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 8 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "08/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 9 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "09/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 10 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "10/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 11 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "11/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 12 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "12/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 13 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "13/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 14 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "14/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 15 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "15/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 16 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "16/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 17 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "17/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 18 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "18/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 19 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "19/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 20 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "20/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 21 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "21/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 22 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "22/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 23 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "23/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 24 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "24/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 25 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "25/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 26 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "26/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 27 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "27/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 28 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "28/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 29 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "29/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 30 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "30/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		day31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Day 31 clicked.");

				String selectedYear = inputYear.getText();
				String selectedMonth = (String) inputMonth.getSelectedItem();

				System.out.println("Month: " + selectedMonth);
				if (selectedMonth.equals("") || inputMonth.getSelectedIndex() == 0) {
					System.out.println("Year/month not selected.");
					JOptionPane.showMessageDialog(new JFrame(), "Please input a year & month first.", "Dialog",
							JOptionPane.ERROR_MESSAGE);
					managerViewReservationsPage.dispose();
					try {
						build();
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

				else {
					// Get the MM for date
					Month theMonth = Month.valueOf(selectedMonth);
					int monthLength = theMonth.getValue();
					String monthNumber;
					if (monthLength < 10) {
						monthNumber = "0" + monthLength;
					} else {
						monthNumber = "" + monthLength + "";
					}
					String toDate = monthNumber + "/" + "31/" + selectedYear;
					System.out.println(toDate);

					ArrayList<Integer> availableRooms = new ArrayList<Integer>();

					try {
						for (int i : database.getAvailableRooms(toDate)) {
							availableRooms.add(i);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					ArrayList<ReservationRecord> reservedRooms = new ArrayList<ReservationRecord>();
					try {
						for (ReservationRecord rr : database.getReservedRooms(toDate)) {
							reservedRooms.add(rr);
						}
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (availableRooms.size() == 20) {
						String text = "Available rooms: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14, 15, 16, 17, 18, 19, 20";
						dayViewDisplay.setText(text);
					} else {
						String text = "";
						text += "Available rooms: " + "\n";

						// Add all available rooms to text area string.
						for (int i = 0; i < availableRooms.size(); i++) {
							int toInt = availableRooms.get(i);
							String a = "" + toInt + "";
							text += (a + ", ");
						}

						text += "\n" + "\n";
						text += "Reserved rooms:";
						text += "\n";

						// Add all reserved rooms to text area string.
						for (ReservationRecord rr : reservedRooms) {
							int roomNumber = rr.getRoomNumber();
							String username = rr.getUsername();

							roomNumber++;
							text += (roomNumber + " - Reserved by user: " + username + "\n");
						}
						dayViewDisplay.setText(text);
					}
				}
			}
		});
		
		// Room view controllers
		room1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Room 1 clicked.");

				String reservationEntries = "";
				ArrayList<String> entries = database.getRoomReservations(1);
				for (String s : entries) {
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
				for (String s : entries) {
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
				for (String s : entries) {
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
				for (String s : entries) {
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
				for (String s : entries) {
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
				for (String s : entries) {
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
				for (String s : entries) {
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
				for (String s : entries) {
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
				for (String s : entries) {
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
				for (String s : entries) {
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
				for (String s : entries) {
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
				for (String s : entries) {
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
				for (String s : entries) {
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
				for (String s : entries) {
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
				for (String s : entries) {
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
				for (String s : entries) {
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
				for (String s : entries) {
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
				for (String s : entries) {
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
				for (String s : entries) {
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
				for (String s : entries) {
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

		topPanel.add(dayViewControllerPanel);
		topPanel.add(dayViewDisplay);
		midPanel.add(roomViewPanel);
		midPanel.add(roomViewDisplay);
		botPanel.add(bottomButton);

		managerViewReservationsPage.getContentPane().add(topPanel);
		managerViewReservationsPage.getContentPane().add(midPanel);
		managerViewReservationsPage.getContentPane().add(botPanel);

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