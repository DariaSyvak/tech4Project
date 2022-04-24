package arrays;

import java.util.Arrays;

public class FruitsCollection {
    public static void main(String[] args) {

        String[] fruits = new String[4];
        System.out.println(Arrays.toString(fruits));
        fruits[0]="kiwi";
        fruits[3]="apple";
        System.out.println(Arrays.toString(fruits));

        System.out.println(fruits.length);


    }
}
