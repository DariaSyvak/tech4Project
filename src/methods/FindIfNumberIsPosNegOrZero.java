package methods;

import utilities.MathHelper;
import utilities.ScannerHelper;



public class FindIfNumberIsPosNegOrZero {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        int number= input.nextInt();
//        System.out.println("Enter your number");
        int number = ScannerHelper.getNumberFromUser();

        if (MathHelper.isPositive(number)) {
            System.out.println(number + " Positive");
        } else if (MathHelper.isZero(number)) {
            System.out.println(number + " Zero");
        } else {
            System.out.println(number + " Negative");
        }
        System.out.println("End of program");
    }
}