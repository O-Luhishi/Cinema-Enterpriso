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
		
		
	    cmbMovies.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	                cmbMoviesActionPerformed(evt);
	                cmbMoviesTheatreActionPerformed(evt);
	                cmbMoviesTimeActionPerformed(evt);
	            }
	        });
	      
	      
		lblImgPreview.setBounds(335,90,250,250);
		lblImgPreview.setVisible(true);
		add(lblImgPreview);
	      
		getContentPane().add(cmbMovies);
		cmbMovies.setBounds(100,90,230,25);
		
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
		
		/*/
		*
		* Initialise ActualThreatreNo Here!
		*
		/*/

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
	       if((String)cmbMovies.getSelectedItem() == "Doctor Strange"){
	           lblImgPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("Doctor_Strange.jpg"))); 
	       } else if((String)cmbMovies.getSelectedItem() == "10 Cloverfield Lane"){
	    	   lblImgPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("10_Cloverfield_Lane.jpg")));
	       } else if((String)cmbMovies.getSelectedItem() == "Power Rangers MMPR"){
	    	   lblImgPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("Power-Rangers-Movie-2017.jpg")));
	       } else if((String)cmbMovies.getSelectedItem() == "Kung Fu Panda 3"){
	    	   lblImgPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("kung-fu-panda-3.jpg")));
	       } else if((String)cmbMovies.getSelectedItem() == "Avengers: Age of Ultron"){
	    	   lblImgPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("Avengers.jpg")));
	       } else if((String)cmbMovies.getSelectedItem() == "Guardians of the Galaxy Vol2"){
	    	   lblImgPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("GuardiansOfGalaxy.jpg")));
	       } else if((String)cmbMovies.getSelectedItem() == "Batman VS Superman"){
	    	   lblImgPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("BatmanVsSuperman.jpg")));
	       } else if((String)cmbMovies.getSelectedItem() == "Disney: Moana"){
	    	   lblImgPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("Moana.jpg")));
	       } else if((String)cmbMovies.getSelectedItem() == "Rogue One: Star Wars"){
	    	   lblImgPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("rogueone.jpg")));
	       } else if((String)cmbMovies.getSelectedItem() == "T2 Trainspotting"){
	    	   lblImgPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("T2Trainspotting.jpg")));
	       } else{
	    	   lblImgPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
	       }
	
	}
	
	private void cmbMoviesTheatreActionPerformed(ActionEvent evt){
		if((String)cmbMovies.getSelectedItem() == "Doctor Strange"){
			lblActualTheatreNo.setText("CW-01-01");
		}else if((String)cmbMovies.getSelectedItem() == "10 Cloverfield Lane"){
			lblActualTheatreNo.setText("CW-01-02");
			
		}else if((String)cmbMovies.getSelectedItem() == "Power Rangers MMPR"){
			lblActualTheatreNo.setText("CW-01-03");
		}else if((String)cmbMovies.getSelectedItem() == "Kung Fu Panda 3"){
			lblActualTheatreNo.setText("CW-01-04");
		}else if((String)cmbMovies.getSelectedItem() == "Avengers: Age of Ultron"){
			lblActualTheatreNo.setText("CW-01-05");
		}else if((String)cmbMovies.getSelectedItem() == "Guardians of the Galaxy Vol2"){
			lblActualTheatreNo.setText("CW-02-01");
		}else if((String)cmbMovies.getSelectedItem() == "Batman VS Superman"){
			lblActualTheatreNo.setText("CW-02-02");	
		}else if((String)cmbMovies.getSelectedItem() == "Disney: Moana"){
			lblActualTheatreNo.setText("CW-02-03");	
		}else if((String)cmbMovies.getSelectedItem() == "Rogue One: Star Wars"){
			lblActualTheatreNo.setText("CW-02-04");	
		}else if((String)cmbMovies.getSelectedItem() == "T2 Trainspotting"){
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
	
	

}
