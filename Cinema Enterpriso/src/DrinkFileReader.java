import java.io.*;
import java.util.*;

public class DrinkFileReader {
	
	private Scanner drinkScan;
	
	ArrayList<Drinks> drinks = new ArrayList<Drinks>();
	String[]arrayDrink = new String[1];
	String dName;
	double dPrice;
	String drinkFile = "DrinkList.txt";
	String line;
	Drinks items;
	
	public void openFile(){
		try{
			drinkScan = new Scanner(new File(drinkFile));
		} catch(Exception e){
			System.out.printf("Could Not Find The File %s", drinkFile);
		}
	}
	
	public void readFile(){
		while (drinkScan.hasNextLine()){
			
			line = drinkScan.nextLine();
			arrayDrink = line.split(";");
			dName = arrayDrink[0];
			dPrice = Double.parseDouble(arrayDrink[1]);
			
			items = new Drinks(dName, dPrice);
			drinks.add(items);
			
		}
	}
	
	public void closeFile(){
		drinkScan.close();
	}
	
	public String[] displayAllDrinks(){
		String[] toRet = new String[drinks.size()];
		for (int i=0; i < drinks.size(); i++){
			toRet[i] = drinks.get(i).getDrinkName();
		}
		return toRet;
	}
	
	public String displayDrink(int index){
		return drinks.get(index).getDrinkName();
	}
	
	public double displayDrinkPrice(int index){
		return drinks.get(index).getDrinkPrice();
	}

}
