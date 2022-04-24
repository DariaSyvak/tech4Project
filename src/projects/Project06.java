package projects;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Project06 {
    public static void main(String[] args) {

        System.out.println("_________Task-1________");

        int container = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your sentence ");
        String s = input.nextLine();

        if (s.trim().contains(" ")) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    container++;
                }
            }
            System.out.println("This sentence has " + (container + 1) + " words.");
        } else {
            System.out.println("This sentence does not have multiple words");
        }


        System.out.println("_________Task-2________");

        String word = ScannerHelper.getAStringFromUser();
        if (word.length() < 1) System.out.println("This word does not have 1 or more characters");
        else {

            String palindrome = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                palindrome += word.charAt(i);

            }
            System.out.println((word.equals(palindrome)) ?
                    "This is palindrome" :
                    "This is not palindrome");


        }


        System.out.println("_____________Task-3______");

        String str = ScannerHelper.getAStringFromUser();
        if (str.length() < 1) System.out.println("This word does not have any character");
        else {
            int a = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.toLowerCase().charAt(i) == 'a')
                    a++;
            }
            System.out.println("This sentence has " + a + " a or A letters.");
        }


        System.out.println("___________Task-4________");


        int num = ScannerHelper.getNumberFromUser();
        for (int i = 1; i <= num; i++) {
            if (i % 6 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Bar");
            else if (i % 3 == 0) System.out.println("Foo");
            else System.out.println(i);


        }


    }


}
