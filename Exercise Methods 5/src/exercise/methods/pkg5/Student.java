package exercise.methods.pkg5;

public class Student {

    private int idNumber;
    private int creditHours;
    private int pointsEarned;
    private double gradeAverage;

    public Student() {
        this(1, 1, 1);
    }

    public Student(int idNumber, int creditHours, int pointsEarned) {
        this.idNumber = idNumber;
        this.creditHours = creditHours;
        this.pointsEarned = pointsEarned;
        this.computeGradeAverage();
    }

    public float gradePointAverage(float Points, float CreditHours) {
        float GradeAverage = Points / CreditHours;
        return GradeAverage;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }

    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }

    public double getGradeAverage() {
        return this.gradeAverage;
    }

    public void computeGradeAverage() {
        this.gradeAverage = (double) pointsEarned / creditHours;
    }

    @Override
    public String toString() {
        return "IdNumber = " + idNumber + ", PointsEarned = " + pointsEarned + ", CreditHours = " + creditHours + ", GradeAverage = " + gradeAverage;
    }

}
