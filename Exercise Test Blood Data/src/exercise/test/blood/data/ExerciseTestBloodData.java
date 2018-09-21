
package exercise.test.blood.data;


public class ExerciseTestBloodData {


    public static void main(String[] args) {
        BloodData bloodData1=new BloodData();
        BloodData bloodData2=new BloodData("A", '+');
        
        System.out.println("Blood data 1 is: "+bloodData1.getBloodType()+" "+bloodData1.getRhFactor());
        System.out.println("Blood data 2 is: "+bloodData2.getBloodType()+" "+bloodData2.getRhFactor());
        
        Patient patient1=new Patient(1, 18, bloodData1);
        /*System.out.println("Patient 1 data is: Age - "+patient1.getAge()+" Blood type - "+
                patient1.getBloodData()+" ID number - "+patient1.getIdNumber()
               );*/System.out.println(patient1);
        
        Patient patient2=new Patient();
        /*System.out.println("Patient 2 data is: Age - "+patient2.getAge()+" Blood type - "+
                patient2.getBloodData()+" ID number - "+patient2.getIdNumber());*/
        System.out.println(patient2);
    }
    
}


//make toString