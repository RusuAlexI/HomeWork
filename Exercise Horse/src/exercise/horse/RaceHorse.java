
package exercise.horse;


public class RaceHorse extends Horse{
    
    private int numberOfRacesCompeted;

    public RaceHorse(int numberOfRacesCompeted, String name, String color, int birthYear) {
        super(name, color, birthYear);
        this.numberOfRacesCompeted = numberOfRacesCompeted;
    }

    public int getNumberOfRacesCompeted() {
        return numberOfRacesCompeted;
    }

    public void setNumberOfRacesCompeted(int numberOfRacesCompeted) {
        this.numberOfRacesCompeted = numberOfRacesCompeted;
    }

    @Override
    public String toString() {
        return super.toString()+", RaceHorse{" + ", numberOfRacesCompeted= " + numberOfRacesCompeted + '}';
    }

   
    
}
