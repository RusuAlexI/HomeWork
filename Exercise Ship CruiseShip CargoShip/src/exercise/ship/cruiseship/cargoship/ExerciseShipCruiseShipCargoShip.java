
package exercise.ship.cruiseship.cargoship;


public class ExerciseShipCruiseShipCargoShip {

 
    public static void main(String[] args) {
        Ship firstShip=new Ship("firstShip", "2000");
        Ship secondShip=new CargoShip(200, "second Ship", "1990");
        Ship thirdShip=new CruiseShip(1500, "thirdShipName", "1976");
        CargoShip secondCargoShip=new CargoShip(2000, "secondCargoShip", "2010");
        CruiseShip secondCruiseShip=new CruiseShip(500, "secondCruiseShip", "2007");
        System.out.println(firstShip.toString());
        System.out.println(secondShip.toString());
        System.out.println(thirdShip.toString());
        System.out.println(secondCargoShip.toString());
        System.out.println(secondCruiseShip.toString());
        
        
    }
    
}
