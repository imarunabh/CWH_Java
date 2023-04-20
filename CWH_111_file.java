import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CWH_111_file {
    public static void main(String[] args) {
        //Code to create a new file
        /*
        File myFile=new File("cwh111file.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file ");
            throw new RuntimeException(e);
        }

         */
        //Code to write to a file
        /*
        try {
            FileWriter fileWriter=new FileWriter("cwh111file.txt");
            fileWriter.write("This is our first file from this java course\n Okay now bye ");
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         */
        //Reading a file
        /*
        File myFile=new File("cwh111file.txt");
        try {
            Scanner sc=new Scanner(myFile);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

         */
        //Deleting a file
        File myFile=new File("cwh111file.txt");
        if(myFile.delete()){
            System.out.println("I have deleted "+myFile.getName());
        }
        else{
            System.out.println("Some problem occured while deleting the file ");
        }
    }
}
