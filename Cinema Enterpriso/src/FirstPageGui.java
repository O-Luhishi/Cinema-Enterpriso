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
	private double totalToPay;
	private double subTotalTickets;
	private double subTotalFood;

	
	String ticketSubTotal;

	private String strTotal;
	private String paymentMethod;

	public int adultQtyIndex;
	public int childQtyIndex;
	
	public int snackIndex;
	public int snackQtyIndex;
	
	public int drinkIndex;
	public int drinkQtyIndex;
	
	
	// Declaring JLabel For Main UI
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

	// Declaring JLabel for JPanel 2 - Aka Receipt
	private JLabel lblReceiptTitle;
	private JLabel lblMovieOrdered;
	private JLabel lblActualMovieOrdered;
	private JLabel lblMovieImage;
	private JLabel lblMovieTime;
	private JLabel lblActualMovieTime;
	private JLabel lblMovieTheatre;
	private JLabel lblActualMovieTheatre;
	private JLabel lblActualMovieRating;
	private JLabel lblAdultPrice;
	private JLabel lblActualAdultPrice;
	private JLabel lblChildPrice;
	private JLabel lblActualChildPrice;
	private JLabel lblATicketQty;
	private JLabel lblCTicketQty;
	private JLabel lblSnackName;
	private JLabel lblSnackQty;
	private JLabel lblDrinkName;
	private JLabel lblDrinkQty;
	private JLabel lblMthdOfPayment;
	private JLabel lblActualMtdPayment;
	private JLabel lblTotalPaid;
	private JLabel lblActualTotalPaid;
	
	
	
	
	// Declaring JComboBox's 
	private JComboBox<String> cmbMovies;
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
	private JButton btnReturnMain;
	
	FilmFileReader movieFile = new FilmFileReader();
	SnackFileReader snacksFile = new SnackFileReader();
	DrinkFileReader drinksFile = new DrinkFileReader();
	
	private JPanel firstPanel;
	private JPanel secondPanel;


	
	public FirstPageGui(){
		super("Cinema Enterpriso");
		setVisible(true);
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
		ButtonGroup group = new ButtonGroup();
		
		secondPanel = new JPanel();
		secondPanel.setVisible(false);
				
		secondPanel.setSize(610, 504);
		secondPanel.setBackground(Color.DARK_GRAY);
		getContentPane().add(secondPanel);
		secondPanel.setLayout(null);
		
		firstPanel = new JPanel();

		
				
		firstPanel.setSize(610,504);
		getContentPane().add(firstPanel);
		firstPanel.setBackground(Color.LIGHT_GRAY);
		firstPanel.setLayout(null);
				
				
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


		lblReceiptTitle = new JLabel();
		lblMovieOrdered = new JLabel();
		lblActualMovieOrdered = new JLabel();
		lblMovieTime = new JLabel();
		lblActualMovieTime = new JLabel();
		lblMovieImage = new JLabel();
		lblMovieTheatre = new JLabel();
		lblActualMovieTheatre = new JLabel();
		lblActualMovieRating = new JLabel();
		lblAdultPrice = new JLabel();
		lblActualAdultPrice = new JLabel();
		lblChildPrice = new JLabel();
		lblActualChildPrice = new JLabel();
		lblATicketQty = new JLabel();
		lblCTicketQty = new JLabel();
		lblSnackName = new JLabel();
		lblSnackQty = new JLabel();
		lblDrinkName = new JLabel();
		lblDrinkQty = new JLabel();
		lblMthdOfPayment = new JLabel();
		lblActualMtdPayment = new JLabel();
		lblTotalPaid = new JLabel();
		lblActualTotalPaid = new JLabel();


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
		group.add(radioBtnCard);
		group.add(radioBtnCash);

		// Button Init's
		btnOrderTickets = new JButton();
		btnReturnMain = new JButton();

		// Title Of The Program
		lblCinemaTitle.setFont(new Font("Times New Roman",Font.BOLD,18));
		lblCinemaTitle.setForeground(new Color(0,68,90));
		lblCinemaTitle.setText("HUDDERSFIELD CINEMAX");
		firstPanel.add(lblCinemaTitle);
		lblCinemaTitle.setBounds(170,15,309,30);

		// Movie Selection
		lblMovieSelection.setFont(new Font("Times New Roman",0,12));
		lblMovieSelection.setText("Select Movie:");
		firstPanel.add(lblMovieSelection);
		lblMovieSelection.setBounds(18,72,80,15);


		//Combo Box For Movie Selection
		cmbMovies.setModel(new DefaultComboBoxModel<String>(movieFile.displayAllFilms()));

		firstPanel.add(cmbMovies);
		cmbMovies.setBounds(108,67,230,25);


		// Listening For Any Events Coming From The Movie Combo Box
		cmbMovies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				comboIndex1 = cmbMovies.getSelectedIndex();
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
		firstPanel.add(lblImgPreview);
		
		lblImgPreview.setBorder(BorderFactory.createEtchedBorder());
		
		// Age Rating Label & The Value It Will Display Depending On The Movie Selected
		lblAgeRating.setFont(new Font ("Times New Roman", Font.BOLD, 10));
		lblAgeRating.setForeground(new Color(0, 102, 255));
		lblAgeRating.setText("Age Rating: ");
		firstPanel.add(lblAgeRating);
		lblAgeRating.setBounds(433,314,110,15);
		
		lblActualAgeRating.setFont(new Font ("Times New Roman", Font.BOLD, 12));
		firstPanel.add(lblActualAgeRating);
		lblActualAgeRating.setBounds(503,314,110,15);
		
		
		// Heading With A Separator Between Movie And Theatre Details
		lblTheatre_Time.setFont(new Font("Times New Roman",Font.BOLD,10));
		lblTheatre_Time.setForeground(new Color(0, 102, 255));
		lblTheatre_Time.setText("Theatre No & Time");
		firstPanel.add(lblTheatre_Time);
		lblTheatre_Time.setBounds(18,99,110,15);
		
		firstPanel.add(first_Separator);
		first_Separator.setBounds(128,109,210,10);
		
		// Setting Up Theater Number Labels
		lblTheatreNo.setFont(new Font("Times New Roman",0,12));
		lblTheatreNo.setText("Theatre No:"); 
		firstPanel.add(lblTheatreNo);
		lblTheatreNo.setBounds(18,120,80,15);
		
 	    lblActualTheatreNo.setFont(new Font("Times New Roman", Font.ITALIC,12));
 	    lblActualTheatreNo.setForeground(new Color(0, 102, 255));
 	    firstPanel.add(lblActualTheatreNo);
 	    lblActualTheatreNo.setBounds(108,118,230,20);
 	    
 	    // Time of Show
 	    lblTimeOfShow.setFont(new Font("Times New Roman",0,12));
 	    lblTimeOfShow.setText("Time Of Show:");
 	    firstPanel.add(lblTimeOfShow);
 	    lblTimeOfShow.setBounds(18,150,90,15);
 	    
 	    lblActualTimeOfShow.setFont(new Font("Times New Roman",Font.ITALIC,12));
 	    lblActualTimeOfShow.setForeground(new Color(0, 102, 255));
 	    firstPanel.add(lblActualTimeOfShow);
 	    lblActualTimeOfShow.setBounds(118,147,100,20);
 	    
 	    // Number Of Seats Available
 	    lblNoSeats.setFont(new Font("Times New Roman",0,12));
 	    lblNoSeats.setText("No. Seats: ");
 	    firstPanel.add(lblNoSeats);
 	    lblNoSeats.setBounds(190,120,80,15);
 	    
 	    lblActualNoSeats.setFont(new Font("Times New Roman",Font.ITALIC,12));
 	    lblActualNoSeats.setForeground(new Color(0, 102, 255));
 	    firstPanel.add(lblActualNoSeats);
 	    lblActualNoSeats.setBounds(257,118,51,20);
 	    
 	    		
 	    // Ticket Heading
 	    lblTicketHeading.setFont(new Font("Times New Roman", Font.BOLD,10));
 	    lblTicketHeading.setForeground(new Color(0, 102, 255));
 	    lblTicketHeading.setText("Ticket Pricing");
 	    firstPanel.add(lblTicketHeading);
 	    lblTicketHeading.setBounds(18,177,110,15);

 	    firstPanel.add(second_Separator);
 	    second_Separator.setBounds(98,187,240,10);

 	    // Adult Tickets
 	    lblAdultTicket.setFont(new Font("Times New Roman",0,12));
 	    lblAdultTicket.setText("Adult Ticket: ");
 	    firstPanel.add(lblAdultTicket);
 	    lblAdultTicket.setBounds(18,207,80,15);

 	    lblActualAdultTicket.setFont(new Font("Times New Roman",Font.ITALIC,12));
 	    lblActualAdultTicket.setForeground(new Color(0, 102, 255));
 	    firstPanel.add(lblActualAdultTicket);
 	    lblActualAdultTicket.setBounds(108,204,51,20);


 	    // Child Tickets
 	    lblChildTicket.setFont(new Font("Times New Roman",0,12));
 	    lblChildTicket.setText("Child Ticket: ");
 	    firstPanel.add(lblChildTicket);
 	    lblChildTicket.setBounds(18,244,80,15);

 	    lblActualChildTicket.setFont(new Font("Times New Roman",Font.ITALIC,12));
 	    lblActualChildTicket.setForeground(new Color(0, 102, 255));
 	    firstPanel.add(lblActualChildTicket);
 	    lblActualChildTicket.setBounds(108,241,51,20);

 	    // Quantity & Combobox's For Tickets
 	    lblAdultQty.setFont(new Font("Times New Roman",0,12));
 	    lblAdultQty.setText("Quantity: ");
 	    firstPanel.add(lblAdultQty);
 	    lblAdultQty.setBounds(208,207,80,15);

 	    lblChildQty.setFont(new Font("Times New Roman",0,12));
 	    lblChildQty.setText("Quantity: ");
 	    firstPanel.add(lblChildQty);
 	    lblChildQty.setBounds(208,242,80,15);
 	    		
 	    				


 	    cmbAdultTicket.setModel(new DefaultComboBoxModel<String>(new String[]{"0","1","2","3",
 	    		"4","5","6","7","8"}));
 	    firstPanel.add(cmbAdultTicket);
 	    cmbAdultTicket.setBounds(276,205,40,20);
 	    cmbAdultTicket.setEnabled(false);


 	    cmbChildTicket.setModel(new DefaultComboBoxModel<String>(new String[]{"0","1","2","3",
 	    		"4","5","6","7","8"}));
 	    firstPanel.add(cmbChildTicket);
 	    cmbChildTicket.setBounds(276,239,40,20);
 	    cmbChildTicket.setEnabled(false);



 	    lblTicketSubTtl.setFont(new Font("Times New Roman",0,12));
 	    lblTicketSubTtl.setText("Sub Total:");
 	    lblTicketSubTtl.setBounds(105,272,90,15);
 	    firstPanel.add(lblTicketSubTtl);

 	    lblActualTicketSubTtl.setFont(new Font("Times New Roman",Font.ITALIC,12));
 	    lblActualTicketSubTtl.setForeground(new Color(0, 102, 255));
 	    lblActualTicketSubTtl.setText("£0.00");
 	    lblActualTicketSubTtl.setBounds(170,272,90,15);
 	    firstPanel.add(lblActualTicketSubTtl);

 	    lblSnacks_Drinks.setFont(new Font("Times New Roman",Font.BOLD,10));
 	    lblSnacks_Drinks.setForeground(new Color(0, 102, 255));
 	    lblSnacks_Drinks.setText("Snacks & Drinks");
 	    lblSnacks_Drinks.setBounds(18,300,123,15);
 	    firstPanel.add(lblSnacks_Drinks);

 	    firstPanel.add(third_Separator);
 	    third_Separator.setBounds(115,309,223,10);
 	    		 	    		
		firstPanel.add(fourth_Separator);
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
		firstPanel.add(cmbSnacks);
		cmbSnacks.setBounds(18,335,177,25);
		cmbSnacks.setEnabled(false);

		lblSnacksQty.setFont(new Font("Times New Roman",0,12));
		lblSnacksQty.setText("Quantity: ");
		firstPanel.add(lblSnacksQty);
		lblSnacksQty.setBounds(208,338,80,15);

		cmbSnacksQty.setModel(new DefaultComboBoxModel<String>(new String[]{"0","1","2","3",
				"4","5","6","7","8"}));
		firstPanel.add(cmbSnacksQty);
		cmbSnacksQty.setBounds(276,336,40,20);
		cmbSnacksQty.setEnabled(false);

		//Combo Box For Drinks Selection
		cmbDrinks.setModel(new DefaultComboBoxModel<String>(drinksFile.displayAllDrinks()));
		firstPanel.add(cmbDrinks);
		cmbDrinks.setBounds(18,390,177,25);
		cmbDrinks.setEnabled(false);

		lblDrinksQty.setFont(new Font("Times New Roman",0,12));
		lblDrinksQty.setText("Quantity: ");
		firstPanel.add(lblDrinksQty);
		lblDrinksQty.setBounds(208,393,80,15);

		cmbDrinksQty.setModel(new DefaultComboBoxModel<String>(new String[]{"0","1","2","3",
				"4","5","6","7","8"}));
		firstPanel.add(cmbDrinksQty);
		cmbDrinksQty.setBounds(276,391,40,20);
		cmbDrinksQty.setEnabled(false);
				
				
 	    lblSDSubTotal.setFont(new Font("Times New Roman",0,12));
 	    lblSDSubTotal.setText("Sub Total:");
 	    lblSDSubTotal.setBounds(105,425,90,15);
 	    firstPanel.add(lblSDSubTotal);
 	    
 	    lblActualSDSubTotal.setFont(new Font("Times New Roman",Font.ITALIC,12));
 	    lblActualSDSubTotal.setForeground(new Color(0, 102, 255));
 	    lblActualSDSubTotal.setText("£0.00");
 	    lblActualSDSubTotal.setBounds(172,425,90,15);
 	    firstPanel.add(lblActualSDSubTotal);
 	    
 	    
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
 	    firstPanel.add(lblTotalPrice);
 	    
 	    lblActualTotalPrice.setFont(new Font("Times New Roman",Font.ITALIC,12));
 	    lblActualTotalPrice.setForeground(new Color(0, 102, 255));
 	    lblActualTotalPrice.setText("£0.00");
 	    lblActualTotalPrice.setBounds(450,340,90,15);
 	    firstPanel.add(lblActualTotalPrice);
 	    
 	    lblCashOrCard.setFont(new Font("Times New Roman",0,11));
 	    lblCashOrCard.setText("Would You Like To Pay By Cash Or Card:");
 	    lblCashOrCard.setBounds(360,367,240,25);
 	    firstPanel.add(lblCashOrCard);
 	    
 	    
 	    radioBtnCash.setText("Cash");
 	    radioBtnCash.setBounds(370,395,73,20);
 	    firstPanel.add(radioBtnCash);
 	    radioBtnCash.setEnabled(false);
 	    
 	    radioBtnCard.setText("Card");
 	    radioBtnCard.setBounds(494,395,73,20);
 	    firstPanel.add(radioBtnCard);
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
		firstPanel.add(btnOrderTickets);
		btnOrderTickets.setBounds(416,438,113,20);
		btnOrderTickets.setEnabled(false);
		
		
		btnOrderTickets.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				btnOrderActionPerformed(evt);

			}
		});
		
		// Receipt Title - Below Is Receipt Labels
		lblReceiptTitle.setFont(new Font("Times New Roman",Font.BOLD,18));
		lblReceiptTitle.setForeground(Color.LIGHT_GRAY);
		lblReceiptTitle.setText("CINEMAX RECEIPT");
		secondPanel.add(lblReceiptTitle);
		lblReceiptTitle.setBounds(217,12,198,30);
		
		// Movie Selection - Receipt
		lblMovieOrdered.setFont(new Font("Times New Roman",0,12));
		lblMovieOrdered.setForeground(Color.WHITE);
		lblMovieOrdered.setText("Movie Ordered:");
		secondPanel.add(lblMovieOrdered);
		lblMovieOrdered.setBounds(18,72,106,15);
		
 	    lblActualMovieOrdered.setFont(new Font("Times New Roman",Font.ITALIC,12));
 	    lblActualMovieOrdered.setForeground(new Color(0, 102, 255));
		secondPanel.add(lblActualMovieOrdered);
		lblActualMovieOrdered.setBounds(120,67,230,25);
		
		// Image For The Movie - Receipt
		lblMovieImage.setBounds(350,60,250,250);
		lblMovieImage.setVisible(true);
		secondPanel.add(lblMovieImage);
		lblMovieImage.setBorder(BorderFactory.createEtchedBorder());
		
		// Time Of Show - Receipt
		lblMovieTime.setFont(new Font("Times New Roman",0,12));
		lblMovieTime.setForeground(Color.WHITE);
		lblMovieTime.setText("Time Of Film:");
		secondPanel.add(lblMovieTime);
		lblMovieTime.setBounds(18,102,106,15);

 	    lblActualMovieTime.setFont(new Font("Times New Roman",Font.ITALIC,12));
 	    lblActualMovieTime.setForeground(new Color(0, 102, 255));
		secondPanel.add(lblActualMovieTime);
		lblActualMovieTime.setBounds(120,97,116,25);

		// Theatre Room - Receipt
		lblMovieTheatre.setFont(new Font("Times New Roman",0,12));
		lblMovieTheatre.setForeground(Color.WHITE);
		lblMovieTheatre.setText("Theatre No:");
		secondPanel.add(lblMovieTheatre);
		lblMovieTheatre.setBounds(18,132,106,15);
		
		lblActualMovieTheatre.setFont(new Font("Times New Roman",Font.ITALIC,12));
 	    lblActualMovieTheatre.setForeground(new Color(0, 102, 255));
		secondPanel.add(lblActualMovieTheatre);
		lblActualMovieTheatre.setBounds(120,127,87,25);
		
		// Movie Age Rating - Receipt
		lblActualMovieRating.setFont(new Font ("Times New Roman", Font.BOLD, 12));
		lblActualMovieRating.setForeground(Color.WHITE);
		secondPanel.add(lblActualMovieRating);
		lblActualMovieRating.setBounds(227,104,76,40);
		lblActualMovieRating.setBorder(BorderFactory.createEtchedBorder());
		
		// Adult Tickets - Receipt
		lblAdultPrice.setFont(new Font("Times New Roman",0,12));
		lblAdultPrice.setForeground(Color.WHITE);
		lblAdultPrice.setText("Adult Tickets:");
		secondPanel.add(lblAdultPrice);
		lblAdultPrice.setBounds(18,162,106,15);
		
		lblActualAdultPrice.setFont(new Font("Times New Roman",Font.ITALIC,12));
 	    lblActualAdultPrice.setForeground(new Color(0, 102, 255));
		secondPanel.add(lblActualAdultPrice);
		lblActualAdultPrice.setBounds(120,157,87,25);
		
		lblATicketQty.setFont(new Font("Times New Roman",Font.BOLD,12));
 	    lblATicketQty.setForeground(new Color(0, 102, 255));
		secondPanel.add(lblATicketQty);
		lblATicketQty.setBounds(227,157,87,25);
		
		// Child Tickets - Receipt
		lblChildPrice.setFont(new Font("Times New Roman",0,12));
		lblChildPrice.setForeground(Color.WHITE);
		lblChildPrice.setText("Child Tickets:");
		secondPanel.add(lblChildPrice);
		lblChildPrice.setBounds(18,192,106,15);
		
		lblActualChildPrice.setFont(new Font("Times New Roman",Font.ITALIC,12));
 	    lblActualChildPrice.setForeground(new Color(0, 102, 255));
		secondPanel.add(lblActualChildPrice);
		lblActualChildPrice.setBounds(120,187,87,25);
		
		lblCTicketQty.setFont(new Font("Times New Roman",Font.BOLD,12));
 	    lblCTicketQty.setForeground(new Color(0, 102, 255));
		secondPanel.add(lblCTicketQty);
		lblCTicketQty.setBounds(227,187,87,25);
		
		// Snack Selected - Receipt
		lblSnackName.setFont(new Font("Times New Roman",0,12));
		lblSnackName.setForeground(Color.WHITE);
		secondPanel.add(lblSnackName);
		lblSnackName.setBounds(18,222,150,15);
		
		lblSnackQty.setFont(new Font("Times New Roman",Font.BOLD,12));
 	    lblSnackQty.setForeground(new Color(0, 102, 255));
		secondPanel.add(lblSnackQty);
		lblSnackQty.setBounds(227,217,87,25);
		
		// Drink Selected - Receipt
		lblDrinkName.setFont(new Font("Times New Roman",0,12));
		lblDrinkName.setForeground(Color.WHITE);
		secondPanel.add(lblDrinkName);
		lblDrinkName.setBounds(18,252,150,15);
		
		lblDrinkQty.setFont(new Font("Times New Roman",Font.BOLD,12));
 	    lblDrinkQty.setForeground(new Color(0, 102, 255));
		secondPanel.add(lblDrinkQty);
		lblDrinkQty.setBounds(227,247,87,25);
		
		// Method Of Payment - Receipt
		lblMthdOfPayment.setFont(new Font("Times New Roman",0,12));
		lblMthdOfPayment.setForeground(Color.WHITE);
		lblMthdOfPayment.setText("Method Of Payment:");
		secondPanel.add(lblMthdOfPayment);
		lblMthdOfPayment.setBounds(18,282,150,15);
		
		lblActualMtdPayment.setFont(new Font("Times New Roman",Font.BOLD,12));
 	    lblActualMtdPayment.setForeground(new Color(0, 102, 255));
		secondPanel.add(lblActualMtdPayment);
		lblActualMtdPayment.setBounds(227,277,87,25);
		
		lblTotalPaid.setFont(new Font("Times New Roman",0,14));
		lblTotalPaid.setForeground(Color.WHITE);
		lblTotalPaid.setText("TOTAL PAID:");
		secondPanel.add(lblTotalPaid);
		lblTotalPaid.setBounds(58,314,150,15);
		
		lblActualTotalPaid.setFont(new Font("Times New Roman",Font.BOLD,14));
 	    lblActualTotalPaid.setForeground(new Color(0, 102, 255));
		secondPanel.add(lblActualTotalPaid);
		lblActualTotalPaid.setBounds(160,309,87,25);
		
		btnReturnMain.setText("New Order");
		secondPanel.add(btnReturnMain);
		btnReturnMain.setBounds(420,322,113,20);
		
		btnReturnMain.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				btnNewOrderActionPerformed(evt);

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
	    	cmbAdultTicket.setEnabled(true);
	    	cmbChildTicket.setEnabled(true);
	    	
	    	cmbSnacks.setEnabled(true);
	    	cmbSnacksQty.setEnabled(true);
	    	
	    	cmbDrinks.setEnabled(true);
	    	cmbDrinksQty.setEnabled(true);
	    	
	    	btnOrderTickets.setEnabled(false);
	    	
			
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
			lblActualTimeOfShow.setText(movieFile.displayTimeOfShow(comboIndex1));
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
		adultQtyIndex = cmbAdultTicket.getSelectedIndex();
		childQtyIndex = cmbChildTicket.getSelectedIndex();
		
		double aFilmPrice = movieFile.displayAdultTicket(comboIndex1);
		double adultSubTtl = (aFilmPrice * adultQtyIndex);
		
		double cFilmPrice = movieFile.displayChildTicket(comboIndex1);
		double childSubTtl = (cFilmPrice * childQtyIndex);
		
		subTotalTickets = adultSubTtl + childSubTtl;
		
		ticketSubTotal = Double.toString(subTotalTickets);

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

		snackIndex = cmbSnacks.getSelectedIndex();
		snackQtyIndex = cmbSnacksQty.getSelectedIndex();
		
		drinkIndex = cmbDrinks.getSelectedIndex();
		drinkQtyIndex = cmbDrinksQty.getSelectedIndex();
		
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
		btnOrderTickets.setEnabled(true);
	}
	
	private void cashRdioBtnActionPerformed(ActionEvent evt){
		if(radioBtnCash.isSelected()){
			paymentMethod = "Cash";
		}
		btnOrderTickets.setEnabled(true);
	}
	
	public void btnOrderActionPerformed(ActionEvent evt){
		setSize(610,385);
		firstPanel.setVisible(false);
		secondPanel.setVisible(true);
		lblActualMovieOrdered.setText(movieFile.displayFilmName(comboIndex1));
		lblMovieImage.setIcon(new ImageIcon(getClass().getResource(movieFile.displayFilmImage(comboIndex1))));
		lblActualMovieTime.setText(movieFile.displayTimeOfShow(comboIndex1));
		lblActualMovieTheatre.setText(movieFile.displayTheatreRoom(comboIndex1));
		lblActualMovieRating.setText("Rated:"+movieFile.displayFilmRating(comboIndex1));
		lblActualAdultPrice.setText("£"+movieFile.displayAdultTicket(comboIndex1)+"0");
		lblATicketQty.setText("x"+adultQtyIndex);
		lblActualChildPrice.setText("£"+movieFile.displayChildTicket(comboIndex1)+"0");
		lblCTicketQty.setText("x"+childQtyIndex);
		if (snackIndex != 0){
			lblSnackName.setText(snacksFile.displaySnack(snackIndex));
			lblSnackQty.setText("x"+snackQtyIndex);
			if (drinkIndex == 0){
				lblMthdOfPayment.setBounds(18,252,150,15);
				lblActualMtdPayment.setBounds(227,247,87,25);
		}
		if (drinkIndex!=0){
			lblDrinkName.setText(drinksFile.displayDrink(drinkIndex));
			lblDrinkQty.setText("x"+drinkQtyIndex);
			if (snackIndex == 0){
				lblDrinkName.setBounds(18,222,150,15);
				lblDrinkQty.setBounds(227,217,87,25);
				lblMthdOfPayment.setBounds(18,252,150,15);
				lblActualMtdPayment.setBounds(227,247,87,25);
			}
		}
		}else{
			lblMthdOfPayment.setBounds(18,222,150,15);
			lblActualMtdPayment.setBounds(227,217,87,25);
		}
		lblActualMtdPayment.setText(paymentMethod);
		
 	    lblActualTotalPaid.setText("£"+strTotal+"0");
		
	}
	
	private void btnNewOrderActionPerformed(ActionEvent evt){
		setSize(610,528);
		firstPanel.setVisible(true);
		secondPanel.setVisible(false);
		cmbMovies.setSelectedIndex(0);
		
	}
	
}	




