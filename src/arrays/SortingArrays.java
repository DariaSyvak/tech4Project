package arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        /*HOW TO SORT AN ARRAY OF NUMBERS
        byte,short,int,long,float,double
        ASCENDING lowest to the highest
        DESCENDING highest to the lowest

         */

        int[]numbers={10,-5,0,0,3,0,7,9};
        //System.out.println("my array is = "+ Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("my array is = "+ Arrays.toString(numbers));


        char[]c={'A','b','z','H'};
      //  System.out.println("my array character is = "+ Arrays.toString(c));
        Arrays.sort(c);
        System.out.println("my array character is = "+ Arrays.toString(c));


        String[]names={"Adam","Adame","Alex","tom","ally","Adele","terry","Josh"};
        System.out.println("my array names is = "+ Arrays.toString(names));
        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].toUpperCase().charAt(0) + names[i].toLowerCase().substring(1);
        }
        Arrays.sort(names);
        System.out.println("my array names sorted is = "+ Arrays.toString(names));
    }
}
