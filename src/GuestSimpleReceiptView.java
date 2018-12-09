
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
 * the receipt shows the reservations and the total due made by the current transaction 
 * with the corresponding total amount due
 */

public class GuestSimpleReceiptView{
	
	private Database database;
	private int accountID;
	private double cost;
	
	public GuestSimpleReceiptView(Database database,int accountID, double cost){
		this.database = database;
		this.accountID = accountID;
		this.cost = cost;
		build();
	}
	
	public void build(){
		JFrame GuestSimpleReceipt = new JFrame();
		JPanel panel = new JPanel();
		
		JTextArea receipt = new JTextArea();
		receipt.setEditable(false);
		receipt.setSize(500,500);
		receipt.setText(database.getLastAddedReservation(accountID) +" | Total Cost: " + cost);
		
		
		JButton quitButton = new JButton();
		quitButton.setText("Quit");
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Simple Receipt View clicked");
				
				GuestMenuView viewGuestMenu = new GuestMenuView(database, accountID);
				GuestSimpleReceipt.dispose();
			}
					
		});
		panel.add(receipt);
		panel.add(quitButton);
		
		GuestSimpleReceipt.getContentPane().add(panel);
		GuestSimpleReceipt.setSize(500, 500);
		GuestSimpleReceipt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GuestSimpleReceipt.pack();
		GuestSimpleReceipt.setVisible(true);	
	}
	
}