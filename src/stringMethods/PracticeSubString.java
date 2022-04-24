package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeSubString {
    public static void main(String[] args) {
        /*
Write a program that asks user to enter a sentence (multiple words)
Find and print the first and the last words from the given sentence with below messages

Test data1:
I like Java

Expected output:
The first word is = I
The last word is = Java

Test data2:
Today is Sunday

Expected output:
The first word is = Today
The last word is = Sunday
 */
        String result=ScannerHelper.getAStringFromUser();

        System.out.println("The first letter is " + result.substring(0,result.indexOf(' ')));
        System.out.println("The last letter is " + result.substring(result.lastIndexOf(' ')+1));

    }
}
