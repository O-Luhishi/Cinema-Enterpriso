import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
			
		FirstPageGui mainFrame = new FirstPageGui();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.pack();
		mainFrame.setSize(810, 770);
		mainFrame.setVisible(true);
		

	}

}
