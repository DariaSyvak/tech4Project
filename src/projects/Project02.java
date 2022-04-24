package projects;

import java.util.Scanner;
public class Project02 {

    public static void main(String[] args) {

        //Task 1

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter 3 numbers ");

        System.out.println("The product of the numbers entered is = "
                + (userInput.nextInt() * userInput.nextInt() * userInput.nextInt()));

        //Task 2

        System.out.println("What is your first name? ");
         String firstName = userInput.next();

        System.out.println("What is your last name? ");
        String lastName = userInput.next();

        System.out.println("What is your year of birth?");
        int yearOfBD = userInput.nextInt();

        int currentYear=2022;

        System.out.println(firstName + " " + lastName + "'s age is = " + (currentYear - yearOfBD));
        userInput.nextLine();

        //Task 3


        System.out.println("What is your full name? ");
        String fullName = userInput.nextLine();

        System.out.println(" What is your weight? ");
        double weigh = userInput.nextDouble();

        System.out.println(fullName + "'s weigh is = " + (weigh * 2.205) + " lbs.");
        userInput.nextLine();

        //Task4


        System.out.println("What is your full name? ");
         String fullName1 = userInput.nextLine();

        System.out.println("What is your age? ");
        int age1 = userInput.nextInt();
        userInput.nextLine();

        System.out.println("What is your full name? ");
        String fullName2 = userInput.nextLine();

        System.out.println("What is your age? ");
        int age2 = userInput.nextInt();
        userInput.nextLine();

        System.out.println("What is your full name? ");
        String fullName3 = userInput.nextLine();

        System.out.println("What is your age? ");
        int age3 = userInput.nextInt();
        userInput.nextLine();

        int maxAge = (int) Math.max(Math.max(age1, age2), age3);
        int minAge = (int) Math.min(Math.min(age1, age2), age3);

        System.out.println(fullName1 + "'s age is " + age1 +
                ".\n" + fullName2 + "'s age is " + age2 +
                ".\n" + fullName3 + "'s age is " + age3 +
                ".\nThe average age is " + ((age1 + age2 + age3) / 3) +
                ".\nThe eldest age is " + maxAge +
                ".\nThe youngest age is " + minAge + ".");


    }
}
