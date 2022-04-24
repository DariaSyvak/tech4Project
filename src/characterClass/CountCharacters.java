package characterClass;

import utilities.CharacterHelper;

public class CountCharacters {
    public static void main(String[] args) {


        //task 1
        System.out.println("_________Task-1__________");
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int count = 0;
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count);


        System.out.println("__________Task-2__________");
        String address1 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int count1 = 0;
        for (int i = 0; i < address1.length(); i++) {
            if (Character.isLetter(address1.charAt(i))) {
                count1++;
            }
        }
        System.out.println(count1);

        System.out.println("________Task -3_________");
        String address2 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int count2 = 0, count3 = 0;
        for (int i = 0; i < address1.length(); i++) {
            if (Character.isUpperCase(address2.charAt(i)))
                count2++;
            else if (Character.isLowerCase(address2.charAt(i)))
                count3++;
        }
        System.out.println(count3 - count2);

        System.out.println("________Task -4_________");
        String address4 = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int countV = 0, countNAv = 0;
        for (int i = 0; i < address4.length(); i++) {
            if (CharacterHelper.isVowel(address4.charAt(i)))
                countV++;
            if (!CharacterHelper.isVowel(address4.charAt(i)) && Character.isLetter(address4.charAt(i)))
                countNAv++;
        }
        System.out.println("Vowel = " + countV + "\nConsonants = " + countNAv);


        System.out.println("___________Task-5__________");


        int letterCounter = 0, digitCounter = 0, spaceCounter = 0, specialCounter = 0,
                lowerCounter = 0, upperCounter = 0, vowelCounter = 0, consonantCounter = 0, evenCounter = 0, oddCounter = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);

            if (Character.isLetter(c)) {
                letterCounter++;
                if (Character.isUpperCase(c)) {
                    upperCounter++;
                } else {
                    lowerCounter++;
                }

                if (CharacterHelper.isVowel(c)) {
                    vowelCounter++;
                } else {
                    consonantCounter++;
                }
            } else if (Character.isDigit(c)) {
                digitCounter++;
                if (Integer.parseInt("" + c) % 2 == 0) {
                    evenCounter++;
                } else {
                    oddCounter++;
                }
            } else if (Character.isSpaceChar(c)) {
                spaceCounter++;
            } else {
                specialCounter++;
            }
        }

        System.out.println("Letters = " + letterCounter);
        System.out.println("Uppercases = " + upperCounter);
        System.out.println("Lowercases = " + lowerCounter);
        System.out.println("Vowels = " + vowelCounter);
        System.out.println("Consonants = " + consonantCounter);
        System.out.println("Digits = " + digitCounter);
        System.out.println("Evens = " + evenCounter);
        System.out.println("Odds = " + oddCounter);
        System.out.println("Spaces = " + spaceCounter);
        System.out.println("Specials = " + specialCounter);


    }
}


