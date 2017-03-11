import java.io.*;
import java.util.*;

public class SnackFileReader {
	
	private Scanner snackScan;
	
	ArrayList<Snacks> snacks = new ArrayList<Snacks>();
	String[]arrySnack = new String[1];
	String sName;
	double sPrice;
	String snackFile = "SnackList.txt";
	String line;
	Snacks items;
	
	public void openFile(){
		try{
			snackScan = new Scanner(new File(snackFile));
		} catch(Exception e){
			System.out.printf("Could Not Find The File %s", snackFile);
		}
	}
	
	public void readFile(){
		while (snackScan.hasNextLine()){
			
			line = snackScan.nextLine();
			arrySnack = line.split(";");
			sName = arrySnack[0];
			sPrice = Double.parseDouble(arrySnack[1]);
			
			items = new Snacks(sName, sPrice);
			snacks.add(items);
			
		}
	}
	
	public void closeFile(){
		snackScan.close();
	}
	
	public String[] displayAllSnacks(){
		String[] toRet = new String[snacks.size()];
		for (int i=0; i < snacks.size(); i++){
			toRet[i] = snacks.get(i).getSnackName();
		}
		return toRet;
	}
	
	public String displaySnack(int index){
		return snacks.get(index).getSnackName();
	}
	
	public double displaySnackPrice(int index){
		return snacks.get(index).getSnackPrice();
	}
	
}
