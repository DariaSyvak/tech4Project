package homeworks;

import java.util.Arrays;

public class Homework19 {

    //Task-1
    public static String noDigit(String str) {
        return str.replaceAll("[0-9]", "");
    }

    //Task-2
    public static String noVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    //Task-3
    public static int sumOfDigits(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) sum += Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }

    //Task-4
    public static boolean hasUpperCase(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) return true;
        }
        return false;
    }

    //Task-5
    public static int midlInt(int num1, int num2, int num3) {
        int[] numbers = {num1, num2, num3};
        Arrays.sort(numbers);
        return numbers[1];
    }

    //Task-6
    public static int[] no13(int[] num) {
        for (int i = 0; i <num.length ; i++) {
            if(num[i] == 13) num[i] = 0;
        }

        return num;
    }
    //Task-7
    public static int[] factorial(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int f = 1;
            for (int j = 2; j <= numbers[i]; j++) {
                f *= j;
            }
            numbers[i] = f;
        }
        return numbers;
    }
    //Task-8
    public static String[]categorizeCharacters(String str){
        String []result={"","",""};
        for (char character : str.toCharArray()) {
            if(Character.isLetter(character))result[0]+=character;
            else if(Character.isDigit(character))result[1]+=character;
            else result[2]+=character;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(noDigit("lola13"));
        System.out.println(noVowels("daria"));
        System.out.println(sumOfDigits("lolo123"));
        System.out.println(hasUpperCase("Leon"));
        System.out.println(midlInt(1,2,3));
        System.out.println(Arrays.toString(no13(new int[]{1,13,14,15,13})));
        System.out.println(Arrays.toString(factorial(new int[]{0, 5, 4, 1, 3, 2})));
        System.out.println(Arrays.toString(categorizeCharacters("123ftr#$s%")));


    }


}
