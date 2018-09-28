
package exercise.customer.and.invoice;


public class Customer {
    private int ID;
    private String name;
    private int discount;
    
    public Customer(int ID, String name ,int discount){
    this.ID=ID;
    this.discount=discount;
    this.name=name;
    }
    
    public int getID(){
    return this.ID;
    }
    
    public String getName(){
    return this.name;
    }
    
    public int getDiscount(){
    return this.discount;
    }
    
    public void setDiscount(int discount){
    this.discount=discount;
    }
    
    @Override
    public String toString(){
    return this.name+"("+this.ID+")";
    }
}
