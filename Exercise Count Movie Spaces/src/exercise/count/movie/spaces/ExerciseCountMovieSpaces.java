
package exercise.count.movie.spaces;

import java.util.Scanner;
public class ExerciseCountMovieSpaces {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        String movieQuote="Favourite movie quote";
        
        CountMovieSpaces countMovieSpaces=new CountMovieSpaces(movieQuote);
        
        System.out.println("Please input the movie quote:");
        String userQuote=scan.nextLine();
        
        CountMovieSpaces countUserMovieSpaces=new CountMovieSpaces(userQuote);
        
        
    }
    
}
