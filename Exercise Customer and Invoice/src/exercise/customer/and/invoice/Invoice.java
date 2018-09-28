
package exercise.customer.and.invoice;


public class Invoice {
    private int ID;
    private Customer customer;
    private double amount;
    
    public Invoice(int ID, Customer customer, double amount){
    this.ID=ID;
    this.amount=amount;
    this.customer=customer;
    }
    
    public int getID(){
    return this.ID;
    }
    
    public Customer getCustomer(){
    return this.customer;
    }
    
    public void setCustomer(Customer customer){
    this.customer=customer;
    }
    
    public double getAmount(){
    return this.amount;
    }
    
    public void setAmount(double amount){
    this.amount=amount;
    }
    
    public String getCustomerName(){
    return this.customer.getName();
    }
    
    public double getAmountAfterDiscount(){
    return amount-(amount*((double)customer.getDiscount()/100));
    }
    
    
    
}
