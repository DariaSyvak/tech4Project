package loops;

import utilities.ScannerHelper;

import java.util.Scanner;

public class AskForNumberDividedBy5 {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     int number;
       do{
           System.out.println("Please enter a number");
           number=scan.nextInt();
           if (number% 5!=0) System.out.println("This number is not dividable by 5");
       }while (number%5!=0);

        System.out.println("This number is dividable by 5");
    }
}
