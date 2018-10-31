
package exercise.course.grades.analyzable;


public class PassFailExam extends GradedActivity{
    
    public PassFailExam(double score) {
        super(score);
    }
    
     @Override
    public String toString() {
        return "PassFailExam{" +super.toString()+ '}';
    }
}
