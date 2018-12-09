import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * the receipt shows all valid reservations made by this user with the corresponding total amount due. 
 * For example, it is 10/11/28 and a user made 3 reservations on 10/11/18 for the period of 10/24/18-10/28/18. 
 * The user also made 2 reservations on 10/1/18 for the period of 12/25/18-12/30/18
 */

//room number, start~end date, total cost

public class GuestComplexReceiptView {
	
	private Database database;
	private int accountID;
	private int numberOfNights;

	public GuestComplexReceiptView(Database database,int accountID){
		this.database = database;
		this.accountID = accountID;
		build();
	}
	
	public void build(){
		JFrame GuestComplexReceipt = new JFrame();
		JPanel panel = new JPanel();
		
		JButton quitButton = new JButton();
		quitButton.setText("Quit");
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Complex Receipt View clicked");
				GuestMenuView viewGuestMenu = new GuestMenuView(database, accountID);					
				
			}

		});
		
		panel.add(quitButton);
		
		GuestComplexReceipt.getContentPane().add(panel);
		GuestComplexReceipt.setSize(500, 500);
		GuestComplexReceipt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GuestComplexReceipt.pack();
		GuestComplexReceipt.setVisible(true);	
	}
	
}
