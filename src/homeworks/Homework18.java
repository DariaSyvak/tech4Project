package homeworks;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Homework18 {

    //TASK-1
    public static String noSpace(String str) {
        return str.replaceAll("\\s", "");

    }

    //TASK-2
    public static String replaceFirstLast(String str) {
        String str1 = str.trim().replaceAll("\\s+", "\\s");
        if (str1.length() < 2) return "";
        else return str1.charAt(str1.length() - 1) + str1.substring(1, str1.length() - 1) + str1.charAt(0);
    }

    //TASK-3
    public static boolean hasVowel(String str) {
        return str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i")
                || str.toLowerCase().contains("o") || str.toLowerCase().contains("u");
    }

    //TASK-4
    public static void checkAge(int yourYear) {
        Date currentDate = new Date();
        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        if (Integer.parseInt(year.format(currentDate)) - yourYear < 16) System.out.println("AGE IS NOT ALLOWED");
        else if (Integer.parseInt(year.format(currentDate)) - yourYear > 100) System.out.println("AGE IS NOT VALID");
        else System.out.println("AGE IS ALLOWED");
    }

    //TASK-5
    public static int averageOfEdges(int a, int b, int c) {
        int max = (Math.max(Math.max(a, b), c));
        int min = (Math.min(Math.min(a, b), c));
        return (max + min) / 2;
    }

    //TASK-6
    public static String[] noA(String[] str) {
        for (int i = 0; i < str.length; i++) {
            if (str[i].toLowerCase().startsWith("a")) str[i] = "###";
        }
        return str;
    }

    // TASK-7
    public static int[] no3or5(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 15 == 0) nums[i] = 101;
            else if (nums[i] % 3 == 0) nums[i] = 100;
            else if (nums[i] % 5 == 0) nums[i] = 99;
        }
        return nums;
    }

    //TASK-8
    public static int countPrimes(int[] numbers) {
        int counter = 0;
        for (int num : numbers) {
            if (num < 2) continue;
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) isPrime = false;
                break;
            }
            if (isPrime) counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(noSpace("   i love my live"));
        System.out.println(replaceFirstLast("  A  "));
        System.out.println(hasVowel("FART"));
        checkAge(1700);
        System.out.println(averageOfEdges(-3, 15, -3));
        System.out.println(countPrimes(new int[]{7, 4, 11, 23, 17}));
        System.out.println(Arrays.toString(no3or5(new int[]{15, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(noA(new String[]{"pple", "appium", "BC", "Alex", "A"})));


    }
}