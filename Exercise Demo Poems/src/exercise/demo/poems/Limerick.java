
package exercise.demo.poems;


public class Limerick extends Poem{

    public Limerick(String nameOfTheLimerick) {
        super(nameOfTheLimerick, 5);
    }

    @Override
    public String toString() {
        return "Limerick{" + super.toString()+'}';
    }
    
    
    
}
