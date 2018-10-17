
package exercise.shapes;


public class Circles extends TwoDimensionalShapes{
    private int radius;
    private int diameter;

    public Circles(int radius, int diameter, String name) {
        super("Circle");
        this.radius = radius;
        this.diameter = radius*2;
    }
    
    
    
}
