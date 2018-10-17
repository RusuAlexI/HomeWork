
package exercise.shapes;


public class Frustum extends CircleBase{
    
    private int secondRadius;
    private int length;

    public Frustum(int secondRadius, int length, int radius) {
        super(radius);
        this.secondRadius = secondRadius;
        this.length = length;
    }
    
    
}
