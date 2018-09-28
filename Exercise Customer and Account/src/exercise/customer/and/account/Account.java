
package exercise.customer.and.account;


public class Account {
    
    private int ID;
    private Customer customer;
    private double balance=0.0;
    
    
    public Account(int ID, Customer customer, double balance){
    this.ID=ID;
    this.balance=balance;
    this.customer=customer;
    }
    
    public Account(int ID, Customer customer){
    this.ID=ID;
    this.customer=customer;
    }
    
    public int getID(){
    return this.ID;
    }
    
    public Customer getCustomer(){
    return this.customer;
    }
    
    public double getBalance(){
    return this.balance;
    }
    
    public void setBalance(double balance){
    this.balance=balance;
    }
    
    @Override
    public String toString(){
    return this.customer.toString()+" balance=$"+this.balance;
    }
    
    public String getCustomerName(){
    return this.customer.getName();
    }
    
    public Account deposit(double amount){
        this.balance+=amount;
        return this;
    }
    
    public Account withdraw(double amount){
    if (this.balance>amount) this.balance-=amount; else
            System.out.println("amount withdrawal exceeds the current ballance!");
    return this;
    }
}
