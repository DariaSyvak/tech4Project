package collectionFramework;

import java.util.ArrayList;
import java.util.TreeSet;

public class FindSecondGreatest {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(3);
        numbers.add(1);
        numbers.add(10);

        TreeSet<Integer>un=new TreeSet<>(numbers);
        System.out.println(un);

        ArrayList<Integer>unList=new ArrayList<>(new TreeSet<>(numbers));
        System.out.println(unList.get(unList.size()-2));
        System.out.println(unList.get(1));

    }
}
