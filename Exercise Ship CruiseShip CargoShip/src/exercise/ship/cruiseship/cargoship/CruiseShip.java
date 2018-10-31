
package exercise.ship.cruiseship.cargoship;


public class CruiseShip extends Ship{
    
    private int maximumNumberOfPassengers;

    public CruiseShip(int maximumNumberOfPassengers, String shipName, String shipYear) {
        super(shipName, shipYear);
        this.maximumNumberOfPassengers = maximumNumberOfPassengers;
    }

    public int getMaximumNumberOfPassengers() {
        return maximumNumberOfPassengers;
    }

    public void setMaximumNumberOfPassengers(int maximumNumberOfPassengers) {
        this.maximumNumberOfPassengers = maximumNumberOfPassengers;
    }

    @Override
    public String toString() {
        return "CruiseShip{" + "maximumNumberOfPassengers=" + maximumNumberOfPassengers
                + ", ship's name=" + super.getShipName()+ '}';
    }
    
    
   
    
}
