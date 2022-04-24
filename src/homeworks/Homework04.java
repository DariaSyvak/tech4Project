package homeworks;

import java.util.Scanner;

public class Homework04 {

    //Task 1
    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        System.out.println("Please put your first number");
        int firstNum =userInput.nextInt() ;

        System.out.println("Please put your second number");
        int secondNum = userInput.nextInt();

        System.out.println("The average of the given 2 numbers is : "+ (firstNum+secondNum)/2);

        //Task 2

        System.out.println("What is your first number ?");
        int number1= userInput.nextInt();

        System.out.println("What is your second number?");
        int number2= userInput.nextInt();

        System.out.println("The product of the given 2 numbers is : "+ number1*number2 );

        //Task 3

        System.out.println("What is your first number?");
        int firstNumber = userInput.nextInt();

        System.out.println("What is your second number?");
        int secondNumber= userInput.nextInt();

        System.out.println("What is your third number?");
        int thirdNumber = userInput.nextInt();

        System.out.println("The 5 multiplied with 5 is = "+ firstNumber*firstNumber
        +"\nThe 6 multiplied with 6 is = "+secondNumber*secondNumber +
        "\nThe 10 multiplied with 10 is = " +thirdNumber*thirdNumber);

        //Task 4

        System.out.println("Please put your first number ");
        int num1=userInput.nextInt();

        System.out.println("Please put your second number ");
        int num2= userInput.nextInt();

        System.out.println("The remainder of 25 % 8 = "+num1%num2);

        //Task 5

        System.out.println("Your first number is" );
        int numb1=userInput.nextInt();

        System.out.println("Your second number is");
        int numb2= userInput.nextInt();

        System.out.println("Your third number is" );
        int numb3= userInput.nextInt();

        System.out.println("Your fourth number is");
        int numb4= userInput.nextInt();

        System.out.println("Your fifth number is ");
        int numb5=userInput.nextInt();

        System.out.println("The average of the 5 numbers is :"
                +(numb1+numb2+numb3+numb4+numb5)/5);

        //Task 6

        System.out.println("Please choose one number");
        int number= userInput.nextInt();

        System.out.println("7*1 = "+number*1 +"\n7*2 = "+number*2 +"\n7*3 = "+ number*3+
                "\n7*4 = "+number*4 +"\n7*5 = "+number*5 +"\n7*6 = "+number*6 +"\n7*7 = "+number*7 +
                "\n7*8 = "+number*8 +"\n7*9 = "+number*9 +"\n7*10 = "+number*10);

        //Task 7

        System.out.println("Please select a side of a square ");
        int side= userInput.nextInt();

        System.out.println("Perimeter of the square = "+side*4 +
                "\nArea of the square = "+ side*side);

    }
}
