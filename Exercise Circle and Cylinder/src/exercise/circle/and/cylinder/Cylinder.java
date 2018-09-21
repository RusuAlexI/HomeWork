
package exercise.circle.and.cylinder;


public class Cylinder extends Circle{
    private double height=1.0;
    
    public Cylinder(){
    
    }
    
    public Cylinder(double radius){
    Cylinder.this.setRadius(radius);
    //super.setRadius(radius);
    }
    
    public Cylinder(double radius, double height){
    Cylinder.this.setRadius(radius);
    this.height=height;
    //super.setRadius(radius);
    }
    
    public Cylinder(double radius, double height, String color){
    Cylinder.this.setRadius(radius);
    this.height=height;
    Cylinder.this.setColor(color);
    //super.setRadius(radius);
    }
    
    public double getHeight(){
    return this.height;
    }
    
    public void setheight(double height){
    this.height=height;
    }
    
    public double getVolume(){
        
    return Math.PI*(Cylinder.this.getRadius()*Cylinder.this.getRadius())*this.height;
    }
    
    @Override
    public String toString(){
    return "Cylinder[radius="+this.getRadius()+",color="+this.getColor()+",height="
        +this.height+",volume="+this.getVolume()+"]";
    }
}
