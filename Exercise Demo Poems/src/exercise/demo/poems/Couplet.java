
package exercise.demo.poems;


public class Couplet extends Poem{

    public Couplet(String nameOfTheCouplet) {
        super(nameOfTheCouplet, 2);
    }

    @Override
    public String toString() {
        return "Couplet{" + super.toString()+'}';
    }
    
    
    
}
