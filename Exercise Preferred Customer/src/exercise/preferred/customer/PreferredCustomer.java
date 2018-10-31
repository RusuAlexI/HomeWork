
package exercise.preferred.customer;


public class PreferredCustomer extends Customer{
    private int amountOfPurchases;
    private int discountLevel;

    public PreferredCustomer(int amountOfPurchases, int customerNumber, boolean onMailingLust, String personName, String personAddress, String personPhoneNumber) {
        super(customerNumber, onMailingLust, personName, personAddress, personPhoneNumber);
        this.amountOfPurchases = amountOfPurchases;
        this.discountLevel =getDiscountLevel(amountOfPurchases);
    }

    public int getAmountOfPurchases() {
        return this.amountOfPurchases;
    }

    public void setAmountOfPurchases(int amountOfPurchases) {
        this.amountOfPurchases = amountOfPurchases;
    }

    public int getDiscountLevel(int amountOfPurchases) {

        switch (amountOfPurchases) {
            case 2000:
                this.discountLevel = 10;
                break;
            case 1500:
                this.discountLevel = 7;
                break;
            case 1000:
                this.discountLevel = 6;
                break;
            case 500:
                this.discountLevel = 5;
                break;
            default:
                this.discountLevel = 0;
                break;
        }
        return this.discountLevel;
    }

    @Override
    public String toString() {
        return super.toString()+"PreferredCustomer{" + "amountOfPurchases=" + amountOfPurchases + ", discountLevel=" + discountLevel + '}';
    }

    
    
    
    
}
