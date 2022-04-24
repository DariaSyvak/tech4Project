package stringMethods;

import java.util.Scanner;

public class PracticeFirstAndLastChar {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name= input.nextLine();
        System.out.println("Firs character of the name "+ name.charAt(0));
        System.out.println("Last character of the name "+ name.charAt(name.length()-1));

    }

}
