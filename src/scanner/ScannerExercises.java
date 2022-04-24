package scanner;

import java.util.Scanner;

public class ScannerExercises {
    public static void main(String[] args) {
         /*
        1.Im going to use Scanner class for creating my object
        2. I will use the object for reading the data

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName=input.next();
        System.out.println("Please enter your last name");
        String lastName= input.next();
        System.out.println("first name and last name of user is ="+ firstName+" "+ lastName);


        /*Pseudo code
        1.Create an object of Scanner
        2.Print out the question
        3.Get the adress by the next line
        4.Print out the adress


         */
        Scanner adress=new Scanner(System.in);
        System.out.println("What is your adress?");
        input.nextLine();
        String myAdress=adress.nextLine();
        System.out.println("User adress is = "+ myAdress);

    }
}

