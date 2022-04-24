package ifElseStatement.ifElseStatement;

import java.util.Scanner;

public class MathGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name= input.nextLine();
        System.out.println(" Hey "+name+"! Please enter your balance?");
        double answer = input.nextDouble();
        if (answer >= 600.0) {
            System.out.println(" Awesome! You have enough money !");
        } else {
            System.out.println("Sorry ,no money!");

        }
    }
}
