package ie.atu.week2;

import java.io.*;


//constructor
public class Student {
    public String name;
    public String email;
    public String StudentId;
    public String filename="Stulist.txt";

    public Student() {
        System.out.println();
        this.name = "";
        this.email = "";
        this.StudentId = "";


    }

    public String getName() {
        return name;
    }

    public String getEmail() {

        return email.toLowerCase();
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setName(String name) {
        if(name.length()>48){
            throw new IllegalArgumentException("Name should be less than 48 characters");
        }
        try(PrintWriter out=new PrintWriter(new FileWriter(filename, true))){
            out.println(name);
        }
        catch(IOException e){

                System.out.println("Could not write to file : "+e);
        }

        this.name = name;
    }


    public void setEmail(String email) {
        if(email.length()>48){
            throw new IllegalArgumentException("Email should be less than 48 characters");
        }
        try(PrintWriter out=new PrintWriter(new FileWriter(filename, true))){
            out.println(email);
        }
        catch(IOException e){

            System.out.println("Could not write to file : "+e);
        }
        this.email = email.toLowerCase();
    }

    public void setStudentId(String studentId) {
        if(StudentId.length()>9){
            throw new IllegalArgumentException("ID should be less than 10 characters");
        }
        try(PrintWriter out=new PrintWriter(new FileWriter(filename, true))){


            out.println(studentId);
            System.out.println("Saved to: "+filename);
        }
        catch(IOException e){

            System.out.println("Could not write to file : "+e);
        }
        this.StudentId = studentId;
    }


}
