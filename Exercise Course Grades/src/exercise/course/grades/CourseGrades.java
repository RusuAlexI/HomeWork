
package exercise.course.grades;


public class CourseGrades {

    private GradedActivity[] grades=new GradedActivity[4];
    
    
    
    public void setLab(GradedActivity classLab)
    {
        this.grades[0] = classLab;
    }
    
    public void setPassFailExam(PassFailExam passFailExam)
    {
        this.grades[1] = passFailExam;
    }
    
    public void setEssay(GradedActivity essay)
    {
        this.grades[2] = essay;
    }
    
    public void setFinalExam(FinalExam finalExam)
    {
        this.grades[3] = finalExam;
    }

    @Override
    public String toString() {
        return "CourseGrades{" + grades[0].toString() +", "+grades[1].toString() +", "+
                grades[2].toString() +", "+
                grades[3].toString() +", "+'}';
    }
    
    
    
    
}
