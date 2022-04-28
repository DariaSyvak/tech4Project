package file_handling;

import java.io.File;
import java.io.FileWriter;


public class WriteData {
    public static void main(String[] args)  {

        File studentList=new File("studentList.txt");
        try {
            studentList.createNewFile();
            Thread.sleep(5000);


            FileWriter fileWriter=new FileWriter("studentList.txt");
            fileWriter.write("Abe\n");
            fileWriter.write("Vita\n");
            fileWriter.write("Torrie\n");
            fileWriter.write("Taylor\n");
            fileWriter.close();//save

            Thread.sleep(5000);


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
           studentList.delete();
        }
        System.out.println("End of the program");
    }

}
