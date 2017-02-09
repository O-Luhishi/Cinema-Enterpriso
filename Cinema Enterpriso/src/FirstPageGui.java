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
	
	// Declaring JComboBox's 
	private JComboBox<String> cmbMovies;
	
	// Declaring JSeparator's
	private JSeparator first_Seperator;
	
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

		// ComboBox Init's
		cmbMovies = new JComboBox<String>();
		
		// Separator Init's
		first_Seperator = new JSeparator();
		
		// Title Of The Program
		lblCinemaTitle.setFont(new Font("Serif",Font.ITALIC+Font.BOLD,20));
		lblCinemaTitle.setText("University Cineplex");
		getContentPane().add(lblCinemaTitle);
		lblCinemaTitle.setBounds(320,0,240,30);
		
		// Movie Selection
		lblMovieSelection.setFont(new Font("Times New Roman",0,14));
		lblMovieSelection.setText("Select Movie:");
		getContentPane().add(lblMovieSelection);
		lblMovieSelection.setBounds(10,90,80,20);
		
		// Combo Box For Movie Selection
		cmbMovies.setModel(new DefaultComboBoxModel<String>(new String[]{"","Power Rangers Mighty Morphin", 
				"10 Cloverfield Lane","Kung-Fu Panda 2","Avengers: Age of Ultron","Guardians of the Galaxy Vol2",
				"Fast & Furious 6","Doctor Strange"}));
		
	      cmbMovies.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                cmbmoviesActionPerformed(evt);
	            }
	        });
	      
	      
		
		getContentPane().add(cmbMovies);
		cmbMovies.setBounds(100,90,230,25);
		
		// Heading With A Separator Between Movie And Theatre Details
		lblTheatre_Time.setFont(new Font("Times New Roman",Font.ITALIC,13));
		lblTheatre_Time.setForeground(new Color(0, 102, 255));
		lblTheatre_Time.setText("Theatre No & Time");
		getContentPane().add(lblTheatre_Time);
		lblTheatre_Time.setBounds(10,130,110,15);
		
		getContentPane().add(first_Seperator);
		first_Seperator.setBounds(120,140,210,2);
		

		lblTheatreNo.setFont(new Font("Times New Roman",0,14));
		lblTheatreNo.setText("Theatre No:"); 
		getContentPane().add(lblTheatreNo);
		lblTheatreNo.setBounds(10,160,80,15);
		
		/*/
		*
		* Initialise ActualThreatreNo Here!
		*
		/*/

		lblTimeOfShow.setFont(new Font("Times New Roman",0,14));
		lblTimeOfShow.setText("Time Of Show:");
		getContentPane().add(lblTimeOfShow);
		lblTimeOfShow.setBounds(10,200,90,15);
		
		
		lblActualTimeOfShow.setFont(new Font("Times New Roman",1,14));
		lblActualTimeOfShow.setText("9:00 PM");
		getContentPane().add(lblActualTimeOfShow);
		lblActualTimeOfShow.setBounds(110,198,100,20);
			
		
		
	}
	
	private void cmbmoviesActionPerformed(java.awt.event.ActionEvent evt) {
	       if((String)cmbMovies.getSelectedItem() == "Doctor Strange")
	       {
	           lblImgPreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("src/Doctor_Strange.jpg"))); 
	       }
	
	}

}
