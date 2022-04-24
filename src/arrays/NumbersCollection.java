package arrays;

import java.util.Arrays;

public class NumbersCollection {
    public static void main(String[] args) {

        //1 way
        int[]numbers=new int[3];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;

        //2 way
        int[]numbersAll={1,2,3};
        System.out.println(Arrays.toString(numbersAll));
    }
}
