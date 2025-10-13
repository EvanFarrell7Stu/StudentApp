package ie.atu.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);//initialises scanner sc
        List<Student> studentsList = new ArrayList<Student>();//create arraylist called studentlist
        Student student1;

        System.out.println("Please enter the amount of students: ");//get number of entries
        int totalStudents = sc.nextInt();
        sc.nextLine();
        while (count < totalStudents) {

            // 1.Prompt for details
            System.out.println("Please enter students name: ");
            String name = sc.nextLine();
            System.out.println("Please enter students email");
            String email = sc.nextLine();
            //1.1 Check for duplicate email
            for (int i = 0; i < studentsList.size(); i++) {//indexes array list
                Student studentEntry = studentsList.get(i);//gets student from Arraylist
                String emailEntry = studentEntry.getEmail();//gets email from studentEntry
                while (emailEntry.compareTo(email.toLowerCase()) == 0) {//compares to new input
                    System.out.println("Student " + email + " is already taken");
                    System.out.println("Please enter a different email");
                    email = sc.nextLine();
                }
            }
            System.out.println("Please enter students id");
            String studentId = sc.nextLine();

            //2. Set details
            student1 = new Student();
            student1.setName(name);
            student1.setEmail(email);
            student1.setStudentId(studentId);

            studentsList.add(student1);
            count++;

        }

//3. Print data
        System.out.println("Student list\n3");
        for (Student student : studentsList) {
            System.out.println("Name:" + student.getName() + "\tEmail: " + student.getEmail() + "\tStudentId: " + student.getStudentId());
        }


    }
}