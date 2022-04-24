package collectionFramework;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetPractice {
    public static void main(String[] args) {

        HashSet<Integer> numbers1 = new HashSet<>();

        numbers1.add(5);
        numbers1.add(10);
        numbers1.add(-3);
        numbers1.add(0);
        numbers1.add(-7);
        numbers1.add(-55);

        System.out.println(numbers1);

        TreeSet<Integer>numbers=new TreeSet<>();
        numbers.addAll(numbers1);
        System.out.println(numbers);

    }
}
