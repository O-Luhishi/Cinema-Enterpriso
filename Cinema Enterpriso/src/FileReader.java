import java.io.*;
import java.util.*;
public class FileReader {

	private Scanner movieScan;
	
	ArrayList<Film> movie = new ArrayList<Film>();
	String[]keyword = new String[7];
	String fName, fRating, fAdultTicket, fChildTicket, fTheatreRoom, fTime;
	int fCapacity;
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
			fAdultTicket = keyword[2];
			fChildTicket = keyword[3];
			fCapacity = Integer.parseInt(keyword[4]);
			fTheatreRoom = keyword[5];
			fTime = keyword[6];	
			
			
			shogun = new Film(fName, fRating, fAdultTicket, fChildTicket, fCapacity, fTheatreRoom, fTime);
			movie.add(shogun);
		}
	}
	
	public void closeFile(){
		movieScan.close();
	}
	
	public String displayAllFilms(){
		for (int i=0; i < movie.size(); i++){
			return movie.get(i).getFilm();
		}
		throw new NullPointerException("No Film Exists");
	}
	
	public String displayFilmName(int index){
		return movie.get(index).getFilm();
	}
	
	public String displayFilmRating(int index){
		return movie.get(index).getAgeRating();
	}
	
	public String displayAdultTicket(int index){
		return movie.get(index).getAdultTicketPrice();
	}
	
	public String displayChildTicket(int index){
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
}

