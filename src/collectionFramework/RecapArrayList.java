package collectionFramework;

import java.util.*;

public class RecapArrayList {
    public static void main(String[] args) {

        System.out.println("________INT ARRAY_______");
        int[] arr = {1, 5, 7, 9, 10};
        System.out.println(Arrays.toString(arr));


        System.out.println("________STRING ARRAY_______");
        String[] cities = {"Tokyo", "Berlin", "Oslo", "Denver", null, null};
        System.out.println(Arrays.toString(cities));


        //ArrayList-Vector-LinkedList

        ArrayList<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2,cities);
        cities2.add("Tokyo");

        System.out.println(cities2);
        System.out.println(cities2.get(3));

        Vector<String>names=new Vector<>();
        names.add(null);
        names.add(null);
        names.add(null);
        names.add("Regina");
        names.add("Regina");
        names.add("Data");

        System.out.println(names.size());
        names.forEach(System.out::println);
        System.out.println(names.get(5));

        System.out.println("________STRING LINKED-LIST_________");
        LinkedList<String>object1=new LinkedList<>();

        object1.add("Phone");
        object1.add("Computer");
        object1.add("Airpods");
        object1.add("Screen");
        object1.add("Screen");
        object1.add(null);
        object1.add(null);
        object1.add(null);
        object1.add(null);

        System.out.println(object1.getLast());
        System.out.println(object1);
        System.out.println(object1.stream().filter(Objects::isNull).count());



        }
    }


