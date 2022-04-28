package file_handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        File myFile=new File("myFirstFile.xls");


        try {
            System.out.println("Before creating file = " + myFile.exists()); //false
            System.out.println(myFile.createNewFile());
            System.out.println("After creating file = " + myFile.exists()); //true
            System.out.println("File name is = " + myFile.getName());
            System.out.println("Absolute path of the file is = " + myFile.getAbsolutePath());
            System.out.println("Can file write = " + myFile.canWrite() );
            System.out.println("Can file read = " + myFile.canRead());
            System.out.println("Size of the file  = " + myFile.length());

            Thread.sleep(5000);

            System.out.println(myFile.delete());
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("End of the program");
    }
}
