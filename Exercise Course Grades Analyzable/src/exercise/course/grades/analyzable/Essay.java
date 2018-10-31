
package exercise.course.grades.analyzable;


public class Essay extends GradedActivity{
    
    public Essay(double score) {
        super(score);
    }
    
     @Override
    public String toString() {
        return "Essay{" +super.toString()+ '}';
    }
    
}
