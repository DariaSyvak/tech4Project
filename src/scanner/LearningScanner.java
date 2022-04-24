package scanner;

import java.util.Scanner;

public class LearningScanner {
    public static void main(String[] args) {
        /*
        1.Im going to use Scanner class for creating my object
        2. I will use the object for reading the data

         */
        Scanner scanner = new Scanner(System.in);//creating a scanner object for using the method
        System.out.println("pls put your first name" );//this is what i want user to put
        String firstNme = scanner.next();//storing the first name for user
        System.out.println("pls put your last name");
        String lastName = scanner.next();
        System.out.println("First name=" + firstNme);//printing my object /variable
        System.out.println("Last name="+ lastName );



    }
}
