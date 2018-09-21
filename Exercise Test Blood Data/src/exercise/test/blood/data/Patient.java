
package exercise.test.blood.data;


public class Patient{
    private int idNumber;
    private int age;
    private BloodData bloodData; 

    public Patient() {
        this.bloodData = new BloodData();
        this.idNumber = 0;
        this.age = 0;
    }

    public Patient(int idNumber, int age, BloodData bloodData) {
        bloodData =new BloodData("O",'+');
        this.bloodData = bloodData;
        this.idNumber = idNumber;
        this.age = age;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }
    
   public void setIdNumber(int idNumber){
   this.idNumber=idNumber;
   } 
   
   public void setAge(int age){
   this.age=age;
   }
   
   
   public void setBloodData(BloodData bloodData){
   
       this.bloodData=bloodData;
   }
   
   public BloodData getBloodData(){
   return bloodData;
   }
   
    @Override
    public String toString() {
        return this.age+" "+this.bloodData.getBloodType()+" "+this.idNumber; 
    }
   
   
}

