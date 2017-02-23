import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * First page for Cinema Enterpriso GUI
 * Opens a page which can allow user to enter data
 * 
 * @author Osama Luhishi
 *
 */

public class FirstPageGui extends JFrame{
	
	// Declaring Integers
	private int comboIndex1;

	// Decalring Strings
	private String strRoomCapacity25 = "25";
	private String strRoomCapacity75 = "75";
	private String strRoomCapacity150 = "150";
	private String strRoomCapacity250 = "250";
	private String strTicketPriceSeven = "£7.00";
	private String strTicketPriceFive = "£5.00";
	private String strTicketPriceThree = "£3.00";
	
	// Declaring JLabel 
	private JLabel lblCinemaTitle;
	private JLabel lblMovieSelection;
	private JLabel lblTheatre_Time;
	private JLabel lblTheatreNo;
	private JLabel lblActualTheatreNo;
	private JLabel lblTimeOfShow;
	private JLabel lblActualTimeOfShow;
	private JLabel lblImgPreview;
	private JLabel lblTicketHeading;
	private JLabel lblAgeRating;
	private JLabel lblActualAgeRating;
	private JLabel lblNoSeats;
	private JLabel lblActualNoSeats;
	private JLabel lblAdultTicket;
	private JLabel lblChildTicket;
	private JLabel lblActualAdultTicket;
	private JLabel lblActualChildTicket;
	private JLabel lblAdultQty;
	private JLabel lblChildQty;
	private JLabel lblTicketSubTotal;
	
	
	// Declaring JComboBox's 
	private JComboBox<String> cmbMovies;
	private JComboBox<String> cmbAdultTicket;
	private JComboBox<String> cmbChildTicket;
 	
	// Declaring JSeparator's
	private JSeparator first_Seperator;
	private JSeparator third_Separator;
	
	public FirstPageGui(){
		super("Cinema Enterpriso");
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(null);
		
		// Label Init's
		lblCinemaTitle = new JLabel();
		lblMovieSelection = new JLabel();
		lblTheatre_Time = new JLabel();
		lblTheatreNo = new JLabel();
		lblActualTheatreNo = new JLabel();
		lblTimeOfShow = new JLabel();
		lblActualTimeOfShow = new JLabel();
		lblImgPreview = new JLabel();
		lblTicketHeading = new JLabel();
		lblAgeRating = new JLabel();
		lblActualAgeRating = new JLabel();
		lblAdultTicket = new JLabel();
		lblChildTicket = new JLabel();
		lblNoSeats = new JLabel();
		lblActualNoSeats = new JLabel();
		lblActualAdultTicket = new JLabel();
		lblActualChildTicket = new JLabel();
		lblAdultQty = new JLabel();
		lblChildQty = new JLabel();
		lblTicketSubTotal = new JLabel();
		

		// ComboBox Init's
		cmbMovies = new JComboBox<String>();
		cmbAdultTicket = new JComboBox<String>();
		cmbChildTicket = new JComboBox<String>();
		
		// Separator Init's
		first_Seperator = new JSeparator();
		third_Separator = new JSeparator();
		
		// Title Of The Program
		lblCinemaTitle.setFont(new Font("Times New Roman",Font.ITALIC,18));
		lblCinemaTitle.setText("HUDDERSFIELD CINEMAX");
		getContentPane().add(lblCinemaTitle);
		lblCinemaTitle.setBounds(200,15,240,30);
		
		// Movie Selection
		lblMovieSelection.setFont(new Font("Times New Roman",0,12));
		lblMovieSelection.setText("Select Movie:");
		getContentPane().add(lblMovieSelection);
		lblMovieSelection.setBounds(10,95,80,15);
		
		
		// Combo Box For Movie Selection
		cmbMovies.setModel(new DefaultComboBoxModel<String>(new String[]{"","Doctor Strange","T2 Trainspotting",
				"Guardians of the Galaxy Vol2", 
				"10 Cloverfield Lane","Disney: Moana","Rogue One: Star Wars","Kung Fu Panda 3","Power Rangers MMPR",
				"Avengers: Age of Ultron","Batman VS Superman"}));
		
		getContentPane().add(cmbMovies);
		cmbMovies.setBounds(100,90,230,25);

		
		// Listening For Any Events Coming From The Movie Combo Box
	    cmbMovies.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                cmbMoviesActionPerformed(evt);
	                lblMoviesTheatreActionPerformed(evt);
	                lblMoviesTimeActionPerformed(evt);
	                lblMovieAgeRatingActionPerformed(evt);
	                lblNoSeatsActionPerformed(evt);
	                lblTicketPriceActionPerformed(evt);
	            }
	        });
	    

	      
	    // Setting Up The Image Preview For When The Program First Runs
		lblImgPreview.setBounds(350,60,250,250);
		lblImgPreview.setVisible(true);
		lblImgPreview.setFont(new Font("Times New Roman", Font.ITALIC + Font.BOLD, 20));
		lblImgPreview.setText("SELECT A MOVIE");
		lblImgPreview.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgPreview.setVerticalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblImgPreview);
		
		lblImgPreview.setBorder(BorderFactory.createEtchedBorder());
		
		// Age Rating Label & The Value It Will Display Depending On The Movie Selected
		lblAgeRating.setFont(new Font ("Times New Roman", Font.BOLD, 10));
		lblAgeRating.setForeground(new Color(0, 102, 255));
		lblAgeRating.setText("Age Rating: ");
		getContentPane().add(lblAgeRating);
		lblAgeRating.setBounds(433,314,110,15);
		
		lblActualAgeRating.setFont(new Font ("Times New Roman", Font.BOLD, 12));
		getContentPane().add(lblActualAgeRating);
		lblActualAgeRating.setBounds(503,314,110,15);
		
		
		// Heading With A Separator Between Movie And Theatre Details
		lblTheatre_Time.setFont(new Font("Times New Roman",Font.BOLD,10));
		lblTheatre_Time.setForeground(new Color(0, 102, 255));
		lblTheatre_Time.setText("Theatre No & Time");
		getContentPane().add(lblTheatre_Time);
		lblTheatre_Time.setBounds(10,130,110,15);
		
		getContentPane().add(first_Seperator);
		first_Seperator.setBounds(120,140,210,10);
		
		// Setting Up Theatre Number Labels
		lblTheatreNo.setFont(new Font("Times New Roman",0,12));
		lblTheatreNo.setText("Theatre No:"); 
		getContentPane().add(lblTheatreNo);
		lblTheatreNo.setBounds(10,160,80,15);
		

		lblActualTheatreNo.setFont(new Font("Times New Roman", Font.ITALIC,12));
		lblActualTheatreNo.setForeground(new Color(0, 102, 255));
		getContentPane().add(lblActualTheatreNo);
		lblActualTheatreNo.setBounds(100,157,230,20);
		
		// Time of Show
		lblTimeOfShow.setFont(new Font("Times New Roman",0,12));
		lblTimeOfShow.setText("Time Of Show:");
		getContentPane().add(lblTimeOfShow);
		lblTimeOfShow.setBounds(10,185,90,15);
		
		lblActualTimeOfShow.setFont(new Font("Times New Roman",Font.ITALIC,12));
		lblActualTimeOfShow.setForeground(new Color(0, 102, 255));
		getContentPane().add(lblActualTimeOfShow);
		lblActualTimeOfShow.setBounds(110,182,100,20);
		
		// Number Of Seats Available
		lblNoSeats.setFont(new Font("Times New Roman",0,12));
		lblNoSeats.setText("No. Seats: ");
		getContentPane().add(lblNoSeats);
		lblNoSeats.setBounds(182,160,80,15);
		
		lblActualNoSeats.setFont(new Font("Times New Roman",Font.ITALIC,12));
		lblActualNoSeats.setForeground(new Color(0, 102, 255));
		getContentPane().add(lblActualNoSeats);
		lblActualNoSeats.setBounds(257,157,51,20);

		
		// Ticket Heading
		lblTicketHeading.setFont(new Font("Times New Roman", Font.BOLD,10));
		lblTicketHeading.setForeground(new Color(0, 102, 255));
		lblTicketHeading.setText("Ticket Pricing");
		getContentPane().add(lblTicketHeading);
		lblTicketHeading.setBounds(10,212,110,15);
		
		getContentPane().add(third_Separator);
		third_Separator.setBounds(90,222,240,10);
		
		// Adult Tickets
		lblAdultTicket.setFont(new Font("Times New Roman",0,12));
		lblAdultTicket.setText("Adult Ticket: ");
		getContentPane().add(lblAdultTicket);
		lblAdultTicket.setBounds(10,242,80,15);
		
		lblActualAdultTicket.setFont(new Font("Times New Roman",Font.ITALIC,12));
		lblActualAdultTicket.setForeground(new Color(0, 102, 255));
		getContentPane().add(lblActualAdultTicket);
		lblActualAdultTicket.setBounds(100,239,51,20);
		
		
		// Child Tickets
		lblChildTicket.setFont(new Font("Times New Roman",0,12));
		lblChildTicket.setText("Child Ticket: ");
		getContentPane().add(lblChildTicket);
		lblChildTicket.setBounds(10,272,80,15);
		
		lblActualChildTicket.setFont(new Font("Times New Roman",Font.ITALIC,12));
		lblActualChildTicket.setForeground(new Color(0, 102, 255));
		getContentPane().add(lblActualChildTicket);
		lblActualChildTicket.setBounds(100,269,51,20);
		
		// Quantity & Combobox's For Tickets
		
		lblAdultQty.setFont(new Font("Times New Roman",0,12));
		lblAdultQty.setText("Quantity: ");
		getContentPane().add(lblAdultQty);
		lblAdultQty.setBounds(200,242,80,15);
		
		lblChildQty.setFont(new Font("Times New Roman",0,12));
		lblChildQty.setText("Quantity: ");
		getContentPane().add(lblChildQty);
		lblChildQty.setBounds(200,270,80,15);
		
				
		

		cmbAdultTicket.setModel(new DefaultComboBoxModel<String>(new String[]{"0","1","2","3",
				"4","5","6","7","8"}));
		getContentPane().add(cmbAdultTicket);
		cmbAdultTicket.setBounds(268,240,40,20);
 	   cmbAdultTicket.setEnabled(false);
		
		
		cmbChildTicket.setModel(new DefaultComboBoxModel<String>(new String[]{"0","1","2","3",
				"4","5","6","7","8"}));
		getContentPane().add(cmbChildTicket);
		cmbChildTicket.setBounds(268,267,40,20);
 	    cmbChildTicket.setEnabled(false);
		
		
		
	}
	
	private void cmbMoviesActionPerformed(ActionEvent evt) {
			lblImgPreview.setText("");
			comboIndex1 = cmbMovies.getSelectedIndex();
	    	cmbAdultTicket.setEnabled(true);
	    	cmbChildTicket.setEnabled(true);

			if (comboIndex1 == 1){
	           lblImgPreview.setIcon(new ImageIcon(getClass().getResource("Doctor_Strange.jpg"))); 
	       } else if (comboIndex1 == 2){
	    	   lblImgPreview.setIcon(new ImageIcon(getClass().getResource("T2Trainspotting.jpg")));
	       } else if (comboIndex1 == 3){
	    	   lblImgPreview.setIcon(new ImageIcon(getClass().getResource("GuardiansOfGalaxy.jpg")));
	       } else if (comboIndex1 == 4){
	    	   lblImgPreview.setIcon(new ImageIcon(getClass().getResource("10_Cloverfield_Lane.jpg")));
	       } else if (comboIndex1 == 5){
	    	   lblImgPreview.setIcon(new ImageIcon(getClass().getResource("Moana.jpg")));
	       } else if (comboIndex1 == 6){
	    	   lblImgPreview.setIcon(new ImageIcon(getClass().getResource("rogueone.jpg")));
	       } else if (comboIndex1 == 7){
	    	   lblImgPreview.setIcon(new ImageIcon(getClass().getResource("kung-fu-panda-3.jpg")));
	       } else if (comboIndex1 == 8){
	    	   lblImgPreview.setIcon(new ImageIcon(getClass().getResource("Power-Rangers-Movie-2017.jpg")));
	       } else if (comboIndex1 == 9){
	    	   lblImgPreview.setIcon(new ImageIcon(getClass().getResource("Avengers.jpg")));
	       } else if (comboIndex1 == 10){
	    	   lblImgPreview.setIcon(new ImageIcon(getClass().getResource("BatmanVsSuperman.jpg")));
	       } else{
	    	   lblImgPreview.setIcon(new ImageIcon(getClass().getResource("")));
	    	   lblImgPreview.setText("SELECT A MOVIE");
	    	   cmbAdultTicket.setEnabled(false);
	    	   cmbChildTicket.setEnabled(false);
	    	   
	       }
	
	}
	
	private void lblMoviesTheatreActionPerformed(ActionEvent evt){
		
		if (comboIndex1 == 1){
			lblActualTheatreNo.setText("CW-01-01");
		}else if (comboIndex1 == 2){
			lblActualTheatreNo.setText("CW-01-02");
		}else if (comboIndex1 == 3){
			lblActualTheatreNo.setText("CW-01-03");
		}else if (comboIndex1 == 4){
			lblActualTheatreNo.setText("CW-01-04");
		}else if (comboIndex1 == 5){
			lblActualTheatreNo.setText("CW-01-05");
		}else if (comboIndex1 == 6){
			lblActualTheatreNo.setText("CW-02-01");
		}else if (comboIndex1 == 7){
			lblActualTheatreNo.setText("CW-02-02");	
		}else if (comboIndex1 == 8){
			lblActualTheatreNo.setText("CW-02-03");	
		}else if (comboIndex1 == 9){
			lblActualTheatreNo.setText("CW-02-04");	
		}else if (comboIndex1 == 10){
			lblActualTheatreNo.setText("CW-02-05");
		}else{
			lblActualTheatreNo.setText("");
		}
	}
	
	private void lblMoviesTimeActionPerformed(ActionEvent evt){
		if((String)cmbMovies.getSelectedItem() == ""){
			lblActualTimeOfShow.setText("");
		} else{
			lblActualTimeOfShow.setText("9:00 PM");
		}
	}
	
	private void lblMovieAgeRatingActionPerformed(ActionEvent evt){
		if (comboIndex1 == 1){
			lblActualAgeRating.setForeground(Color.ORANGE);
			lblActualAgeRating.setText("12A");
		}else if (comboIndex1 == 2){
			lblActualAgeRating.setForeground(Color.RED);
			lblActualAgeRating.setText("18");
		}else if (comboIndex1 == 3){
			lblActualAgeRating.setForeground(Color.GREEN);
			lblActualAgeRating.setText("PG");
		}else if (comboIndex1 == 4){
			lblActualAgeRating.setForeground(Color.RED);
			lblActualAgeRating.setText("15");
		}else if (comboIndex1 == 5){
			lblActualAgeRating.setForeground(Color.GREEN);
			lblActualAgeRating.setText("PG");
		}else if (comboIndex1 == 6){
			lblActualAgeRating.setForeground(Color.RED);
			lblActualAgeRating.setText("15");
		}else if (comboIndex1 == 7){
			lblActualAgeRating.setForeground(Color.GREEN);
			lblActualAgeRating.setText("PG");
		}else if (comboIndex1 == 8){
			lblActualAgeRating.setForeground(Color.ORANGE);
			lblActualAgeRating.setText("12A");
		}else if (comboIndex1 == 9){
			lblActualAgeRating.setForeground(Color.ORANGE);
			lblActualAgeRating.setText("12A");
		}else if (comboIndex1 == 10){
			lblActualAgeRating.setForeground(Color.ORANGE);
			lblActualAgeRating.setText("12A");
		}else{
				lblActualAgeRating.setText("");
		}

	}
	
	
	private void lblNoSeatsActionPerformed(ActionEvent evt){
		if (comboIndex1 == 1){
			lblActualNoSeats.setText(strRoomCapacity150);
		}else if (comboIndex1 == 2){
			lblActualNoSeats.setText(strRoomCapacity250);
		}else if (comboIndex1 == 3){
			lblActualNoSeats.setText(strRoomCapacity250);
		}else if (comboIndex1 == 4){
			lblActualNoSeats.setText(strRoomCapacity75);
		}else if (comboIndex1 == 5){
			lblActualNoSeats.setText(strRoomCapacity250);
		}else if (comboIndex1 == 6){
			lblActualNoSeats.setText(strRoomCapacity150);
		}else if (comboIndex1 == 7){
			lblActualNoSeats.setText(strRoomCapacity25);
		}else if (comboIndex1 == 8){
			lblActualNoSeats.setText(strRoomCapacity150);
		}else if (comboIndex1 == 9){
			lblActualNoSeats.setText(strRoomCapacity75);
		}else if (comboIndex1 == 10){
			lblActualNoSeats.setText(strRoomCapacity75);
		}else{
			lblActualNoSeats.setText("");
		}
	}
	
	
	private void lblTicketPriceActionPerformed(ActionEvent evt){
		if (comboIndex1 == 1){
			lblActualAdultTicket.setText(strTicketPriceSeven);
			lblActualChildTicket.setText(strTicketPriceFive);
		}else if (comboIndex1 == 2){
			lblActualAdultTicket.setText(strTicketPriceSeven);
			lblActualChildTicket.setText(strTicketPriceFive);
		}else if (comboIndex1 == 3){
			lblActualAdultTicket.setText(strTicketPriceFive);
			lblActualChildTicket.setText(strTicketPriceThree);
		}else if (comboIndex1 == 4){
			lblActualAdultTicket.setText(strTicketPriceFive);
			lblActualChildTicket.setText(strTicketPriceThree);
		}else if (comboIndex1 == 5){
			lblActualAdultTicket.setText(strTicketPriceSeven);
			lblActualChildTicket.setText(strTicketPriceFive);
		}else if (comboIndex1 == 6){
			lblActualAdultTicket.setText(strTicketPriceSeven);
			lblActualChildTicket.setText(strTicketPriceFive);
		}else if (comboIndex1 == 7){
			lblActualAdultTicket.setText(strTicketPriceFive);
			lblActualChildTicket.setText(strTicketPriceThree);
		}else if (comboIndex1 == 8){
			lblActualAdultTicket.setText(strTicketPriceSeven);
			lblActualChildTicket.setText(strTicketPriceFive);
		}else if (comboIndex1 == 9){
			lblActualAdultTicket.setText(strTicketPriceFive);
			lblActualChildTicket.setText(strTicketPriceThree);
		}else if (comboIndex1 == 10){
			lblActualAdultTicket.setText(strTicketPriceFive);
			lblActualChildTicket.setText(strTicketPriceThree);
		}else{
			lblActualAdultTicket.setText("");
			lblActualChildTicket.setText("");
		
		}
	}
	

}


