
package exercise.person.and.customer;


public class Customer extends Person{
    
    private int customerNumber;
    private boolean onMailingLust;

    public Customer(int customerNumber, boolean onMailingLust, String personName, String personAddress, String personPhoneNumber) {
        super(personName, personAddress, personPhoneNumber);
        this.customerNumber = customerNumber;
        this.onMailingLust = onMailingLust;
    }
    
    

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isOnMailingLust() {
        return onMailingLust;
    }

    public void setOnMailingLust(boolean onMailingLust) {
        this.onMailingLust = onMailingLust;
    }

    @Override
    public String toString() {
        return super.toString()+", Customer{" + "customerNumber=" + customerNumber + ", onMailingLust=" + onMailingLust + '}';
    }
    
    
    
}
