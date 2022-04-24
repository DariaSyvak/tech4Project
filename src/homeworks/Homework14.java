package homeworks;

import java.util.Arrays;

public class Homework14 {
    public static void main(String[] args) {

        System.out.println("_________Task-1__________");

        int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};
        boolean duplicateExists = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    duplicateExists = true;
                    break;
                }

            }
            if (duplicateExists) break;
        }
        if (!duplicateExists) System.out.println("There is no duplicates");


        System.out.println("_______Task-2__________");

        String[] words = {"Z", "abc", "123", "67"};
        boolean dupFound = false;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    System.out.println(words[i]);
                    dupFound = true;
                    break;
                }
            }
            if (dupFound) break;
        }
        if (!dupFound) System.out.println("There is no duplicates");

        System.out.println("________Task-3___________");

        int[] numbers3 = {-4, 0, -7, 1, 5, 10, 45, 2, 3, 4};
        String duplicatesNumbers = "";
        for (int i = 0; i < numbers3.length - 1; i++) {
            for (int j = i + 1; j < numbers3.length; j++) {
                if (numbers3[i] == numbers3[j] && !duplicatesNumbers.contains(numbers3[i] + "")) {
                    duplicatesNumbers += numbers3[i] + "\n";
                }
            }
        }
        if (duplicatesNumbers.length() > 0) System.out.println(duplicatesNumbers);
        else System.out.println("There is no duplicates");

        System.out.println("__________Task-4___________");

        String[] words4 = {"A", "foo", "12", "Foo", "bar", "a", "a", "java"};
        String wordsDuplicate = "";
        for (int i = 0; i < words4.length - 1; i++) {
            for (int j = i + 1; j < words4.length; j++) {
                if (words4[i].equalsIgnoreCase(words4[j]) && !wordsDuplicate.contains(words4[i].toLowerCase())) {
                    wordsDuplicate += words4[i].toLowerCase();
                    System.out.println(words4[i]);
                }
            }
        }
        if (wordsDuplicate.isEmpty()) System.out.println("There is no duplicate");

        System.out.println("__________Task-5__________");
        String[] words1 = {"abc", "foo", "bar"};
        String[] wordsNew = new String[words1.length];
        for (int i = 0; i < words1.length; i++) {
            wordsNew[i] = words1[words1.length - 1 - i];
        }
        System.out.println(Arrays.toString(wordsNew));


        System.out.println("__________Task-6__________");

        String str = "Java is fun";
        String[] strArray = str.split(" ");

        for (int i = 0; i < strArray.length; i++) {
            String reverseStr = "";
            for (int j = strArray[i].length() - 1; j >= 0; j--) {
                reverseStr += strArray[i].charAt(j);
            }
            strArray[i] = reverseStr;
        }

        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");
        }



    }
}

