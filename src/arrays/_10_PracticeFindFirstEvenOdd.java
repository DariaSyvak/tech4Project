package arrays;

import java.util.Arrays;

public class _10_PracticeFindFirstEvenOdd {
    public static void main(String[] args) {
        int[] numbers = {0, 5, 3, 2, 4, 7, 10};
        int even = 1, odd = 0;

        for (int number : numbers) {
           if (even % 2 == 0 && odd % 2 == 1) break;
           if (even %2 == 1 && number % 2 == 0) even = number;
           else if (odd %2== 0 && number % 2 == 1) odd = number;

        }
        System.out.println("First even is = " + even);
        System.out.println("First odd is = " + odd);
        System.out.println((even==1)?"There is no even in this array ":"First Even ="+even);
        System.out.println((odd==0)?"There is no odd in this array ":"First odd ="+odd);

    }
}

