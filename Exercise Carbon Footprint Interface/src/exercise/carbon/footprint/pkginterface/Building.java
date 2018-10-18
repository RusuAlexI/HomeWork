package exercise.carbon.footprint.pkginterface;

public class Building implements CarbonFootprint {

    private double emissionFactor;

    public Building(double emissionFactor) {
        this.emissionFactor = emissionFactor;
    }

    @Override
    public double getCarbonFootprint() {

        return ((0 + 1) * this.emissionFactor);
    }

}
