package ie.atu.week2;


import static com.sun.tools.javac.util.StringUtils.toLowerCase;

public class Student {
    public String name;
    public static String email;
    public String StudentId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email.toLowerCase();
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public Student () {
        System.out.println("");
        this.name="";
        this.email="";
        this.StudentId="";


    }



}
