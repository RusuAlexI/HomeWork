
package exercise.count.movie.spaces;


public class CountMovieSpaces {
    
    
    public CountMovieSpaces(String quote){
    countSpaces(quote);
    }
    
    public int countSpaces(String quote){
    char[] quoteToArray=quote.toCharArray();
    int counter=0;
    
    for(int i=0; i<quoteToArray.length; i++){
    if (quoteToArray[i]==' ') counter++;
    }
        System.out.println("There are "+counter+" spaces in the quote.");
    return counter;
    }
}
