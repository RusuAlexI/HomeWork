
package exercise.ship.lambda;


public class Ship{
    private String shipName;
    private int shipYear;

    public Ship(String shipName, int shipYear) {
        this.shipName = shipName;
        this.shipYear = shipYear;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public int getShipYear() {
        return shipYear;
    }

    public void setShipYear(int shipYear) {
        this.shipYear = shipYear;
    }

    @Override
    public String toString() {
        return "Ship{shipName=" + shipName + ", shipYear=" + shipYear + '}';
    }
    
}
