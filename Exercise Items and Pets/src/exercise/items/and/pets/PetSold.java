
package exercise.items.and.pets;


public class PetSold extends ItemSold{

private boolean isVaccinated;
private boolean isNeutered;
private boolean isHousebroken;

    public PetSold(boolean isVaccinated, boolean isNeutered, boolean isHousebroken, int invoiceNumber, String description, double price) {
        super(invoiceNumber, description, price);
        this.isVaccinated = isVaccinated;
        this.isNeutered = isNeutered;
        this.isHousebroken = isHousebroken;
    }

    public boolean isIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public boolean isIsNeutered() {
        return isNeutered;
    }

    public void setIsNeutered(boolean isNeutered) {
        this.isNeutered = isNeutered;
    }

    public boolean isIsHousebroken() {
        return isHousebroken;
    }

    public void setIsHousebroken(boolean isHousebroken) {
        this.isHousebroken = isHousebroken;
    }

    @Override
    public String toString() {
        return super.toString()+"PetSold{" + " isVaccinated=" + isVaccinated + ", isNeutered=" + isNeutered + ", isHousebroken=" + isHousebroken + '}';
    }

    
    
    
}
