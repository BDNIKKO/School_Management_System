package school.services;

import school.models.Student;
import school.models.Teacher;

import java.util.ArrayList;
import java.util.List;

public class SchoolService {
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private int totalMoneyEarned;
    private int totalMoneySpent;

    public SchoolService() {
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void receiveFee(Student student, int fee) {
        totalMoneyEarned += fee;
        student.payFees(fee);
    }

    public void paySalary(Teacher teacher, int salary) {
        totalMoneySpent += salary;
        teacher.receiveSalary(salary);
    }

    public void displayAll() {
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("Teachers:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void displayFinances() {
        System.out.println("GHS has earned $" + totalMoneyEarned);
        System.out.println("GHS has spent for salary to Lizzy and now has $" + (totalMoneyEarned - totalMoneySpent));
    }
}
