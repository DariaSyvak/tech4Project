package ifElseStatement.ifStatement;

import java.util.Scanner;

public class EvenExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number?");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number you entered is even!");
        } else {
            System.out.println("Number is odd");
        }
    }
}