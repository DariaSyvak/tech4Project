package collections.linkedList;

import java.util.*;

public class ConvertingArrayToList {
    public static void main(String[] args) {

        String[] countriesS = {"USA", "Brasilia", "Argentina", "France", "Belgium", "Germany", "Portugal"};

        System.out.println("_____________first way_____________");
        List<String> countries = new LinkedList<>(Arrays.asList(countriesS));
        List<String> countries2 = new ArrayList<>(Arrays.asList(countriesS));

        System.out.println(countries);
        System.out.println(countries2);


        System.out.println("_____________second way_____________");
        List<String> countries3 = new ArrayList<>();
        List<String> countries4 = new LinkedList<>();

        Collections.addAll(countries3, countriesS);
        Collections.addAll(countries4, countriesS);

        System.out.println(countries3);
        System.out.println(countries4);

        System.out.println("_____________third way______________");

        int[]numbers={1,2,3,4,5};
        List<Integer>numbersList=new ArrayList<>();//or Linked List
        for (int i: numbers) {
            numbersList.add(i);
        }
        System.out.println(numbersList);

    }
}
