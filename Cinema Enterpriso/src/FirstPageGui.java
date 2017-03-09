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
	public int comboIndex1;
	private int adultQtyIndex;
	private int childQtyIndex;
	private double totalToPay;
	private double subTotalTickets;
	private double subTotalFood;
	

	private String strTotal;
	private String paymentMethod;

	
	
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
	private JLabel lblTicketSubTtl;
	private JLabel lblActualTicketSubTtl;
	private JLabel lblSnacks_Drinks;
	private JLabel lblSnacksQty;
	private JLabel lblDrinksQty;
	private JLabel lblSDSubTotal;
	private JLabel lblActualSDSubTotal;
	private JLabel lblTotalPrice;
	private JLabel lblActualTotalPrice;
	private JLabel lblCashOrCard;

	
	// Declaring JComboBox's 
	JComboBox<String> cmbMovies;
	private JComboBox<String> cmbAdultTicket;
	private JComboBox<String> cmbChildTicket;
	private JComboBox<String> cmbSnacks;
	private JComboBox<String> cmbSnacksQty;
	private JComboBox<String> cmbDrinks;
	private JComboBox<String> cmbDrinksQty;
 	
	// Declaring JSeparator's
	private JSeparator first_Separator;
	private JSeparator second_Separator;
	private JSeparator third_Separator;
	private JSeparator fourth_Separator;
	
	// Declaring Radio Button's
	private JRadioButton radioBtnCard;
	private JRadioButton radioBtnCash;
	
	// Declaring Button's
	private JButton btnOrderTickets;
	
	FilmFileReader movieFile = new FilmFileReader();
	SnackFileReader snacksFile = new SnackFileReader();
	DrinkFileReader drinksFile = new DrinkFileReader();


	
	public FirstPageGui(){
		super("Cinema Enterpriso");
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(null);
		createGui();
		
	}
	public void createGui(){
		movieFile.openFile();
		movieFile.readFile();
		
		snacksFile.openFile();
		snacksFile.readFile();
		
		drinksFile.openFile();
		drinksFile.readFile();
		
		
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
		lblTicketSubTtl = new JLabel();
		lblActualTicketSubTtl = new JLabel();
		lblSnacks_Drinks = new JLabel();
		lblSnacksQty = new JLabel();
		lblDrinksQty = new JLabel();
		lblSDSubTotal = new JLabel();
		lblActualSDSubTotal = new JLabel();
		lblTotalPrice = new JLabel();
		lblActualTotalPrice = new JLabel();
		lblCashOrCard = new JLabel();
		
		
		

		// ComboBox Init's
		cmbMovies = new JComboBox<String>();
		cmbAdultTicket = new JComboBox<String>();
		cmbChildTicket = new JComboBox<String>();
		cmbSnacks = new JComboBox<String>();
		cmbSnacksQty = new JComboBox<String>();
		cmbDrinks = new JComboBox<String>();
		cmbDrinksQty = new JComboBox<String>();
		
		// Separator Init's
		first_Separator = new JSeparator();
		second_Separator = new JSeparator();
		third_Separator = new JSeparator();
		fourth_Separator = new JSeparator(SwingConstants.VERTICAL);
		
		// Radio Button Init's
		radioBtnCash = new JRadioButton();
		radioBtnCash.setBackground(Color.LIGHT_GRAY);
		radioBtnCard = new JRadioButton();
		radioBtnCard.setBackground(Color.LIGHT_GRAY);
		ButtonGroup group = new ButtonGroup();
		group.add(radioBtnCard);
		group.add(radioBtnCash);
		
		// Button Init's
		btnOrderTickets = new JButton();
		
		// Title Of The Program
		lblCinemaTitle.setFont(new Font("Times New Roman",Font.BOLD,18));
		lblCinemaTitle.setForeground(new Color(0,68,90));
		lblCinemaTitle.setText("HUDDERSFIELD CINEMAX");
		getContentPane().add(lblCinemaTitle);
		lblCinemaTitle.setBounds(170,15,309,30);
		
		// Movie Selection
		lblMovieSelection.setFont(new Font("Times New Roman",0,12));
		lblMovieSelection.setText("Select Movie:");
		getContentPane().add(lblMovieSelection);
		lblMovieSelection.setBounds(18,72,80,15);
		
		
		 //Combo Box For Movie Selection
		cmbMovies.setModel(new DefaultComboBoxModel<String>(movieFile.displayAllFilms()));
		
		getContentPane().add(cmbMovies);
		cmbMovies.setBounds(108,67,230,25);

		
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
		lblTheatre_Time.setBounds(18,99,110,15);
		
		getContentPane().add(first_Separator);
		first_Separator.setBounds(128,109,210,10);
		
		// Setting Up Theater Number Labels
		lblTheatreNo.setFont(new Font("Times New Roman",0,12));
		lblTheatreNo.setText("Theatre No:"); 
		getContentPane().add(lblTheatreNo);
		lblTheatreNo.setBounds(18,120,80,15);
		
 	    lblActualTheatreNo.setFont(new Font("Times New Roman", Font.ITALIC,12));
 	    lblActualTheatreNo.setForeground(new Color(0, 102, 255));
 	    getContentPane().add(lblActualTheatreNo);
 	    lblActualTheatreNo.setBounds(108,118,230,20);
		
		// Time of Show
		lblTimeOfShow.setFont(new Font("Times New Roman",0,12));
		lblTimeOfShow.setText("Time Of Show:");
		getContentPane().add(lblTimeOfShow);
		lblTimeOfShow.setBounds(18,150,90,15);
		
		lblActualTimeOfShow.setFont(new Font("Times New Roman",Font.ITALIC,12));
		lblActualTimeOfShow.setForeground(new Color(0, 102, 255));
		getContentPane().add(lblActualTimeOfShow);
		lblActualTimeOfShow.setBounds(118,147,100,20);
		
		// Number Of Seats Available
		lblNoSeats.setFont(new Font("Times New Roman",0,12));
		lblNoSeats.setText("No. Seats: ");
		getContentPane().add(lblNoSeats);
		lblNoSeats.setBounds(190,120,80,15);
		
		lblActualNoSeats.setFont(new Font("Times New Roman",Font.ITALIC,12));
		lblActualNoSeats.setForeground(new Color(0, 102, 255));
		getContentPane().add(lblActualNoSeats);
		lblActualNoSeats.setBounds(257,118,51,20);

		
		// Ticket Heading
		lblTicketHeading.setFont(new Font("Times New Roman", Font.BOLD,10));
		lblTicketHeading.setForeground(new Color(0, 102, 255));
		lblTicketHeading.setText("Ticket Pricing");
		getContentPane().add(lblTicketHeading);
		lblTicketHeading.setBounds(18,177,110,15);
		
		getContentPane().add(second_Separator);
		second_Separator.setBounds(98,187,240,10);
		
		// Adult Tickets
		lblAdultTicket.setFont(new Font("Times New Roman",0,12));
		lblAdultTicket.setText("Adult Ticket: ");
		getContentPane().add(lblAdultTicket);
		lblAdultTicket.setBounds(18,207,80,15);
		
		lblActualAdultTicket.setFont(new Font("Times New Roman",Font.ITALIC,12));
		lblActualAdultTicket.setForeground(new Color(0, 102, 255));
		getContentPane().add(lblActualAdultTicket);
		lblActualAdultTicket.setBounds(108,204,51,20);
		
		
		// Child Tickets
		lblChildTicket.setFont(new Font("Times New Roman",0,12));
		lblChildTicket.setText("Child Ticket: ");
		getContentPane().add(lblChildTicket);
		lblChildTicket.setBounds(18,244,80,15);
		
		lblActualChildTicket.setFont(new Font("Times New Roman",Font.ITALIC,12));
		lblActualChildTicket.setForeground(new Color(0, 102, 255));
		getContentPane().add(lblActualChildTicket);
		lblActualChildTicket.setBounds(108,241,51,20);
		
		// Quantity & Combobox's For Tickets
		lblAdultQty.setFont(new Font("Times New Roman",0,12));
		lblAdultQty.setText("Quantity: ");
		getContentPane().add(lblAdultQty);
		lblAdultQty.setBounds(208,207,80,15);
		
		lblChildQty.setFont(new Font("Times New Roman",0,12));
		lblChildQty.setText("Quantity: ");
		getContentPane().add(lblChildQty);
		lblChildQty.setBounds(208,242,80,15);
		
				
		

		cmbAdultTicket.setModel(new DefaultComboBoxModel<String>(new String[]{"0","1","2","3",
				"4","5","6","7","8"}));
		getContentPane().add(cmbAdultTicket);
		cmbAdultTicket.setBounds(276,205,40,20);
		cmbAdultTicket.setEnabled(false);
		
		
		cmbChildTicket.setModel(new DefaultComboBoxModel<String>(new String[]{"0","1","2","3",
				"4","5","6","7","8"}));
		getContentPane().add(cmbChildTicket);
		cmbChildTicket.setBounds(276,239,40,20);
 	    cmbChildTicket.setEnabled(false);
 	    
 	    
 	    
 	    lblTicketSubTtl.setFont(new Font("Times New Roman",0,12));
 	    lblTicketSubTtl.setText("Sub Total:");
 	    lblTicketSubTtl.setBounds(105,272,90,15);
 	    getContentPane().add(lblTicketSubTtl);
 	    
 	    lblActualTicketSubTtl.setFont(new Font("Times New Roman",Font.ITALIC,12));
 	    lblActualTicketSubTtl.setForeground(new Color(0, 102, 255));
 	    lblActualTicketSubTtl.setText("£0.00");
 	    lblActualTicketSubTtl.setBounds(170,272,90,15);
 	    getContentPane().add(lblActualTicketSubTtl);

 	    lblSnacks_Drinks.setFont(new Font("Times New Roman",Font.BOLD,10));
		lblSnacks_Drinks.setForeground(new Color(0, 102, 255));
 	    lblSnacks_Drinks.setText("Snacks & Drinks");
 	    lblSnacks_Drinks.setBounds(18,300,123,15);
 	    getContentPane().add(lblSnacks_Drinks);

		getContentPane().add(third_Separator);
		third_Separator.setBounds(115,309,223,10);
 	    
		getContentPane().add(fourth_Separator);
		fourth_Separator.setBounds(350,322,13,176);
		

		cmbAdultTicket.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	lblSubTotalTicketActionPerformed(evt);
            	cmbTicketQtyActionPerformed(evt);
            }
		});

		cmbChildTicket.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	lblSubTotalTicketActionPerformed(evt);
            	cmbTicketQtyActionPerformed(evt);
            }
		});
		
		
		 //Combo Box For Snacks Selection
		cmbSnacks.setModel(new DefaultComboBoxModel<String>(snacksFile.displayAllSnacks()));
		getContentPane().add(cmbSnacks);
		cmbSnacks.setBounds(18,335,177,25);
		cmbSnacks.setEnabled(false);
		
		lblSnacksQty.setFont(new Font("Times New Roman",0,12));
		lblSnacksQty.setText("Quantity: ");
		getContentPane().add(lblSnacksQty);
		lblSnacksQty.setBounds(208,338,80,15);
		
		cmbSnacksQty.setModel(new DefaultComboBoxModel<String>(new String[]{"0","1","2","3",
				"4","5","6","7","8"}));
		getContentPane().add(cmbSnacksQty);
		cmbSnacksQty.setBounds(276,336,40,20);
		cmbSnacksQty.setEnabled(false);
		
		 //Combo Box For Drinks Selection
		cmbDrinks.setModel(new DefaultComboBoxModel<String>(drinksFile.displayAllDrinks()));
		getContentPane().add(cmbDrinks);
		cmbDrinks.setBounds(18,390,177,25);
		cmbDrinks.setEnabled(false);
		
		lblDrinksQty.setFont(new Font("Times New Roman",0,12));
		lblDrinksQty.setText("Quantity: ");
		getContentPane().add(lblDrinksQty);
		lblDrinksQty.setBounds(208,393,80,15);
		
		cmbDrinksQty.setModel(new DefaultComboBoxModel<String>(new String[]{"0","1","2","3",
				"4","5","6","7","8"}));
		getContentPane().add(cmbDrinksQty);
		cmbDrinksQty.setBounds(276,391,40,20);
		cmbDrinksQty.setEnabled(false);
		
		
 	    lblSDSubTotal.setFont(new Font("Times New Roman",0,12));
 	    lblSDSubTotal.setText("Sub Total:");
 	    lblSDSubTotal.setBounds(105,425,90,15);
 	    getContentPane().add(lblSDSubTotal);
 	    
 	    lblActualSDSubTotal.setFont(new Font("Times New Roman",Font.ITALIC,12));
 	    lblActualSDSubTotal.setForeground(new Color(0, 102, 255));
 	    lblActualSDSubTotal.setText("£0.00");
 	    lblActualSDSubTotal.setBounds(172,425,90,15);
 	    getContentPane().add(lblActualSDSubTotal);
		
		
		cmbSnacks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	cmbSnacksActionPerformed(evt);
            }
		});
		
		cmbDrinks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	cmbDrinksActionPerformed(evt);
            }
		});
		
		cmbSnacksQty.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	lblSnackDrinkSubTotalActionPerformed(evt);
            }
		});
		
		cmbDrinksQty.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	lblSnackDrinkSubTotalActionPerformed(evt);
            }
		});
		
 	    lblTotalPrice.setFont(new Font("Times New Roman",0,12));
 	    lblTotalPrice.setText("Total To Pay:");
 	    lblTotalPrice.setBounds(363,340,90,15);
 	    getContentPane().add(lblTotalPrice);
 	    
 	    lblActualTotalPrice.setFont(new Font("Times New Roman",Font.ITALIC,12));
 	    lblActualTotalPrice.setForeground(new Color(0, 102, 255));
 	    lblActualTotalPrice.setText("£0.00");
 	    lblActualTotalPrice.setBounds(450,340,90,15);
 	    getContentPane().add(lblActualTotalPrice);
 	    
 	    lblCashOrCard.setFont(new Font("Times New Roman",0,11));
 	    lblCashOrCard.setText("Would You Like To Pay By Cash Or Card:");
 	    lblCashOrCard.setBounds(360,367,240,25);
 	    getContentPane().add(lblCashOrCard);
		
 	    
 	    radioBtnCash.setText("Cash");
 	    radioBtnCash.setBounds(370,395,73,20);
 	    getContentPane().add(radioBtnCash);
 	    radioBtnCash.setEnabled(false);
 	    
 	    radioBtnCard.setText("Card");
 	    radioBtnCard.setBounds(494,395,73,20);
 	    getContentPane().add(radioBtnCard);
 	    radioBtnCard.setEnabled(false);
 	    
 	   radioBtnCard.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent evt) {
           		cardRdioBtnActionPerformed(evt);
           }
		});
 	    
	   radioBtnCash.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent evt) {
        	   cashRdioBtnActionPerformed(evt);
           }
		});
	   
		
		btnOrderTickets.setText("Place Order");
		getContentPane().add(btnOrderTickets);
		btnOrderTickets.setBounds(416,438,113,20);
	   
		
		btnOrderTickets.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				btnOrderActionPerformed(evt);
			}
		});
	   
	   
 		movieFile.closeFile();
 		snacksFile.closeFile();
 		drinksFile.closeFile();
 		

 		

 	    
	}
	
	public String getSelectedItem() {
		return (String)cmbMovies.getSelectedItem();
	}
	
	
	private void cmbMoviesActionPerformed(ActionEvent evt) {


			lblImgPreview.setText("");
			comboIndex1 = cmbMovies.getSelectedIndex();
	    	cmbAdultTicket.setEnabled(true);
	    	cmbChildTicket.setEnabled(true);
	    	
	    	cmbSnacks.setEnabled(true);
	    	cmbSnacksQty.setEnabled(true);
	    	
	    	cmbDrinks.setEnabled(true);
	    	cmbDrinksQty.setEnabled(true);

			
	    	for (int i=0; i < comboIndex1; i++){
	    		lblImgPreview.setIcon(new ImageIcon(getClass().getResource(movieFile.displayFilmImage(comboIndex1)))); 
	    	}
    	
	    	if (comboIndex1 == 0){
	            lblImgPreview.setIcon(new ImageIcon(getClass().getResource("")));
	     	   lblImgPreview.setText("SELECT A MOVIE");
	     	   cmbAdultTicket.setEnabled(false);
	     	   cmbChildTicket.setEnabled(false);
	     	   cmbAdultTicket.setSelectedIndex(comboIndex1);
	     	   cmbChildTicket.setSelectedIndex(comboIndex1);
	     	   
	     	   cmbSnacks.setEnabled(false);
	     	   cmbSnacks.setSelectedIndex(comboIndex1);
	     	   cmbSnacksQty.setEnabled(false);
	     	   cmbSnacksQty.setSelectedIndex(comboIndex1);
	     	   
	     	   cmbDrinks.setEnabled(false);
	     	   cmbDrinks.setSelectedIndex(comboIndex1);
	     	   cmbDrinksQty.setEnabled(false);
	     	   cmbDrinksQty.setSelectedIndex(comboIndex1);
	     	   
	     	}else{
		     	   cmbAdultTicket.setSelectedIndex(0);
		     	   cmbChildTicket.setSelectedIndex(0);
		     	   
		     	   cmbSnacks.setSelectedIndex(0);
		     	   cmbSnacksQty.setSelectedIndex(0);
		     	   
		     	   cmbDrinks.setSelectedIndex(0);
		     	   cmbDrinksQty.setSelectedIndex(0);
			}
	  
	    	returnMovieName();
	}
	

	
	private void lblMoviesTheatreActionPerformed(ActionEvent evt){
		lblActualTheatreNo.setText(movieFile.displayTheatreRoom(comboIndex1));
		
		if (comboIndex1 == 0){
			lblActualTheatreNo.setText("");
		}
		
	}
	
	private void lblMoviesTimeActionPerformed(ActionEvent evt){
		if(comboIndex1 == 0){
			lblActualTimeOfShow.setText("");
		} else{
			lblActualTimeOfShow.setText("9:00 PM");
		}
	}
	
	
	private void lblMovieAgeRatingActionPerformed(ActionEvent evt){
		String colorFromFile = movieFile.displayFilmRatingColour(comboIndex1);
		Color ratingColor = Color.getColor(colorFromFile);
		lblActualAgeRating.setForeground(ratingColor);
		lblActualAgeRating.setText(movieFile.displayFilmRating(comboIndex1));
		
    	if (movieFile.displayFilmRating(2) == "18"){
	     	   cmbChildTicket.setEnabled(false);
    	}
	}
		
	
	
	private void lblNoSeatsActionPerformed(ActionEvent evt){
		String Seats = Integer.toString(movieFile.displayNumberOfSetas(comboIndex1));
		lblActualNoSeats.setText(Seats);
		
		if (comboIndex1 == 0){
			lblActualNoSeats.setText("");
		}
	}
	
	
	private void lblTicketPriceActionPerformed(ActionEvent evt){
		
		String adultPrices = Double.toString(movieFile.displayAdultTicket(comboIndex1));
		String childPrices = Double.toString(movieFile.displayChildTicket(comboIndex1));
		
		lblActualAdultTicket.setText("£" + adultPrices + "0");
		lblActualChildTicket.setText("£" + childPrices + "0");
		
		if (comboIndex1 == 0){
			lblActualAdultTicket.setText("£0.00");
			lblActualChildTicket.setText("£0.00");
		}
	}
	
	private void lblSubTotalTicketActionPerformed(ActionEvent evt){
		//TotalCalculations totalCalc = new TotalCalculations();
		double adultQtyIndex = cmbAdultTicket.getSelectedIndex();
		double childQtyIndex = cmbChildTicket.getSelectedIndex();
		
		double aFilmPrice = movieFile.displayAdultTicket(comboIndex1);
		double adultSubTtl = (aFilmPrice * adultQtyIndex);
		
		double cFilmPrice = movieFile.displayChildTicket(comboIndex1);
		double childSubTtl = (cFilmPrice * childQtyIndex);
		
		subTotalTickets = adultSubTtl + childSubTtl;
		
		String ticketSubTotal = Double.toString(subTotalTickets);

	    lblActualTicketSubTtl.setText("£" +ticketSubTotal+"0");
	    
	    totalToPay = subTotalTickets + subTotalFood;
	    strTotal = Double.toString(totalToPay);
	    lblActualTotalPrice.setText("£"+strTotal+"0"); 
	    	    
	}
	
	
	private void cmbTicketQtyActionPerformed(ActionEvent evt){
		adultQtyIndex = cmbAdultTicket.getSelectedIndex();
		childQtyIndex = cmbChildTicket.getSelectedIndex();
		
		if (adultQtyIndex == 0 && childQtyIndex==0){
			cmbSnacks.setEnabled(false);
			cmbDrinks.setEnabled(false);
	    	radioBtnCard.setEnabled(false);
	    	radioBtnCash.setEnabled(false);
		}else{
			cmbSnacks.setEnabled(true);
			cmbDrinks.setEnabled(true);
	    	radioBtnCard.setEnabled(true);
	    	radioBtnCash.setEnabled(true);
		}
		
	}
	
	private void cmbSnacksActionPerformed(ActionEvent evt){
		int snackIndex = cmbSnacks.getSelectedIndex();
		if (snackIndex == 0){
			cmbSnacksQty.setEnabled(false);
			cmbSnacksQty.setSelectedIndex(0);
		}else{
			cmbSnacksQty.setEnabled(true);
			cmbSnacksQty.setSelectedIndex(1);
		}
	}
	
	private void cmbDrinksActionPerformed(ActionEvent evt){

		int drinkIndex = cmbDrinks.getSelectedIndex();

		if (drinkIndex == 0){
			cmbDrinksQty.setEnabled(false);
			cmbDrinksQty.setSelectedIndex(0);
		}else{
			cmbDrinksQty.setEnabled(true);
			cmbDrinksQty.setSelectedIndex(1);
		}
		
	}
	
	
	private void lblSnackDrinkSubTotalActionPerformed(ActionEvent evt){

		int snackIndex = cmbSnacks.getSelectedIndex();
		int snackQtyIndex = cmbSnacksQty.getSelectedIndex();
		int drinkIndex = cmbDrinks.getSelectedIndex();
		int drinkQtyIndex = cmbDrinksQty.getSelectedIndex();
		
		double snackPrice = snacksFile.displaySnackPrice(snackIndex);
		double snackSubTtl = (snackPrice * snackQtyIndex);
		
		double drinkPrice = drinksFile.displayDrinkPrice(drinkIndex);
		double drinkSubTtl = (drinkPrice * drinkQtyIndex);
		
		subTotalFood = drinkSubTtl + snackSubTtl;
		
		String foodSubTotal = Double.toString(subTotalFood);
		
		lblActualSDSubTotal.setText("£"+foodSubTotal+"0");
		
	    totalToPay = subTotalTickets + subTotalFood;
	    strTotal = Double.toString(totalToPay);
	    lblActualTotalPrice.setText("£"+strTotal+"0");
		
	}

	
	private void cardRdioBtnActionPerformed(ActionEvent evt){
		if (radioBtnCard.isSelected()){
			paymentMethod = "Card";
		}
	}
	
	private void cashRdioBtnActionPerformed(ActionEvent evt){
		if(radioBtnCash.isSelected()){
			paymentMethod = "Cash";
		}
	}
	
	public void btnOrderActionPerformed(ActionEvent evt){
		new ReceiptDialog();
	

		
	}
	
	public int returnMovieName(){
		int Sel = cmbMovies.getSelectedIndex();

		return Sel;
	}
	

	
}	




