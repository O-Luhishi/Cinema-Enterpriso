
public class Drinks {
	
	private String drinkName;
	private double drinkPrice;
	
	public Drinks(String drinkN, double drinkP){
		drinkName = drinkN;
		drinkPrice = drinkP;
	}
	
	public String getDrinkName(){
		return drinkName;
	}

	public double getDrinkPrice(){
		return drinkPrice;
	}
}
