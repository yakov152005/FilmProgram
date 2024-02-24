import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Film[] filmArray =new Film[3];

		creatFilmArr(filmArray, s);

			System.out.print("What movie would you like to take? ");
			int N = s.nextInt();
			System.out.print("Which movie would you like to return? ");
			int M = s.nextInt();
			insertAndRemove(filmArray, N, M);

		printFilmArr(filmArray);

		s.close();
	}

	public static void creatFilmArr(Film[] filmArray,Scanner s){
		String name, director;
		int copies;
		for (int i = 0; i < filmArray.length; i++) {
			System.out.println("| Enter details for Film - " + (i) +" |");
			System.out.print("Name of movie: ");
			name = s.next();
			System.out.print("Director name: ");
			director = s.next();
			System.out.print("The number of copies in the store: ");
			copies =s.nextInt();
			filmArray[i] = new Film(name, director, copies);
		}
	}
	public static void insertAndRemove( Film[] filmArray, int N, int M){
			if (filmArray[N].checkCopies()) {
				filmArray[N].removeCopies();
			}else {
				System.out.println("There are no movies to rent in the store from this movie :(");
			}
			filmArray[M].insertCopies();
	}
	public static void printFilmArr(Film[] filmArray){
		System.out.println("Updated film information:");
		for (int i = 0; i < filmArray.length; i++) {
			System.out.println(filmArray[i].toString());
		}
	}
	public static Scanner s =new Scanner(System.in);
}
