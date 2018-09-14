
package exercise.test.blood.data;


public class Patient extends BloodData{
    private int idNumber;
    private int age;

    public Patient() {
        super();
        this.idNumber = 0;
        this.age = 0;
    }

    public Patient(int idNumber, int age, String bloodType, char rhFactor) {
        super(bloodType, rhFactor);
        this.idNumber = idNumber;
        this.age = age;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }
    
    
}
