
public class Film {
	
	private String filmName;
	private int noSeats;
	private String childTicketPrice;
	private String adultTicketPrice;
	private String ageRating;
	private String theatreNumber;
	private String timeOfShow;
	private String filmAddress;
	private String filmRatingColour;
	
	public Film(String Film, String Age, String AdultTicket,String ChildTicket, int RoomCap, String Theatre, String TimeOfShow,
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
	
	public String getChildTicketPrice(){
		return childTicketPrice;
	}
	
	public String getAdultTicketPrice(){
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





