
package exercise.savings.account;


public class ExerciseSavingsAccount {


    public static void main(String[] args) {
        
        SavingsAccount saver1=new SavingsAccount(4, 2000);
        SavingsAccount saver2=new SavingsAccount(4, 3000);
        
        for(int i=0;i<12;i++){
        saver1.calculateMonthlyInterest();
        }
        
        for(int i=0;i<12;i++){
        saver2.calculateMonthlyInterest();
        }
        
        saver1.modifyInterestRate(5);
        saver2.modifyInterestRate(5);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
    }
    
}
