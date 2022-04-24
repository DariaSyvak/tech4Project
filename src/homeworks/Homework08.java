package homeworks;

import utilities.MyMethod;
import utilities.RandomNumberGenerator;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {


        //Task 1
        int number = RandomNumberGenerator.getRandomNumber(0, 50);

        if (10 <= number && number <= 25) System.out.println("Number " + number + "  in between 10 and 25, its true");
        else System.out.println("False.Number is not between 10 and 25");
        System.out.println((10 <= number && number <= 25) ? "Number between 10 and 25, its true" :
                " Number is not between 10 and 25");



        //Task 2

//        int number2 = (int) (Math.random() * 101);
//
//        if (1 <= number2 & number2 <= 50) {
//            System.out.println(number2 + " is the 1st half");
//        } else {
//            System.out.println(number2 + " is 2nd half");
//        }
//        if (1 <= number2 & number2 <= 25) {
//            System.out.println(number2 + " is 1st quarter");
//        } else if (26 <= number2 & number2 <= 50) {
//            System.out.println(number2 + " is 2nd quarter");
//        } else if (51 <= number2 & number2 <= 75) {
//            System.out.println(number2 + " is 3rd quarter");
//        } else {
//            System.out.println(number2 + " is 4th quarter");}
//            MyMethod.printHalfAndQuarter(101);
        int n = (int) (Math.random() * 101);
        if (n <= 50) {
            System.out.println(n + " is in the 1st half");

            if (n <= 25) {
                System.out.println(n + " is in the 1st quarter");
            } else {
                System.out.println(n + " is in the 2nd quarter");
            }
        } else {
            System.out.println(n + " is in the 2nd half");

            if (n <= 75) {
                System.out.println(n + " is in the 3rd quarter");
            } else {
                System.out.println(n + " is in the 4th quarter");
            }


            //Task 3

            Scanner input = new Scanner(System.in);

            System.out.println("Please enter five numbers between 1 to 10");
            int n1 = input.nextInt(), n2 = input.nextInt(), n3 = input.nextInt(),
                    n4 = input.nextInt(), n5 = input.nextInt();
            int points = 0;
            if (1 <= n1 && n1 <= 10) {
                points += n1 * 5;
            }
            if (1 <= n2 && n2 <= 10) {
                points += n2 * 4;
            }
            if (1 <= n3 && n3 <= 10) {
                points += n3 * 3;
            }
            if (1 <= n4 && n4 <= 10) {
                points += n4 * 2;
            }
            if (1 <= n5 && n5 <= 10) {
                points += n1;
            }
            System.out.println(points);

//        if (1<=n1&&n1<=10){
//            System.out.println(n1*=5);}
//            else if (!(1<=n1&&n1<=10)){
//            System.out.println(n1*=0);}
//        if(1<=n2&&n2<=10) {
//            System.out.println(n2*=4);}
//        else if(!(1<=n2&&n2<=10)){
//            System.out.println(n2*=0);}
//        if (1<=n3&&n3<=10) {
//            System.out.println(n3*=3);}
//        else if(!(1<=n3&&n3<=10)){
//            System.out.println(n3*=0);}
//        if(1<=n4&&n4<=10) {
//            System.out.println(n4*=2);}
//        else if(!(1<=n4&&n4<=10)){
//            System.out.println(n4*=0);}
//        if(1<=n5&&n5<=10) {
//            System.out.println(n5 *=1);}
//        else {System.out.println(n5*=0);}
//
//        System.out.println(n1+n2+n3+n4+n5);
//            int n = (int) (Math.random() * 101);
//            if (n <= 50) {
//                System.out.println(n + " is in the 1st half");
//
//                if (n <= 25) {
//                    System.out.println(n + " is in the 1st quarter");
//                } else {
//                    System.out.println(n + " is in the 2nd quarter");
//                }
//            } else {
//                System.out.println(n + " is in the 2nd half");
//
//                if (n <= 75) {
//                    System.out.println(n + " is in the 3rd quarter");
//                } else {
//                    System.out.println(n + " is in the 4th quarter");
//                }

            }

        }
    }