package ifElseStatement.ifStatement;

import java.util.Scanner;

public class RetiredExample {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your age");
        int age =input.nextInt();
        if (age>=55) {
            System.out.println("It is your time to get retired");
        }else{
            System.out.println("You are not retired ");
        }


    }
}
