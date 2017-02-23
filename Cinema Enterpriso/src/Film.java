import java.util.ArrayList;

public class Film {
	
	private String filmName;
	private int roomCapacity;
	private String childTicketPrice;
	private String adultTicketPrice;
	private String ageRating;
	private String theatreNumber;
	private String timeOfShow;
	
	
	public Film(String Film, int RoomCap, String ChildTicket, String AdultTicket,
			String Age, String Theatre, String TimeOfShow){
		
		filmName = Film;
		roomCapacity = RoomCap;
		childTicketPrice = ChildTicket;
		adultTicketPrice = AdultTicket;
		ageRating = Age;
		theatreNumber = Theatre;
		timeOfShow = TimeOfShow;
		
	}
	
	public String getFilm(){
		return filmName;
	}
	
	public String getChildTicketPrice(){
		return childTicketPrice;
	}
	
	public String getAdultTicketPrice(){
		return adultTicketPrice;
	}
	
	public int getRoomCapacity(){
		return roomCapacity;
	}
}


