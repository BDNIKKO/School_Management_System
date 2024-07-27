package school.models;

public class Teacher extends Person {
    private int salary;
    private int totalSalaryEarned;

    public Teacher(int id, String name, int salary) {
        super(id, name);
        this.salary = salary;
        this.totalSalaryEarned = 0;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getTotalSalaryEarned() {
        return totalSalaryEarned;
    }

    public void receiveSalary(int salary) {
        this.totalSalaryEarned += salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: $" + salary + ", Total salary earned so far: $" + totalSalaryEarned;
    }
}
