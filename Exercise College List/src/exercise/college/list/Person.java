
package exercise.college.list;
import java.util.Scanner;

public class Person {
    Scanner scan=new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String zipCode;
    private String phoneNumber;
    
    public void setData(){
        System.out.println("Please type the first name:");
        this.firstName=scan.nextLine();
        System.out.println("Please type the last name:");
        this.lastName=scan.nextLine();
        System.out.println("Please type the street address:");
        this.streetAddress=scan.nextLine();
        System.out.println("Please type the zip code:");
        this.zipCode=scan.nextLine();
        System.out.println("Please type the phone number:");
        this.phoneNumber=scan.nextLine();
    }
    
    public void displayInformation(){
        System.out.println("Name: " + this.lastName + ", " + this.firstName +
                ", Zip code: " + this.zipCode +
                ", phone number: " + this.phoneNumber+
                ", streetAddress: " + this.streetAddress);
    }
    
}
