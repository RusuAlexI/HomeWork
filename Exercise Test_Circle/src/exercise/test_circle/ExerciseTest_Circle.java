
package exercise.test_circle;


public class ExerciseTest_Circle {


    public static void main(String[] args) {
        
        Circle defaultCircle=new Circle();
        Circle circle1=new Circle();
        Circle circle2=new Circle();
        
        circle1.setRadius(3.2);
        circle2.setRadius(10.2);
        
        System.out.println("The values for all 3 circles:");
        
        System.out.println("The values for the first circle:");
        System.out.println("The radius is "+circle1.getRadius()+
                ". The diameter is "+circle1.getDiameter()+".The area is "+circle1.getArea());
        
        System.out.println("The values for the second circle:");
        System.out.println("The radius is "+circle2.getRadius()+
                ". The diameter is "+circle2.getDiameter()+".The area is "+circle2.getArea());
        
        System.out.println("The values for the default circle:");
        System.out.println("The radius is "+defaultCircle.getRadius()+
                ". The diameter is "+defaultCircle.getDiameter()+".The area is "+defaultCircle.getArea());
    }
    
}
