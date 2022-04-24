package arrays;

import java.util.Arrays;

public class _09_CountWords {
    public static void main(String[] args) {

        String s1 = "Today is Tuesday";
        System.out.println(s1.split(" ").length);

        String s2 = "Some countries I visited were Argentina, Belgium and Malta";
        String[] words = s2.split(" ");
        int countA = 0;
        for (String word : words) {
            if (word.toLowerCase().startsWith("a")) countA++;

        }
        System.out.println(countA);
    }
}
