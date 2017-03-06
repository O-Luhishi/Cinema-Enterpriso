
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
	
	public Film(String film, String age, double adultTicket, double childTicket, int roomCap, String theatre, String showTime,
			String filmLocation, String ratingColour){
		
		filmName = film;
		noSeats = roomCap;
		childTicketPrice = childTicket;
		adultTicketPrice = adultTicket;
		ageRating = age;
		theatreNumber = theatre;
		timeOfShow = showTime;
		filmAddress = filmLocation;
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





