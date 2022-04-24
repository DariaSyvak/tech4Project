package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class ConvertingListToEachOther {
    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        System.out.println("The ArrayList equals to = " +numbers);

        //converting ArrayList to Link
        LinkedList<Integer>numbers2=new LinkedList<>(numbers);
        System.out.println("The LinkList equals to = "+numbers2);

        //converting LinkList to ArrayList
        ArrayList<Integer>numbers3=new ArrayList<>(numbers2);

        String[]namesArr={"Kally","Torrie","Taylor"};
        Vector<String> names=new Vector<>();
        Collections.addAll(names,namesArr);
        System.out.println(names);
    }
}
