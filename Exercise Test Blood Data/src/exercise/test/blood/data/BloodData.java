
package exercise.test.blood.data;


public class BloodData {
    private String bloodType;
    private char rhFactor;

    public BloodData() {
        this.bloodType = "O";
        this.rhFactor = '+';
    }

    public BloodData(String bloodType, char rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public char getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(char rhFactor) {
        this.rhFactor = rhFactor;
    }
    
    
        
    
}
