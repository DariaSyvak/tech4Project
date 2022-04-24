package homeworks;

import java.util.Scanner;

public class Homework02 {

    public static void main(String[] args) {
        //Task1
    /*-Write a program that asks user to enter their first name, last
    name, age, email address, phone number, and address in
    separate statements.
    -Store these data given from user in proper data types
    -And, then print the data provided by user as below example

     */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName=input.next();
        System.out.println("Please enter your last name");
        String lastName= input.next();
        System.out.println("Please enter your age");
        int age= input.nextInt();
        System.out.println("Please enter your email");
        String emailAddress= input.next();
        input.nextLine();
        System.out.println("Please enter your phone number");
        String phoneNumber=input.nextLine();
        System.out.println("Please enter your address");
        String address =input.nextLine();
        System.out.println("\tUser who joined this program is  "+ firstName+ " "+lastName +"."+"John's age is "
                + age+"."+"John's email address is "+ emailAddress+","+"phone number "
                + phoneNumber +" ,and address is " +address);

        //Task2
        /*-Write a program that asks user their favorite book,
        color, and number in separate statements.
        -Store those data in proper data types
        -And, then print given data by user ONLY in one print
        statement but it should be in 3 separate lines as below
        -Assume user enters below info

         */
        System.out.println("Your favorite book is :");
        String favBook=input.nextLine();
        System.out.println("Your favorite color is :");
        String favColor= input.next();
        System.out.println("Yor favorite number is :");
        int favNumber=input.nextInt();
        System.out.println("\nUser's favorite book is : " +favBook+
                "\nUser's favorite color is : "+ favColor+
                "\nUser's favorite number is : "+ favNumber);






    }
}
