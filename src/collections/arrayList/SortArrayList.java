package collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        int[]numbersArray={3,7,0,4};
        System.out.println("My arrays before sort = "+ Arrays.toString(numbersArray));
        Arrays.sort(numbersArray);
        System.out.println("After array sort =" +Arrays.toString(numbersArray));

        System.out.println("_______HOW TO SOR ARRAY LIST_______");
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(3);
        numbersList.add(7);
        numbersList.add(0);
        numbersList.add(4);

        System.out.println("My list before sorting = " + numbersList);
        Collections.sort(numbersList);
        System.out.println("My list after sorting = " + numbersList);


    }
}
