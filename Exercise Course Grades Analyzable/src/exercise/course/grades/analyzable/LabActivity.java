
package exercise.course.grades.analyzable;


public class LabActivity extends GradedActivity{
    public LabActivity(double score) {
        super(score);
    }

    @Override
    public String toString() {
        return "LabActivity{" +super.toString()+ '}';
    }
}
