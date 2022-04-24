package utilities;

import java.util.Scanner;

public class ScannerHelper {
    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public static double getDoubleFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the double number : ");
        double num1 = input.nextDouble();
        input.nextLine();
        return num1;
    }

    public static int getNumWithMessage(String message) { // "Hey user enter your number"
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        int n = input.nextInt();
        return n;
    }

    public static int getNumberWithMsg(String msg) {
        Scanner input = new Scanner(System.in);
        System.out.println(msg);
        int num = input.nextInt();
        if (num >= 1 && num <= 10) {
            return num;
        } else return -1;
    }

    public static String getAStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String string = scanner.nextLine();
        return string;
    }

    public static String getANameFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        String name = scanner.nextLine();
        return name;
    }

    public static String getAColorFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 4 colors: ");
        String name = scanner.nextLine();
        return name;
    }

}