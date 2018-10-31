
package exercise.course.grades;


public class GradedActivity {
    private double score;

    public GradedActivity(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double s) {
        this.score = s;
    }
    
    public int getGrade()
   {
      int grade;   

      if (score >= 9 && score < 10)
         grade = 9;
      else if (score >= 8 && score < 9 )
         grade = 8;
      else if (score >= 7 && score < 8)
         grade = 7;
      else if (score >= 6 && score < 7)
         grade = 6;
      else
         grade = 5;

      return grade;
   }

    @Override
    public String toString() {
        return "GradedActivity{" + "score=" + score + '}';
    }
    
    
}
