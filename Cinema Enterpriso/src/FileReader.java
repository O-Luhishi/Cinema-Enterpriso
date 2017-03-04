import java.io.*;
import java.util.*;
public class FileReader {

	private Scanner movieScan;
	
	ArrayList<Film> movie = new ArrayList<Film>();
	String[]keyword = new String[8];
	String fName, fRating, fTheatreRoom, fTime, fLocation, fRatingColour;
	int fCapacity;
	double fAdultTicket, fChildTicket;
	String movieFile = "MovieList.txt";
	String line;
	Film shogun;
	

	public void openFile(){
		try{
			movieScan = new Scanner(new File(movieFile));
		}
		catch(Exception e){
			// Create Dialog Window To Print Error!
			System.out.printf("Could Not Find the File %s", movieFile);
		}
	}
	
	public void readFile(){
		while (movieScan.hasNextLine()){
			
			line = movieScan.nextLine();
			keyword = line.split("; ");
			fName = keyword[0];
			fRating = keyword[1];
			fAdultTicket = Double.parseDouble(keyword[2]);
			fChildTicket = Double.parseDouble(keyword[3]);
			fCapacity = Integer.parseInt(keyword[4]);
			fTheatreRoom = keyword[5];
			fTime = keyword[6];
			fLocation = keyword[7];
			fRatingColour = keyword[8];
			
			
			shogun = new Film(fName, fRating, fAdultTicket, fChildTicket, fCapacity, fTheatreRoom, fTime, fLocation, fRatingColour);
			movie.add(shogun);
		}
	}
	
	public void closeFile(){
		movieScan.close();
	}
	
	public String[] displayAllFilms(){
		String[] toRet = new String[movie.size()];
		for (int i=0; i < movie.size(); i++){
			toRet[i] = movie.get(i).getFilm();
		}
		return toRet;
	}
	
	public String displayFilmName(int index){
		return movie.get(index).getFilm();
	}
	
	public String displayFilmRating(int index){
		return movie.get(index).getAgeRating();
	}
	
	public double displayAdultTicket(int index){
		return movie.get(index).getAdultTicketPrice();
	}
	
	public double displayChildTicket(int index){
		return movie.get(index).getChildTicketPrice();
	}
	
	public int displayNumberOfSetas(int index){
		return movie.get(index).getRoomCapacity();
	}
	
	public String displayTheatreRoom(int index){
		return movie.get(index).getTheatreNumber();
	}
	
	public String displayTimeOfShow(int index){
		return movie.get(index).getTimeOfShow();
	}
	
	public String displayFilmImage(int index){
		return movie.get(index).getFilmAddress();
	}
	
	public String displayFilmRatingColour(int index){
		return movie.get(index).getFilmRatingColour();
	}
}

