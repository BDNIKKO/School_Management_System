package school.models;

public class Student extends Person {
    private String studentId;
    private int totalFeesPaid;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
        this.totalFeesPaid = 0;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getTotalFeesPaid() {
        return totalFeesPaid;
    }

    public void payFees(int fees) {
        this.totalFeesPaid += fees;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentId + ", Total fees paid so far: $" + totalFeesPaid;
    }
}
