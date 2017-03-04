
public class Film {
	
	private String filmName;
	private int noSeats;
	private double childTicketPrice;
	private double adultTicketPrice;
	private String ageRating;
	private String theatreNumber;
	private String timeOfShow;
	private String filmAddress;
	private String filmRatingColour;
	
	public Film(String Film, String Age, double AdultTicket, double ChildTicket, int RoomCap, String Theatre, String TimeOfShow,
			String FilmLocation, String ratingColour){
		
		filmName = Film;
		noSeats = RoomCap;
		childTicketPrice = ChildTicket;
		adultTicketPrice = AdultTicket;
		ageRating = Age;
		theatreNumber = Theatre;
		timeOfShow = TimeOfShow;
		filmAddress = FilmLocation;
		filmRatingColour = ratingColour;
		
	}
	
	public String getFilm(){
		return filmName;
	}
	
	public double getChildTicketPrice(){
		return childTicketPrice;
	}
	
	public double getAdultTicketPrice(){
		return adultTicketPrice;
	}
	
	public int getRoomCapacity(){
		return noSeats;
	}
	
	public String getAgeRating(){
		return ageRating;
		}
	
	public String getTheatreNumber(){
		return theatreNumber;
	}
	
	public String getTimeOfShow(){
		return timeOfShow;
	}
	
	public String getFilmAddress(){
		return filmAddress;
	}
	
	public String getFilmRatingColour(){
		return filmRatingColour;
	}

}





