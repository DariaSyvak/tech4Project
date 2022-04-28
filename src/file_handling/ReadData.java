package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {
        File file=new File("shoppingList.txt");
        try{
            FileWriter fileWriter=new FileWriter("shoppingList.txt");
            fileWriter.write("Ice-cream\n");
            fileWriter.write ("Fruits\n");
            fileWriter.write ( "Pen\n");
            fileWriter.write ( "Paper\n");
            fileWriter.write ( "Milk");
            fileWriter.close();
            Thread.sleep(10000);


            Scanner scanner=new Scanner(file);
           for(int i=1; scanner.hasNextLine();i++){
               System.out.println("Item "+i+" =" +scanner.nextLine());
           }
//            int index = 1;
//            while(scanner.hasNextLine()){
//                System.out.println("Item " + index++ + " = " + scanner.nextLine());
        }
        catch (Exception e) {
            e.printStackTrace();
        }finally {
            file.delete();
        }
        System.out.println("End of the program");
    }
}
