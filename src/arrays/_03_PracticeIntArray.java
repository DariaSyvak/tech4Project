package arrays;

import java.util.Arrays;

public class _03_PracticeIntArray {
    public static void main(String[] args) {
        System.out.println("__________TASK 1___________");

        int[] numbers = {-3, -7, 0, 2, 0, 7, 7, 10, 2, 15};
        System.out.println("Array are not sorted " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Array are not sorted " + Arrays.toString(numbers));

        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int number : numbers) {
            if (number < 0) neg++;
            else if (number > 0) pos++;
            else zero++;
        }
        System.out.println("Positives = " + pos);
        System.out.println("Negatives = " + neg);
        System.out.println("Zeros = " + zero);

        System.out.println("__________TASK 2___________");

        int even = 0, odd = 0;

        for (int number : numbers) {
            if (number % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Evens =" + even);
        System.out.println("Odds =" + odd);

    }
}