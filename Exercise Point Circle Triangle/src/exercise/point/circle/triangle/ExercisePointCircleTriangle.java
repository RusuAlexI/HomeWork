
package exercise.point.circle.triangle;


public class ExercisePointCircleTriangle {


    public static void main(String[] args) {
        
       MyPoint myFirstPoint=new MyPoint(5, 4);
       MyPoint mySecondPoint=new MyPoint(8, 3);
       MyPoint myThirdPoint=new MyPoint(3, 3);
        System.out.println("First point data:"+myFirstPoint.toString());
        System.out.println("Second point data:"+mySecondPoint.toString());
        System.out.println("Third point data:"+myThirdPoint.toString());
        System.out.println("Distance from this point to a point on the (7,3) axys:"+myFirstPoint.distance(7, 3));
        System.out.println("Distance from this point to the second point:"+myFirstPoint.distance(mySecondPoint));
        System.out.println("Distance from this point to the (0,0) azts:"+myFirstPoint.distance());
        

        
        MyCircle myFirstCircle=new MyCircle();
        MyCircle mySecondCircle=new MyCircle(3, 7, 5);
        MyCircle myThirdCircle=new MyCircle(myFirstPoint, 5);
        System.out.println("First circle data:"+myFirstCircle.toString());
        System.out.println("Second circle data:"+mySecondCircle.toString());
        System.out.println("Third circle data:"+myThirdCircle.toString());
        System.out.println("Third circle area:"+myThirdCircle.getArea());
        System.out.println("Third circle circumference:"+myThirdCircle.getCircumference());
        System.out.println("Third circle distance to the second circle:"+myThirdCircle.distance(mySecondCircle));
        
        
        
        MyTriangle myFirstTriangle=new MyTriangle(myFirstPoint, mySecondPoint, myThirdPoint);
        MyTriangle mySecondTriangle=new MyTriangle(2, 2, 3, 3, 2, 4);
        System.out.println("First triangle data:"+myFirstTriangle.toString());
        System.out.println("Second triangle data:"+mySecondTriangle.toString());
        System.out.println("First triangle perimeter is "+myFirstTriangle.getPerimeter()
                            +" and the type is "+myFirstTriangle.getType());
        System.out.println("Second triangle perimeter is "+mySecondTriangle.getPerimeter()
                            +" and the type is "+mySecondTriangle.getType());
        
    }
    
}
