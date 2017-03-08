import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReceiptDialog extends JFrame{

	FirstPageGui one = new FirstPageGui();
	FilmFileReader two = new FilmFileReader();
	
	private JLabel lblheader;
	private JLabel lblFilmName;
	private JLabel lblActualFilmName;
	private JLabel lblTimeOfShow;
	private JLabel lblActualTimeOfShow;
	private JLabel lblAdultTickets;
	private JLabel lblActualAdultTickets;
	private JLabel lblAdultQtyTicket;
	private JLabel lblActualAdultQty;
	
	private int filmName;

	
	// Constructor - Builds the UI
	public ReceiptDialog(){
		super("Cinemax Order Receipt");
		setUpReceipt();
		populateReceiptUI();
		

		
	}
	
	// Sets Up The Window
	public void setUpReceipt(){
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setSize(500,400);
		setVisible(true);


	}
	
	public void populateReceiptUI(){
		filmName = one.testing;

		System.out.println(filmName);
		
		
		// Initialising JLabels
		lblFilmName = new JLabel();
		lblheader = new JLabel();
		lblActualFilmName = new JLabel();
		lblTimeOfShow = new JLabel();
		lblActualTimeOfShow = new JLabel();
		lblAdultTickets = new JLabel();
		lblActualAdultTickets = new JLabel();
		lblAdultQtyTicket = new JLabel();
		lblActualAdultQty = new JLabel();
		
		
		// Setting The Title For UI
		lblheader.setFont(new Font("Times New Roman",Font.BOLD,18));
		lblheader.setForeground(new Color(0,68,90));
		lblheader.setText("CINEMAX RECEIPT");
		lblheader.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblheader);
		lblheader.setBounds(80,12,309,30);
		
		// Film Name Label & Actual Film Name
		lblFilmName.setFont(new Font("Times New Roman",Font.BOLD,12));
		lblFilmName.setText("Film:");
		getContentPane().add(lblFilmName);
		lblFilmName.setBounds(12,68,35,15);
		
		
		lblActualFilmName.setFont(new Font("Times New Roman",Font.BOLD,11));
		lblActualFilmName.setForeground(new Color(0, 102, 255));
		lblActualFilmName.setText("Avengers");
		getContentPane().add(lblActualFilmName);
		lblActualFilmName.setBounds(59,69,77,15);
		
		// Time Of Show Labels
		lblTimeOfShow.setFont(new Font("Times New Roman",Font.BOLD,12));
		lblTimeOfShow.setText("Time Of Show:");
		getContentPane().add(lblTimeOfShow);
		lblTimeOfShow.setBounds(12,95,104,15);
		
		lblActualTimeOfShow.setFont(new Font("Times New Roman",Font.BOLD,11));
		lblActualTimeOfShow.setForeground(new Color(0, 102, 255));
		lblActualTimeOfShow.setText("9:00 PM");
		getContentPane().add(lblActualTimeOfShow);
		lblActualTimeOfShow.setBounds(145,96,77,15);
		
		// Adult Ticket Labels
		lblAdultTickets.setFont(new Font("Times New Roman",Font.BOLD,12));
		lblAdultTickets.setText("Total Adult Tickets:");
		getContentPane().add(lblAdultTickets);
		lblAdultTickets.setBounds(12,120,151,15);
		
		lblActualAdultTickets.setFont(new Font("Times New Roman",Font.BOLD,11));
		lblActualAdultTickets.setForeground(new Color(0, 102, 255));
		lblActualAdultTickets.setText("£17.00");
		getContentPane().add(lblActualAdultTickets);
		lblActualAdultTickets.setBounds(167,121,55,15);
		
		
		lblAdultQtyTicket.setFont(new Font("Times New Roman",Font.BOLD,12));
		lblAdultQtyTicket.setText("Quantity:");
		getContentPane().add(lblAdultQtyTicket);
		lblAdultQtyTicket.setBounds(12,147,77,15);
		
		lblActualAdultQty.setFont(new Font("Times New Roman",Font.BOLD,11));
		lblActualAdultQty.setForeground(new Color(0, 102, 255));
		lblActualAdultQty.setText("4");
		getContentPane().add(lblActualAdultQty);
		lblActualAdultQty.setBounds(90,148,19,15);
		
		
		
	}
	
	
}
