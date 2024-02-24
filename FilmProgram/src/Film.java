public class Film {
	private String movieName;
	private  String directorName;
	private int copies;

	//constructor1
	public Film(String movieName, String directorName, int copies){
		this.movieName = movieName;
		this.directorName = directorName;
		this.copies = copies;
	}
	//constructor2
	public Film(){
		this.movieName = "NA";
		this.directorName ="NA";
		this.copies = 0;
	}
	public String getMovieName(){
		return movieName;
	}
	public String getDirectorName() {
		return directorName;
	}
	public int getCopies(){
		return copies;
	}
	public void setData(String movieName, String directorName, int copies){
		this.movieName = movieName;
		this.directorName = directorName;
		this.copies = copies;
	}
	public String toString(){
		return "Name of movie: " + movieName +"\n The director:" +directorName +
				"\n The number of copies in the store: " +copies;
	}
	public int insertCopies(){
		return this.copies++;
	}
	public boolean checkCopies(){
		return this.copies > 0;
	}
	public void removeCopies(){
		if (checkCopies()) {
			copies--;
			System.out.println("Copy removed successfully.");
		} else {
			System.out.println("No copies available to remove.");
		}
	}
}
