
package exercise.methods.pkg6;

import java.util.Scanner;

public class ExerciseMethods6 {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
        Lease lease1=new Lease();  //test      
        /*System.out.println(lease1.tenantName);*/
        
        
        Lease lease2=new Lease();
        Lease lease3=new Lease();
        Lease lease4=new Lease();
        
        lease1=getData(lease1);
        lease2=getData(lease2);
        lease3=getData(lease3);
        
        showValues(lease1);
        lease1.addPetFee();
        showValues(lease1);
        showValues(lease2);
        showValues(lease3);
        showValues(lease4);
        }
        
        public static Lease getData(Lease lease){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter name:");
        lease.setTenantName(scan.nextLine());
        
        System.out.println("Enter apartment number >> ");
        lease.setApartmentNumber(scan.nextInt()); 

        System.out.println("Enter rent >> ");
        lease.setRentAmount(scan.nextFloat());

        System.out.println("Enter term >> ");
        lease.setTermOfLease(scan.nextInt());
        
        return lease;
    }
        
        public static void showValues(Lease lease){
        
        System.out.println("Lease name: "+lease.getTenantName());
        
        
        System.out.println("Lease apartment number: "+lease.getApartmentNumber());
         

        System.out.println("Lease rent: "+lease.getApartmentNumber());
        

        System.out.println("Lease term: "+lease.getTermOfLease());
        
        
        //return lease;
    }

}
