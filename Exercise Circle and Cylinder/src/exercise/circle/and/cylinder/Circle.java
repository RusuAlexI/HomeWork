
package exercise.circle.and.cylinder;


public class Circle {
    
    private double radius=1.0;
    private String color="red";
    
    public Circle(){
    
    }
    
    public Circle(double radius){
    this.radius=radius;
    }
    
    public Circle(double radius, String color){
    this.color=color;
    this.radius=radius;
    }
    
    public double getRadius(){
    return this.radius;
    }
    
    public void setRadius(double radius){
    this.radius=radius;
    }
    
    public String getColor(){
    return this.color;
    }
    
    public void setColor(String color){
    this.color=color;
    }
    
    public double getArea(){
    
    return Math.PI*(this.radius*this.radius);
    }
    
    @Override
    public String toString(){
    return "Circle[radius="+this.radius+",color="+this.color+",area="+this.getArea()+"]";
    }
}
