
package exercise.ship.lambda;


public class ExerciseShipLambda {


    public static void main(String[] args) {
        Ship firstShip=new Ship("first name", 2000);
        Ship secondShip=new Ship("second name", 1800);
        Ship thirdShip=new Ship("third name", 2005);
        Ship fourthShip=new Ship("fourth name", 2010);
        Ship fifthShip=new Ship("fifth name", 1999);
        
        
        Validate validationTest = (Ship) -> Ship.getShipYear()<2000;
        System.out.println(validationTest.check(fifthShip));
        System.out.println(validationTest.check(fourthShip));
        
    }
    
}
