package homeworks;

import utilities.CharacterHelper;
import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {

        System.out.println("_______Task-1________");

        String s = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) s += i + " - ";
        }
        System.out.print(s.substring(0, s.length() - 3));
        System.out.println();


        System.out.println("_______Task-2________");

        String s1 = "";
        for (int i = 1; i <= 50; i++) {
            if (i % 6 == 0) s1 += i + " - ";
        }
        System.out.print(s1.substring(0, s1.length() - 3));
        System.out.println();


        System.out.println("_______Task-3________");

        String s2 = "";
        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0) s2 += i + " - ";
        }
        System.out.print(s2.substring(0, s2.length() - 3));
        System.out.println();


        System.out.println("_______Task-4________");

        for (int i = 0; i <= 7; i++) {
            int sq = i * i;
            System.out.println("The square of " + i + " is = " + sq);

        }

        System.out.println("_______Task-5________");

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);


        System.out.println("________Task-6______");

        int num = ScannerHelper.getNumberFromUser();
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.println(fact);


        System.out.println("________Task-7________");

        String n = ScannerHelper.getANameFromUser();
        int counter = 0;
        for (int j = 0; j < n.length(); j++) {
            if (CharacterHelper.isVowel(n.charAt(j)))
                counter++;
        }
        System.out.println("There are " + counter + " vowel letters in this full name");


        System.out.println("________Task-8__________");


        Scanner input = new Scanner(System.in);

        int number;
        int total = 0;
        int attempt = 1;
        do {
            System.out.println("Please enter number");
            number = input.nextInt();

            if (attempt == 1 && number >= 100) {
                System.out.println("This number is already more than 100");
                break;
            } else {
                total += number;
                if (total >= 100) {
                    System.out.println("Sum of the entered numbers is at least 100");
                }
            }
            attempt++;
        } while (total < 100);


        System.out.println("________Task-9__________");

        int n9 = ScannerHelper.getNumberFromUser();

        int first = 0;
        int second = 1;
        int third;

        String str = "";

        for (int a = 0; a < n9; a++) {
            str += first + " - ";
            third = second + first;
            first = second;
            second = third;

        }
        System.out.println(str.substring(0, str.length() - 3));


        System.out.println("__________Task-10__________");

        Scanner input1 = new Scanner(System.in);

        String name;
        do {
            System.out.println("Please enter your name");
            name = input1.nextLine();

        } while (!(name.toLowerCase().startsWith("j")));
        System.out.println("End of the program");
    }

}



