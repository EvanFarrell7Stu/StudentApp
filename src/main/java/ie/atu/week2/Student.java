package ie.atu.week2;

//constructor
public class Student {
    public String name = "none";
    public String email = "none";
    public String StudentId;

    public Student() {
        System.out.println();
        this.name = "";
        this.email = "";
        this.StudentId = "";


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {

        return email.toLowerCase();
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


}
