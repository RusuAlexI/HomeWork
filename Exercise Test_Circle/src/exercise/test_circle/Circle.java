
package exercise.test_circle;


public class Circle {
    private double radius;
    private double diameter;
    private double area;

    public Circle(double radius){
    setRadius(radius);
    }
    
    public Circle() {
        setRadius(1);
    }

    public double getRadius() {
        return radius;
    }
 
    public void setRadius(double radius) {
        this.radius = radius;
        this.diameter = radius*2;
        this.area = Math.PI*(radius*radius);
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }
    
    
    
}
