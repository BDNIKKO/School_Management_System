package school;

import school.models.Student;
import school.models.Teacher;
import school.services.SchoolService;

public class Main {
    public static void main(String[] args) {
        SchoolService schoolService = new SchoolService();

        Student student1 = new Student(1, "Rakshith Vasudev");
        Student student2 = new Student(2, "Lizzy");
        Teacher teacher1 = new Teacher(1, "Vanderhorn", 1050);
        Teacher teacher2 = new Teacher(2, "Melissa", 700);
        Teacher teacher3 = new Teacher(6, "Megan", 900);

        schoolService.addStudent(student1);
        schoolService.addStudent(student2);
        schoolService.addTeacher(teacher1);
        schoolService.addTeacher(teacher2);
        schoolService.addTeacher(teacher3);

        schoolService.receiveFee(student1, 6000);
        schoolService.receiveFee(student2, 11000);
        schoolService.paySalary(teacher1, 1050);
        schoolService.paySalary(teacher2, 700);
        schoolService.paySalary(teacher3, 900);

        System.out.println("GHS has earned $17000");
        System.out.println("GHS has spent for salary to Lizzy and now has $" + (17000 - 1050));
        System.out.println("GHS has spent for salary to Vanderhorn and now has $" + (17000 - 1050 - 700));
        System.out.println("GHS has spent for salary to Megan and now has $" + (17000 - 1050 - 700 - 900));

        System.out.println("----Making SCHOOL PAY SALARY----");
        System.out.println("Student's name: " + student1.getName() + " Total fees paid so far $" + student1.getTotalFeesPaid());
        System.out.println("Name of the teacher: " + teacher2.getName() + " Total salary earned so far $" + teacher2.getTotalSalaryEarned());
    }
}
