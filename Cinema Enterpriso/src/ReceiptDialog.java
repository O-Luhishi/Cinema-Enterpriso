import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReceiptDialog extends JDialog{
		
	private Container cp;
		
	private JLabel lblCinemaOrderReceipt;

	
	
	public ReceiptDialog(FirstPageGui parent, boolean modal){
		
		super (parent, modal);
	
		
		lblCinemaOrderReceipt = new JLabel();
		
		
		
		lblCinemaOrderReceipt.setText("Cinema Order Receipt");
		lblCinemaOrderReceipt.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblCinemaOrderReceipt, BorderLayout.NORTH);

		
		
	}
	
}
