
package exercise.person.and.customer;


public class Person {
    private String personName;
    private String personAddress;
    private String personPhoneNumber;

    public Person(String personName, String personAddress, String personPhoneNumber) {
        this.personName = personName;
        this.personAddress = personAddress;
        this.personPhoneNumber = personPhoneNumber;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public String getPersonPhoneNumber() {
        return personPhoneNumber;
    }

    public void setPersonPhoneNumber(String personPhoneNumber) {
        this.personPhoneNumber = personPhoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" + "personName=" + personName + ", personAddress=" + personAddress + ", personPhoneNumber=" + personPhoneNumber + '}';
    }
    
    
    
}
