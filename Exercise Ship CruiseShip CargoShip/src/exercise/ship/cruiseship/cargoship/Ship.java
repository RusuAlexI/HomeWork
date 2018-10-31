
package exercise.ship.cruiseship.cargoship;


public class Ship {
    private String shipName;
    private String shipYear;

    public Ship(String shipName, String shipYear) {
        this.shipName = shipName;
        this.shipYear = shipYear;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipYear() {
        return shipYear;
    }

    public void setShipYear(String shipYear) {
        this.shipYear = shipYear;
    }

    @Override
    public String toString() {
        return "Ship{shipName=" + shipName + ", shipYear=" + shipYear + '}';
    }
    
    
    
}
