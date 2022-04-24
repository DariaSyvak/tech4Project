package scanner;
import java.util.Scanner;

public class LearningScannerPrimitiveMethods {
    public static void main(String[] args) {
        /* How to use Scanner methods
        1.Create an object of Scanner(import the class as well)
        ClassName/DataType variableName/objectName= new ClassName/DataType(if it is needed);
        2.variableName/objectName.methodName(if is needed parameter);
        */
        /*task-1
        1.Ask user to enter age
        2.Print a question
        3.Use the proper next method(next int)
        4.Print out the users age
        */
        Scanner collect= new Scanner(System.in);
        System.out.println("What is your age?");
        int userAge=collect.nextInt();
        System.out.println("User age is= " + userAge);
        /*Ask for account balance of the user
        Get the account balance and store it
         */
        System.out.println("What is your accout balance?");
        double accountBalance=collect.nextDouble();
        System.out.println("\n\t\'User balance is\' =\"$" +accountBalance +"\"");
        /*Ask for user you understanding this java class today?
        Get the answer and store it
        Print the answer
         */
        System.out.println("Do you understand this class?");
        boolean answer= collect.nextBoolean();
        System.out.println("Do you understand this class? = \""+ answer +"\"");
    }


}
