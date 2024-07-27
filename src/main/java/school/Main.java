package school;

import school.models.Student;
import school.models.Teacher;
import school.services.SchoolService;

public class Main {
    public static void main(String[] args) {
        SchoolService schoolService = new SchoolService();

        Student student1 = new Student("Rakshith Vasudev", 20, "S001");
        Student student2 = new Student("Lizzy", 22, "S002");
        Teacher teacher1 = new Teacher("Vanderhorn", 45, "Mathematics");
        Teacher teacher2 = new Teacher("Melissa", 38, "History");

        schoolService.addStudent(student1);
        schoolService.addStudent(student2);
        schoolService.addTeacher(teacher1);
        schoolService.addTeacher(teacher2);

        schoolService.receiveFee(student1, 6000);
        schoolService.receiveFee(student2, 11000);
        schoolService.paySalary(teacher1, 10500);
        schoolService.paySalary(teacher2, 9900);

        schoolService.displayAll();

        schoolService.displayFinances();

        System.out.println("Making SCHOOL PAY SALARY----");
        System.out.println("Student's name: " + student1.getName() + " Total fees paid so far $" + student1.getTotalFeesPaid());
        System.out.println("Name of the teacher: " + teacher2.getName() + " Total salary earned so far $" + teacher2.getTotalSalaryEarned());
    }
}
