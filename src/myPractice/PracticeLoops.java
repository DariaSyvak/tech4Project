package myPractice;

import utilities.CharacterHelper;

public class PracticeLoops {


    public static void printChars(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));

        }

    }

    public static void noVowels(String str) {

//        String notVowels = "";
        for (int i = 0; i < str.length(); i++) {
            if (!CharacterHelper.isVowel(str.charAt(i))) {
                System.out.print(str.charAt(i));
                System.out.println();
            }
        }

    }


    public static int numOfVowels(String str) {

        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (CharacterHelper.isVowel(str.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    public static int countOfDigits(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (CharacterHelper.isDigit(str.charAt(i))) {
                counter++;
            }

        }
        return counter;
    }

//    //str.toLowerCase().replace("ab","a")
//    public static String aAfterB(String str) {
//        String noB = "";
//        for (int i = 0; i < str.length(); i++) {// Abraham
//            // 0,2/ 1,3/2,4....
//            // i -> 0/ 1/ 2/ 3....
//            //  i, i + 2/
//            if (str.substring(i, i + 2).equalsIgnoreCase("ab")) {
//                noB += str.charAt(i);
//                i++;
//            }
//        }


}