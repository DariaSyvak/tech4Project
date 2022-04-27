package exceptions;

import java.util.ArrayList;

public class FinallyBlock {
    public static void main(String[] args) {

           try{ ArrayList<String>obj=new ArrayList<>();
            obj.add("computer");
            obj.add("mouse");
            obj.add("mousePad");

            for (String s : obj) {
                obj.remove(s);
            }

            }catch (Exception x){
               x.printStackTrace();
           }
           finally{
               System.out.println("Here is the report ");
           }
        System.out.println("End of the program");
    }
}
