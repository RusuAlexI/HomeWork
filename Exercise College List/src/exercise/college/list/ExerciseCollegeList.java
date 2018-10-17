package exercise.college.list;

import java.util.Scanner;
import java.util.Arrays;

public class ExerciseCollegeList {

    public static void main(String[] args) {
        int collegeEmployeeIndex = 0;
        int facultyIndex = 0;
        int studentIndex = 0;
        Scanner scan = new Scanner(System.in);
        CollegeEmployee[] collegeEmployeeArray = new CollegeEmployee[4];
        Faculty[] facultyArray = new Faculty[3];
        Student[] studentArray = new Student[7];
        String contr = "y";

        for (int x = 0; x < collegeEmployeeArray.length; x++) {
            collegeEmployeeArray[x] = new CollegeEmployee();
        }

        for (int y = 0; y < facultyArray.length; y++) {
            facultyArray[y] = new Faculty();
        }

        for (int z = 0; z < studentArray.length; z++) {
            studentArray[z] = new Student();
        }
        
        
        System.out.println("Which type of person's data will be entered: (C)ollege employee, (F)aculty or (S)tudent (q to quit):");

        String choice = scan.nextLine();
        int help = 1;
        while (help != 0) {

            switch (choice) {
                
                case "f":
                case "F":
                    if (facultyIndex == 3) {
                        System.out.println("You entered the maximum elements for this array.");
                        System.out.println("Which type of person's data will be entered: (C)ollege employee, (F)aculty or (S)tudent (q to quit):");
                        choice = scan.nextLine();
                        break;
                    } else {
                        facultyArray[facultyIndex].setData();
                        facultyIndex++;
                        System.out.println("Which type of person's data will be entered: (C)ollege employee, (F)aculty or (S)tudent (q to quit):");
                        choice = scan.nextLine();
                        break;
                    }
                    
                case "c":     
                case "C":
                    if (collegeEmployeeIndex == 4) {
                        System.out.println("You entered the maximum elements for this array.");
                        System.out.println("Which type of person's data will be entered: (C)ollege employee, (F)aculty or (S)tudent (q to quit):");
                        choice = scan.nextLine();
                        break;
                    } else {
                        collegeEmployeeArray[collegeEmployeeIndex].setData();
                        collegeEmployeeIndex++;
                        System.out.println("Which type of person's data will be entered: (C)ollege employee, (F)aculty or (S)tudent (q to quit):");
                        choice = scan.nextLine();
                        break;
                    }
                    
                case "s":    
                case "S":
                    if (studentIndex == 7) {
                        System.out.println("You entered the maximum elements for this array.");
                        System.out.println("Which type of person's data will be entered: (C)ollege employee, (F)aculty or (S)tudent (q to quit):");
                        choice = scan.nextLine();
                        break;
                    } else {
                        studentArray[studentIndex].setData();
                        studentIndex++;
                        System.out.println("Which type of person's data will be entered: (C)ollege employee, (F)aculty or (S)tudent (q to quit):");
                        choice = scan.nextLine();
                        break;
                    }

                case "q":
                    if (collegeEmployeeIndex == 4){
                    System.out.println("Employee:");
                    for(int i=0; i<collegeEmployeeArray.length;i++){
                        collegeEmployeeArray[i].displayInformation();
                    }}else System.out.println("You haven't entered enough information about college Employees");
                    
                    if (facultyIndex == 3){
                    System.out.println("Faculty:");
                    for(int i=0; i<facultyArray.length;i++){
                        facultyArray[i].displayInformation();
                    }} else System.out.println("You haven't entered enough information about Faculty");
                    
                    if (studentIndex == 7){
                    System.out.println("Student");
                    for(int i=0; i<studentArray.length;i++){
                        studentArray[i].displayInformation();
                    }} else System.out.println("You haven't entered enough information about Student");
                    
                    help = 0;
            }
            
        }
    }

}
