
package exercise.shapes;


public class Pyramid extends OtherPolygonBase{
    

    private int pointHeight;

    public Pyramid(int numberOfSides, int pointHeight, String name) {
        super(numberOfSides, "Pyramid");
        this.pointHeight = pointHeight;
    }
    
    
}
