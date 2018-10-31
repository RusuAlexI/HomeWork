
package exercise.course.grades.analyzable;


public class CourseGrades implements Analyzable{
    
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
    
    public double getAverage(){
		double sum = 0;
		int count = 0;
		
		for(GradedActivity assignment : grades)
		{
			sum += assignment.getGrade();
			count++;
		}
		
		return sum/count;
	}
    public GradedActivity getHighest()
	{
		GradedActivity highest = grades[0];
		
		for(GradedActivity assignment : grades)
		{
			if(assignment.getGrade() > highest.getGrade())
			{
				highest = assignment;
			}
		}
		
		return highest;
	}

    public GradedActivity getLowest()
	{
		GradedActivity lowest = grades[0];
		
		for(GradedActivity assignment : grades)
		{
			if(assignment.getGrade() < lowest.getGrade())
			{
				lowest = assignment;
			}
		}
		
		return lowest;
	}
    
    @Override
    public String toString() {
        return "CourseGrades{" + grades[0].toString() +", "+grades[1].toString() +", "+
                grades[2].toString() +", "+
                grades[3].toString() +", "+'}';
    }
    
}
