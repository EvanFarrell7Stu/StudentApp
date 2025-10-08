package ie.atu.week2;

import ie.atu.week2.Student;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentApp {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<Student>();
        Student student1;

        System.out.println("Please enter the amount of students: ");
        int totalStudents = sc.nextInt();
        sc.nextLine();
        while (count < totalStudents)
        {

            // 1.Prompt for details
            System.out.println("Please enter students name: ");
            String name = sc.nextLine();
            System.out.println("Please enter students email");
            String email = sc.nextLine();
            System.out.println("Please enter students id");
            String studentId = sc.nextLine();
            student1 = new Student();
            student1.setName(name);
            student1.setEmail(email);
            student1.setStudentId(studentId);
            studentsList.add(student1);
            count++;
        }

for(Student student : studentsList) {
    System.out.println("Name:" + student.getName() + " Email: " + student.getEmail() + " StudentId: " + student.getStudentId());
}



    }
}