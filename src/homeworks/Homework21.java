package homeworks;

import java.util.LinkedHashMap;

public class Homework21 {

    public static void fizzBuzz1(int arg) {
        for (int i = 1; i <= arg; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Buzz");
            else if (i % 5 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }

    }

    public static String fizzBuzz2(int arg) {
        if (arg % 15 == 0) return "FizzBuzz";
        else if (arg % 3 == 0) return "Buzz";
        else if (arg % 5 == 0) return "Fizz";
        else return arg + "";
    }


    public static int findSumNumbers(String arg) {
        int c = 0;
        for (String s : arg.split("[^0-9]+")) {
            if (!s.isEmpty()) c += Integer.parseInt(s);
        }
        return c;
    }


    public static int findBiggestNumber(String arg) {
        int c = 0;
        for (String s : arg.split("[^0-9]+")) {
            if (!s.isEmpty() && Integer.parseInt(s) > c) c = Integer.parseInt(s);
        }
        return c;
    }


    public static String countSequenceOfCharacters(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character s : str.toCharArray()) {
            if (!map.containsKey(s)) map.put(s, 1);
            else map.put(s, map.get(s) + 1);

        }

        StringBuilder result = new StringBuilder();
        for (Character character : map.keySet()) {
            result.append("" + map.get(character) + character);
        }
        return result.toString();

    }


    public static void main(String[] args) {
        fizzBuzz1(16);
        System.out.println(fizzBuzz2(0));
        System.out.println(findSumNumbers("ab"));
        System.out.println(findBiggestNumber("ab11c045d"));
        System.out.println(countSequenceOfCharacters("AAbbaabbcc"));

    }
}
