package stringMethods;

import utilities.ScannerHelper;

import java.util.Locale;

public class _12_contains {
    public static void main(String[] args) {
       /* It is used to find out  if a String contains another string or character
       It is non-static, and we call it with a method
       It is return type ,and it's a boolean
       It takes string arguments
      */
        String s = "Good morning";
        System.out.println(s.contains("Good"));
        System.out.println(s.contains(""));
        System.out.println(s.contains("123"));
        System.out.println(s.contains(s));

        String input = ScannerHelper.getAStringFromUser();
        if (input.toLowerCase().contains("chicago"))System.out.println("You are in the class");
        else System.out.println("You are not in the club");
        if (input.toUpperCase().contains("CHICAGO"))System.out.println("You are in the class");
        else System.out.println("You are not in the club");
        System.out.println(input.toLowerCase().contains("chicago")?"You are in the class":"You are in the class");
        System.out.println(input.toUpperCase().contains("CHICAGO")?"You are in the class":"You are in the class");

    }

}
