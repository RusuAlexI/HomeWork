
package exercise.savings.account;


public class SavingsAccount {
    
    static private double annualInterestRate;
    private double savingsBallance=0;
    
    public SavingsAccount(double annualInterestRate,double savingsBallance){
    this.savingsBallance=savingsBallance;
    this.annualInterestRate=annualInterestRate/100;
    }
    
    
    public void calculateMonthlyInterest(){
        double monthlyInterest=0;
        monthlyInterest=(this.savingsBallance*this.annualInterestRate)/12;
        this.savingsBallance+=monthlyInterest;
        System.out.println("the monthly interest rate is "+monthlyInterest+", new savings ballance is "+this.savingsBallance);
    }
    
    public static void modifyInterestRate(double newAnnualInterestRate){
    annualInterestRate=newAnnualInterestRate/100;
        System.out.println("New annual interest rate is set to "+newAnnualInterestRate);
    }
}
