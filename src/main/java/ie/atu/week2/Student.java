package ie.atu.week2;

public class Student {
    public String name;
    public String email;
    public String StudentId;

    public Student () {
        System.out.println("");
        this.name="";
        this.email="";
        this.StudentId="";


    }

    public void setName(String name) { this.name=name; }
    public void setEmail(String email) { this.email=email; }
    public void setStudentId(String StudentId) { this.StudentId=StudentId; }



}
