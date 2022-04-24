package myPractice;

import utilities.CharacterHelper;

import java.util.Locale;

public class _01 {

    public static String signAndLuckyNumber(int num) {
        // if -50/0 && -11

        //if 0/50 && 9
        switch (num) {
            case 9:
                return "You have hit the lucky number!";
            case -11:
                return "You have hit the unlucky number!";
        }
        if (num >= -50 && num < 0)
            return " The number is negative and more than -50";
        else if (num > 0 && num <= 50)
            return "The number is positive and less than 50";
        else if (num == 0)
            return " The number is zero";
        return "The number is NONE";
    }

    public static void ageAndName(int age, String name) {
        if (age > 30 && CharacterHelper.isUppercase(name.charAt(0))) {
            System.out.println("Age and letters checks out");
        } else if (age > 30 && CharacterHelper.isLowercase(name.charAt(0))) {
            System.out.println("Age checks out but letter is doesn't");

        } else if (age <= 30 && CharacterHelper.isUppercase(name.charAt(0))) {
            System.out.println("Age doesn't check out but letter does");
        } else {
            System.out.println("Nothing checks out");
        }
    }

    public static int threeNumbers(int n1, int n2, int n3) {
        int points = 0;
        if (n1 >= 1 && n1 <= 10)
            points += n1 * 15;
        if (n2 >= 1 && n2 <= 10)
            points += n2 * 10;
        if (n3 >= 1 && n3 <= 10)
            points += n3 * 5;
        return points;

    }

    public static void intAndAge(String name, String age) {
        if (name.toLowerCase().equals("dasha") && age.equalsIgnoreCase("27")) {
            System.out.println("IMPOSTER!!!");
        } else {

            if (Integer.parseInt(age) % name.length() == 0) {
                System.out.println("Your age and name gets along!");
            } else {
                System.out.println("Your age and name needs time:(");
            }
            if (CharacterHelper.isVowel(name.charAt(0))) {
                System.out.println("Starting with lowercase");

            } else {
                System.out.println("Starting with consonants I see");
            }
            if (CharacterHelper.isConsonant(name.charAt(name.length() - 1)))
                System.out.println("Nice finish");
            else System.out.println("Seen better");

        }
    }


    public static String firstAndLast(String fullName) {
        String first = fullName.substring(0, fullName.indexOf(" "));
        String last = fullName.substring(fullName.lastIndexOf(" ") + 1);
        String lastname = last.toUpperCase();

        String upName = (first.toUpperCase().substring(0, 1) + first.toLowerCase().substring(1));
        return (upName + " " + lastname);


    }

    public static int sixNum(int number) {
        String num = String.valueOf(number);
        if (num.contains("9")){
        return -1;}
        else if (num.contains("0")){
            return Integer.parseInt((num.replace('0','7')));
        }
        return number;

    }
}



