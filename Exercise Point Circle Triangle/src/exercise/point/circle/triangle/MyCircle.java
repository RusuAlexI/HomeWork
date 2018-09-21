
package exercise.point.circle.triangle;


public class MyCircle {
    private MyPoint center=new MyPoint(0,0);
    private int radius=1;
    
    public MyCircle(){
        this.center=new MyPoint();
    }
    
    public MyCircle(int x, int y, int radius){
    this.center.setX(x);
    this.center.setY(y);
    this.radius=radius;
    }
    
    public MyCircle(MyPoint center, int radius){
    this.center=center;
    this.radius=radius;
    }
    
    public int getRadius(){
    return this.radius;
    }
    
    public void setRadius(int radius){
    this.radius=radius;
    }
    
    public MyPoint getCenter(){
    return this.center;
    }
    
    public void setCenter(MyPoint center){
    this.center=center;
    }
    
    public int getCenterX(){
    return this.center.getX();
    }
    
    public void setCenterX(int x){
    this.center.setX(x);
    }
    
    public int getCenterY(){
    return this.center.getY();
    }
    
    public void setCenterY(int y){
    this.center.setY(y);
    }
    
    public int[] getCenterXY(){
    return this.center.getXY();
    }
    
    public void setCenterXY(int x,int y){
    this.center.setXY(x,y);
    }
    
    @Override
    public String toString(){
    return "MyCircle{radius="+this.getRadius()+",center="+center.toString()+"]";
    }
    
    public double getArea(){
    return Math.PI*(this.getRadius()*this.getRadius());
    }
    
    public double getCircumference(){
    return 2*Math.PI*this.getRadius();
    }
    
    public double distance(MyCircle anotherCircle){
    return center.distance(anotherCircle.center);
    }
}
