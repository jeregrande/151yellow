import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuestChooseReceiptView {

	//gonna pass in variables like int j for the number of days 
	//takes it in constructor from the guestmakereservation2 
	
	
	//when done, pass back database and accountID(the current account ID)
	
	private Database database;
	private int numberOfNights;
	private static int accountID;
	
	public GuestChooseReceiptView(Database database, int accountID){
		this.database = database;
		this.accountID = accountID;
		//this.numberOfNights = numberOfNights;
		build();
	}
	
	
	private void build() {
		JFrame GuestChooseReceiptViewPage = new JFrame();
		JPanel panel = new JPanel();

//		For a vertical menu
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JButton selectSimpleReceipt = new JButton();
		selectSimpleReceipt.setText("Select Simple Receipt");
		selectSimpleReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Simple Receipt View clicked");
				
				GuestSimpleReceiptView simpleReceiptView = new GuestSimpleReceiptView(database, accountID);
				GuestChooseReceiptViewPage.dispose();
				
			}
		});

		JButton selectComprehensiveReceipt = new JButton();
		selectComprehensiveReceipt.setText("Select Comprehensive Receipt");
		selectComprehensiveReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Comprehensive Receipt View clicked.");

				GuestComplexReceiptView complexReceiptView = new GuestComplexReceiptView(database, accountID);
				GuestChooseReceiptViewPage.dispose();
			}
		});
		
		panel.add(selectSimpleReceipt);
		panel.add(selectComprehensiveReceipt);

		GuestChooseReceiptViewPage.getContentPane().add(panel);
		GuestChooseReceiptViewPage.setSize(500, 500);
		GuestChooseReceiptViewPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GuestChooseReceiptViewPage.pack();
		GuestChooseReceiptViewPage.setVisible(true);
	}

	public static void main(String[] args) {
		Database database = new Database();
		GuestChooseReceiptView receiptView = new GuestChooseReceiptView(database, accountID);
	}
}
