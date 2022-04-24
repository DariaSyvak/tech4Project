package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework16 {
    //Task-1
    public static int countWords(String words) {
        words = words.trim();
        int counter = 1;
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == ' ') counter++;

        }
        return words.isEmpty() ? 0 : counter;

    }

    //Task-2
    public static int countA(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'a') counter++;
        }
        return str.isEmpty() ? 0 : counter;
    }

    //Task-3
    public static int countPos(ArrayList<Integer> list) {
        int counter = 0;
        for (Integer integer : list) {
            if (integer > 0) counter++;

        }
        return counter;

    }

    //Task-4
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> duplicate = new ArrayList<>();
        for (Integer s : numbers) {
            if (!duplicate.contains(s)) duplicate.add(s);
        }
        return duplicate;
    }

    //Task-5
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> words) {
        ArrayList<String> duplicate = new ArrayList<>();
        for (String s : words) {
            if (!duplicate.contains(s)) duplicate.add(s);

        }
        return duplicate;
    }

    //Task -6
    public static String removeExtraSpaces(String str) {
        String container = "";
        String[] space = str.split(" ");
        for (String s : space) {
            if (s.length() > 0) container += s + " ";
        }
        return container.trim();
    }

    //Task-7
    public static int[] addMethod(int[] num1, int[] num2) {

        for (int i = 0; i < Math.min(num1.length, num2.length); i++) {
            if (num1.length < num2.length) num2[i] += num1[i];
            else num1[i] += num2[i];

        }
        return (num1.length < num2.length) ? num2 : num1;
    }

    //Task-8
    public static int findClosestTo10(int[] num) {
        int min = Integer.MAX_VALUE;
        for (int n : num) {
            if (n != 10 && Math.abs(10-n) < min) min = Math.abs(10-n);
        }
        Arrays.sort(num);
        if (Arrays.binarySearch(num,10-min) >= 0) return 10 - min;
        return 10+min;

    }

}




