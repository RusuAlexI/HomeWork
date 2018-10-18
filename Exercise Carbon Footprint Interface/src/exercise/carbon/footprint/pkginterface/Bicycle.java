package exercise.carbon.footprint.pkginterface;

public class Bicycle implements CarbonFootprint {

    private double distanceTraveled, emissionFactor;

    public Bicycle(double distanceTraveled, double emissionFactor) {
        this.distanceTraveled = distanceTraveled;
        this.emissionFactor = emissionFactor;
    }

    @Override
    public double getCarbonFootprint() {
        return ((distanceTraveled + 0) * emissionFactor);
    }
}
