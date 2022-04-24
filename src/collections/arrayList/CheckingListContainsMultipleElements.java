package collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class CheckingListContainsMultipleElements {
    public static void main(String[] args) {

        List<Integer> numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(50);
        numbers.add(55);
        numbers.add(40);
        numbers.add(45);
        numbers.add(30);
        System.out.println(numbers.contains(5));
        System.out.println(numbers.contains(20)&&numbers.contains(30));

        List<Integer> numbersToCheck=new ArrayList<>();
        numbersToCheck.add(30);
        numbersToCheck.add(10);
        numbersToCheck.add(40);
        numbersToCheck.add(45);
        System.out.println(numbers.containsAll(numbersToCheck));




    }
}
