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
	private int comboIndex2;
	private int comboIndex3;
	
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
	
	
	
	// Declaring JComboBox's 
	private JComboBox<String> cmbMovies;
	
	// Declaring JSeparator's
	private JSeparator first_Seperator;
	private JSeparator second_Separator;
	
	public FirstPageGui(){
		super("Cinema Enterpriso");
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
		

		// ComboBox Init's
		cmbMovies = new JComboBox<String>();
		
		// Separator Init's
		first_Seperator = new JSeparator();
		second_Separator = new JSeparator();
		
		// Title Of The Program
		lblCinemaTitle.setFont(new Font("Serif",Font.ITALIC+Font.BOLD,20));
		lblCinemaTitle.setText("University Cineplex");
		getContentPane().add(lblCinemaTitle);
		lblCinemaTitle.setBounds(200,0,240,30);
		
		// Movie Selection
		lblMovieSelection.setFont(new Font("Times New Roman",0,12));
		lblMovieSelection.setText("Select Movie:");
		getContentPane().add(lblMovieSelection);
		lblMovieSelection.setBounds(10,95,80,15);
		
		// Combo Box For Movie Selection
		cmbMovies.setModel(new DefaultComboBoxModel<String>(new String[]{"","Doctor Strange","T2 Trainspotting",
				"Guardians of the Galaxy Vol2", 
				"10 Cloverfield Lane","Disney: Moana","Rogue One: Star Wars","Kung Fu Panda 3","Power Rangers MMPR",
				"Avengers: Age of Ultron","Batman VS Superman",}));
		
		// Listening For Any Events Coming From The Movie Combo Box
	    cmbMovies.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                cmbMoviesActionPerformed(evt);
	                cmbMoviesTheatreActionPerformed(evt);
	                cmbMoviesTimeActionPerformed(evt);
	                cmbMovieAgeRatingActionPerformed(evt);
	            }
	        });
	      
	    // Setting Up The Image Preview For When The Program First Runs
		lblImgPreview.setBounds(350,60,250,250);
		lblImgPreview.setVisible(true);
		lblImgPreview.setFont(new Font("Times New Roman", Font.ITALIC + Font.BOLD, 20));
		lblImgPreview.setText("SELECT A MOVIE");
		lblImgPreview.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgPreview.setVerticalAlignment(SwingConstants.CENTER);
		add(lblImgPreview);
		
		lblImgPreview.setBorder(BorderFactory.createEtchedBorder());
	      
		getContentPane().add(cmbMovies);
		cmbMovies.setBounds(100,90,230,25);
		
		// Age Rating Label & The Value It Will Display Depending On The Movie Selected
		lblAgeRating.setFont(new Font ("Times New Roman", Font.BOLD, 10));
		lblAgeRating.setForeground(new Color(0, 102, 255));
		lblAgeRating.setText("Age Rating: ");
		getContentPane().add(lblAgeRating);
		lblAgeRating.setBounds(415,315,110,15);
		
		lblActualAgeRating.setFont(new Font ("Times New Roman", Font.BOLD, 12));
		getContentPane().add(lblActualAgeRating);
		lblActualAgeRating.setBounds(485,315,110,15);
		
		
		
		// Setting Up Theatre Number Labels
		lblActualTheatreNo.setFont(new Font("Times New Roman", Font.ITALIC,12));
		lblActualTheatreNo.setForeground(new Color(0, 102, 255));
		getContentPane().add(lblActualTheatreNo);
		lblActualTheatreNo.setBounds(100,157,230,20);
		
		// Heading With A Separator Between Movie And Theatre Details
		lblTheatre_Time.setFont(new Font("Times New Roman",Font.BOLD,10));
		lblTheatre_Time.setForeground(new Color(0, 102, 255));
		lblTheatre_Time.setText("Theatre No & Time");
		getContentPane().add(lblTheatre_Time);
		lblTheatre_Time.setBounds(10,130,110,15);
		
		getContentPane().add(first_Seperator);
		first_Seperator.setBounds(120,140,210,2);
		

		lblTheatreNo.setFont(new Font("Times New Roman",0,12));
		lblTheatreNo.setText("Theatre No:"); 
		getContentPane().add(lblTheatreNo);
		lblTheatreNo.setBounds(10,160,80,15);

		lblTimeOfShow.setFont(new Font("Times New Roman",0,12));
		lblTimeOfShow.setText("Time Of Show:");
		getContentPane().add(lblTimeOfShow);
		lblTimeOfShow.setBounds(10,200,90,15);
		
		
		lblActualTimeOfShow.setFont(new Font("Times New Roman",Font.ITALIC,12));
		lblActualTimeOfShow.setForeground(new Color(0, 102, 255));
		getContentPane().add(lblActualTimeOfShow);
		lblActualTimeOfShow.setBounds(110,198,100,20);
		
		
		lblTicketHeading.setFont(new Font("Times New Roman", Font.BOLD,10));
		lblTicketHeading.setForeground(new Color(0, 102, 255));
		lblTicketHeading.setText("Ticket Pricing");
		getContentPane().add(lblTicketHeading);
		lblTicketHeading.setBounds(10,240,110,15);
		
		getContentPane().add(second_Separator);
		second_Separator.setBounds(110,250,220,10);
		

			
		
		
	}
	
	private void cmbMoviesActionPerformed(ActionEvent evt) {
			lblImgPreview.setText("");
			comboIndex1 = cmbMovies.getSelectedIndex();
			
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
	       }
	
	}
	
	private void cmbMoviesTheatreActionPerformed(ActionEvent evt){
		comboIndex2 = cmbMovies.getSelectedIndex();
		
		if (comboIndex2 == 1){
			lblActualTheatreNo.setText("CW-01-01");
		}else if (comboIndex2 == 2){
			lblActualTheatreNo.setText("CW-01-02");
		}else if (comboIndex2 == 3){
			lblActualTheatreNo.setText("CW-01-03");
		}else if (comboIndex2 == 4){
			lblActualTheatreNo.setText("CW-01-04");
		}else if (comboIndex2 == 5){
			lblActualTheatreNo.setText("CW-01-05");
		}else if (comboIndex2 == 6){
			lblActualTheatreNo.setText("CW-02-01");
		}else if (comboIndex2 == 7){
			lblActualTheatreNo.setText("CW-02-02");	
		}else if (comboIndex2 == 8){
			lblActualTheatreNo.setText("CW-02-03");	
		}else if (comboIndex2 == 9){
			lblActualTheatreNo.setText("CW-02-04");	
		}else if (comboIndex2 == 10){
			lblActualTheatreNo.setText("CW-02-05");
		}else{
			lblActualTheatreNo.setText("");
		}
	}
	
	private void cmbMoviesTimeActionPerformed(ActionEvent evt){
		if((String)cmbMovies.getSelectedItem() == ""){
			lblActualTimeOfShow.setText("");
		} else{
			lblActualTimeOfShow.setText("9:00 PM");
		}
	}
	
	private void cmbMovieAgeRatingActionPerformed(ActionEvent evt){
		comboIndex3 = cmbMovies.getSelectedIndex();
		if (comboIndex3 == 1){
			lblActualAgeRating.setForeground(Color.ORANGE);
			lblActualAgeRating.setText("12A");
		}else if (comboIndex3 == 2){
			lblActualAgeRating.setForeground(Color.RED);
			lblActualAgeRating.setText("18");
		}else if (comboIndex3 == 3){
			lblActualAgeRating.setForeground(Color.GREEN);
			lblActualAgeRating.setText("PG");
		}else if (comboIndex3 == 4){
			lblActualAgeRating.setForeground(Color.RED);
			lblActualAgeRating.setText("15");
		}else if (comboIndex3 == 5){
			lblActualAgeRating.setForeground(Color.GREEN);
			lblActualAgeRating.setText("PG");
		}else if (comboIndex3 == 6){
			lblActualAgeRating.setForeground(Color.RED);
			lblActualAgeRating.setText("15");
		}else if (comboIndex3 == 7){
			lblActualAgeRating.setForeground(Color.GREEN);
			lblActualAgeRating.setText("PG");
			
		}else if (comboIndex3 == 8){
			lblActualAgeRating.setForeground(Color.ORANGE);
			lblActualAgeRating.setText("12A");
		}else if (comboIndex3 == 9){
			lblActualAgeRating.setForeground(Color.ORANGE);
			lblActualAgeRating.setText("12A");
		}else if (comboIndex3 == 10){
			lblActualAgeRating.setForeground(Color.ORANGE);
			lblActualAgeRating.setText("12A");
		}else{
				lblActualAgeRating.setText("");
		}
		
		
//		if((String)cmbMovies.getSelectedItem() == "Doctor Strange"){
//			lblActualTheatreNo.setText("CW-01-01");
//		}else if((String)cmbMovies.getSelectedItem() == "10 Cloverfield Lane"){
//			lblActualTheatreNo.setText("CW-01-02");
//		}else if((String)cmbMovies.getSelectedItem() == "Power Rangers MMPR"){
//			lblActualTheatreNo.setText("CW-01-03");
//		}else if((String)cmbMovies.getSelectedItem() == "Kung Fu Panda 3"){
//			lblActualTheatreNo.setText("CW-01-04");
//		}else if((String)cmbMovies.getSelectedItem() == "Avengers: Age of Ultron"){
//			lblActualTheatreNo.setText("CW-01-05");
//		}else if((String)cmbMovies.getSelectedItem("CW-02-01");
//		}else if((String)cmbMovies.getSelectedItem() == "Batman VS Superman"){
//			lblActualTheatreNo.setText("CW-02-02");	
//		}else if((String)cmbMovies.getSelectedItem() == "Disney: Moana"){
//			lblActualTheatreNo.setText("CW-02-03");	
//		}else if((String)cmbMovies.getSelectedItem() == "Rogue One: Star Wars"){
//			lblActualTheatreNo.setText("CW-02-04");	
//		}else if((String)cmbMovies.getSelectedItem() == "T2 Trainspotting"){
//			lblActualTheatreNo.setText("CW-02-05");
//		}else{
//			lblActualTheatreNo.setText("");
//		}
	}
}	
	


