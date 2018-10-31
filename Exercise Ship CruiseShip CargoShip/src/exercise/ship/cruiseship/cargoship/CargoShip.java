
package exercise.ship.cruiseship.cargoship;


public class CargoShip extends Ship{
    private int cargopacity;

    public CargoShip(int cargopacity, String shipName, String shipYear) {
        super(shipName, shipYear);
        this.cargopacity = cargopacity;
    }

    public int getCargopacity() {
        return cargopacity;
    }

    public void setCargopacity(int cargopacity) {
        this.cargopacity = cargopacity;
    }

    @Override
    public String toString() {
        return "CargoShip{" + "Ship's name=" + super.getShipName() +", cargopacity=" + cargopacity + '}';
    }
    
    
    
}
