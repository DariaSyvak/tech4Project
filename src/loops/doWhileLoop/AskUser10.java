package loops.doWhileLoop;

import java.util.Scanner;

public class AskUser10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter number");
//        int num = input.nextInt();
//
//        while (num < 10) {
//            System.out.println("This is not more than 10");
//            System.out.println("Enter another number");
//            num = input.nextInt();
//        }
//        System.out.println("This number is more or equal to 10");36
        int number;
        do{
            System.out.println("Please enter number");
            number= input.nextInt();

        }while (number<10);
        System.out.println("Number you entered is more or equal 10");
    }
}
