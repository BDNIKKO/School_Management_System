package school.models;

public class Teacher extends Person {
    private int id;
    private String subject;
    private int totalSalaryEarned;

    public Teacher(int id, String name, int age, String subject) {
        super(name, age);
        this.id = id;
        this.subject = subject;
        this.totalSalaryEarned = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getTotalSalaryEarned() {
        return totalSalaryEarned;
    }

    public void receiveSalary(int salary) {
        this.totalSalaryEarned += salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject + ", Total salary earned so far: $" + totalSalaryEarned;
    }
}
