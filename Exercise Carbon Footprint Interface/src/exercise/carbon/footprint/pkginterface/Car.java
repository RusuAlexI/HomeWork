
package exercise.carbon.footprint.pkginterface;


public class Car implements CarbonFootprint{

    private double distanceTraveled,  fuelUsage,  emissionFactor;

    public Car(double distanceTraveled, double fuelUsage, double emissionFactor) {
        this.distanceTraveled = distanceTraveled;
        this.fuelUsage = fuelUsage;
        this.emissionFactor = emissionFactor;
    }
    
    

    @Override
    public double getCarbonFootprint() {
        return ((distanceTraveled + fuelUsage) * emissionFactor);
    }
    
    
    
}
