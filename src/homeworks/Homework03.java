package homeworks;

import java.util.Scanner;

        //Task 1

public class Homework03 {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Please enter your first number");
        int number1 =inputNumber.nextInt();

        System.out.println("Please enter your second number");
        int number2 = inputNumber.nextInt();

        System.out.println("The number 1 entered by user is = " +number1 + "\nThe number 2 entered by user is =" +number2 +
                "\nThe sum of number 1 and 2 entered by user is = " +(number1+number2));

        System.out.println("\n\n");
        //Task 2

        System.out.println("Enter first number");
        double num1=inputNumber.nextDouble();

        System.out.println("Enter second number");
        int num2= inputNumber.nextInt();

        System.out.println("The number 1 entered by user is = " +num1 +"\nThe number 2 entered by user is = "+ num2 +
                "\nThe division of number 1 and 2 entered by user is = "+ (num1/num2));


        System.out.println("\n\n");
        //Task3

        System.out.println("1.\t"+ (-10+7*5));
        System.out.println("2.\t"+ ((72+24)%24));
        System.out.println("3.\t"+(10+-3*9/9));
        System.out.println("4.\t"+(5+18/3*3-( 6%3 )));

        System.out.println("\n\n");
        //Task4

        System.out.println("Please give your first number");
        double floatingNum1= inputNumber.nextDouble();

        System.out.println("Please give your second number");
        double floatingNum2=inputNumber.nextDouble();

        System.out.println("The summer of the given numbers is = "+ (floatingNum1+floatingNum2)+
                "\nThe product of the given numbers is = "+ (floatingNum1*floatingNum2) +
                "\nThe subtraction of the given numbers is = "+ (floatingNum1-floatingNum2)+
                "\nThe division of the given numbers is = "+ (floatingNum1/floatingNum2) +
                "\nThe remainder of the given numbers is = " +(floatingNum1%floatingNum2));

        System.out.println("\n\n");
        //Task5
        System.out.println("The area of the rectangle = "+(7.5*10.5) +
                "\nThe perimeter of the rectangle = "+((7.5+10.5)*2));

        System.out.println("\n\n");
        //Task6
        System.out.println("A Software Engineer in Test can earn " +(90000.0*3)+ " in \n3 years.");
    }


}
