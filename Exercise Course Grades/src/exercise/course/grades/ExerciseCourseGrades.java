
package exercise.course.grades;


public class ExerciseCourseGrades {


    public static void main(String[] args) {
        
                CourseGrades courseGrades = new CourseGrades();
		LabActivity lab = new LabActivity(75);
		PassFailExam passFailExam = new PassFailExam(15);
		Essay essay = new Essay(68);
		FinalExam finalExam = new FinalExam(57);
		
		courseGrades.setLab(lab);
		courseGrades.setPassFailExam(passFailExam);
		courseGrades.setEssay(essay);
		courseGrades.setFinalExam(finalExam);
		System.out.println(courseGrades.toString());
        
    }
    
}
