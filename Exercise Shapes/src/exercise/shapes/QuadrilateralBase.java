
package exercise.shapes;


public class QuadrilateralBase extends ThreeDimensionalShapes{
    
    private int height;
    private int length;
    private int width;

    public QuadrilateralBase(int height, int length,int width, String name) {
        super(name);
        this.height = height;
        this.length = length;
        this.width=width;
    }
    
    
    
    
}
