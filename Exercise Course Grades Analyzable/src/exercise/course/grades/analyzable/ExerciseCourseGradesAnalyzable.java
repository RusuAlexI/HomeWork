
package exercise.course.grades.analyzable;


public class ExerciseCourseGradesAnalyzable {


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
                System.out.println("Average grade is "+courseGrades.getAverage());
                System.out.println(courseGrades.getHighest());
                System.out.println(courseGrades.getLowest());
                
    }
    
}
