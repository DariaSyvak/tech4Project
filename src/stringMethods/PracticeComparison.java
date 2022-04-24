package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeComparison {
    public static void main(String[] args) {
        System.out.println("Java".equalsIgnoreCase("java"));
        System.out.println("Hello".equals("Hello"));

        Scanner input=new Scanner (System.in);
        System.out.println("Please enter a string");
        String s1= input.nextLine();
        System.out.println("Please enter a second string ");
        String s2= input.nextLine();
        if (s1.equals(s2)) System.out.println("its equal");
        else System.out.println("its not equal");

        //String str1= ScannerHelper.getAStringFromUser();
        //String str2= ScannerHelper.getAStringFromUser();

        System.out.println(ScannerHelper.getAStringFromUser().equals(ScannerHelper.getAStringFromUser()) ?
                "These string are equal" : "These string are not equal");

    }
}
