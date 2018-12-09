import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * the receipt shows the reservations and the total due made by the current transaction 
 * with the corresponding total amount due
 */

public class GuestSimpleReceiptView{
	
	private Database database;

	private int accountID;
	private String startDate;
	private String endDate;
	private int totalCost;
	private int numberOfNights;

	private ReservationRecord record;
	
	public GuestSimpleReceiptView(Database database,int accountID){
		this.database = database;
		this.accountID = accountID;
		//this.numberOfNights = numberOfNights;
		build();
	}
	
	public void build(){
		JFrame GuestSimpleReceipt = new JFrame();
		JPanel panel = new JPanel();
		
		JButton quitButton = new JButton();
		quitButton.setText("Quit");
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Simple Receipt View clicked");
				
				GuestMenuView viewGuestMenu = new GuestMenuView(database, accountID);
				GuestSimpleReceipt.dispose();
			}
					
		});
		
		JButton showTotal = new JButton();
		showTotal.setText("Show Total");
		showTotal.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
//				Database data = new Database();
//				data.getTotalCost(accountID, accountID);

				
			}
		});
		
		panel.add(showTotal);
		panel.add(quitButton);
		
		GuestSimpleReceipt.getContentPane().add(panel);
		GuestSimpleReceipt.setSize(500, 500);
		GuestSimpleReceipt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GuestSimpleReceipt.pack();
		GuestSimpleReceipt.setVisible(true);	
	}
	
}
