package arrays;

import java.util.Arrays;

public class _01_PracticeCharArray {
    public static void main(String[] args) {

        System.out.println("________TASK-1__________");
        char[] chars = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(chars));


        System.out.println("__________TASK-2_________");
        System.out.println("The size of the array is = " + chars.length);

        System.out.println("__________TASK-3__________");
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        System.out.println("_________TASK-4__________");
        for (char element : chars) {
            System.out.println(element);
        }

        System.out.println("_________TASK-5_________");
        for (int i = 0; i <= chars.length - 1; i++) {
            if (Character.isLetter(chars[i])) System.out.println(chars[i]);
        }
        System.out.println("__________TASK 5-2________");
        for (char element : chars) {
            if (Character.isLetter(element)) System.out.println(element);

        }
        System.out.println("__________TASK-6__________");
        int counter = 0;
        for (int i = 0; i <= chars.length - 1; i++) {
            if (Character.isUpperCase(chars[i])) counter++;

        }
        System.out.println(counter);

        System.out.println("__________TASK 6-2__________");

        int counter2=0;
        for(char element:chars){
           if (Character.isUpperCase(element)) counter2++;

        }
        System.out.println(counter2);
















    }

}