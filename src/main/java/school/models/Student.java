package school.models;

public class Student extends Person {
    private int totalFeesPaid;

    public Student(int id, String name) {
        super(id, name);
        this.totalFeesPaid = 0;
    }

    public int getTotalFeesPaid() {
        return totalFeesPaid;
    }

    public void payFees(int fees) {
        this.totalFeesPaid += fees;
    }

    @Override
    public String toString() {
        return super.toString() + ", Total fees paid so far: $" + totalFeesPaid;
    }
}
