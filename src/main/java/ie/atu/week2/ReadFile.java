package ie.atu.week2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String args[]) {
        readFile();
    }

    public static void readFile() {
        BufferedReader br = null;
        try{
            FileReader neverUsed=new FileReader("Stulist.txt");
            br=new BufferedReader(neverUsed);
            System.out.println("Contents of student.txt: ");
            String line;
            while((line= br.readLine())!=null){
                System.out.println(" -" + line);
            }
        }
        catch(IOException Ex){
            System.out.println("Can't find file: " + Ex.getMessage());
        }
        finally{
            if(br!=null){
                try {
                    br.close();
                } catch (IOException Ex) {
                    System.out.println("Can't close file: " + Ex.getMessage());
                }
            }
        }
    }
}
