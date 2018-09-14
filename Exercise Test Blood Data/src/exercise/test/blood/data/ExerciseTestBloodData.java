
package exercise.test.blood.data;


public class ExerciseTestBloodData {


    public static void main(String[] args) {
        BloodData bloodData1=new BloodData();
        BloodData bloodData2=new BloodData("A", '+');
        
        System.out.println("Blood data 1 is: "+bloodData1.getBloodType()+" "+bloodData1.getRhFactor());
        System.out.println("Blood data 2 is: "+bloodData2.getBloodType()+" "+bloodData2.getRhFactor());
        
        Patient patient1=new Patient(1, 18, "0", '+');
        System.out.println("Patient data 1 is: Age - "+patient1.getAge()+" Blood type - "+
                patient1.getBloodType()+" ID number - "+patient1.getIdNumber()+
                " Rh factor "+patient1.getRhFactor());
        
        Patient patient2=new Patient();
        System.out.println("Patient data 1 is: Age - "+patient2.getAge()+" Blood type - "+
                patient2.getBloodType()+" ID number - "+patient2.getIdNumber()+
                " Rh factor "+patient2.getRhFactor());
    }
    
}
