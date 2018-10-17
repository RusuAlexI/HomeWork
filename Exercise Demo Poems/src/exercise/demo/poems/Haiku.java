
package exercise.demo.poems;


public class Haiku extends Poem{

    public Haiku(String nameOfTheHaiku) {
        super(nameOfTheHaiku, 3);
    }

    @Override
    public String toString() {
        return "Haiku{" + super.toString()+'}';
    }
    
    
}
