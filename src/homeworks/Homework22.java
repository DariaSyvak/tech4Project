package homeworks;

import java.lang.reflect.Array;
import java.util.*;


public class Homework22 {

    //Task-1
    public static int[] fibonacciSeries1(int num) {
        int[] arr = new int[num];
        if (num > 0) arr[0] = 0;
        if (num > 1) arr[1] = 1;
        for (int i = 0; i < arr.length-2; i++) {
            arr[i + 2] = arr[i] + arr[i + 1];
        }
        return arr;
    }

    //Task-2
    public static int fibonacciSeries2(int num) {
        return fibonacciSeries1(num)[num - 1];
    }

    //Task-3
    public static int[] findUniques(int[] num1, int[] num2) {
        Set<Integer> uncommons = new HashSet<>();
        List<Integer> commons = new ArrayList<>();
        for (int i1 : num1) for (int i2 : num2) if (i1 == i2) commons.add(i1);
        for (int i : num1) if (!commons.contains(i)) uncommons.add(i);
        for (int i : num2) if (!commons.contains(i)) uncommons.add(i);

        int[] uniques = new int[uncommons.size()];
        int index = 0;
        for (Integer uncommon : uncommons) uniques[index++] = uncommon;
        return uniques;
    }

    //Task-4
    public static boolean isPowerOf3(int num) {

        while (num % 3 == 0) {
            num /= 3;
        }
        return (num == 1);
    }

    //Task-5
    public static int firstDuplicate(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) return arr[i];
        }
        return -1;

    }


    public static void main(String[] args) {
        int[] arr1 = {8, 9, 7, 5};
        int[] arr2 = {8, 9, 8, 7};
        int[] arr3 = {2, 3, 45, 1, 2, 3};
        System.out.println(Arrays.toString(fibonacciSeries1(8)));
        System.out.println(fibonacciSeries2(8));
        System.out.println(Arrays.toString(findUniques(arr1, arr2)));
        System.out.println(isPowerOf3(3));
        System.out.println(firstDuplicate(arr3));
    }


}



