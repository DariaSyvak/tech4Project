package collections.arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class UnderstandingArrayList {
    public static void main(String[] args) {

        //Declaring an Array vs ArrayList
        String []namesArray=new String [5];
        ArrayList<String>nameList= new ArrayList<>();


        //How to print the size of Array vs Arraylist
        System.out.println("Size of array ="+ namesArray.length);
        System.out.println("Size of the ArrayList ="+nameList.size());


        //How to add element to Array vs Arraylist
        namesArray[0]="Abe";
        namesArray[4]="Data";
        namesArray[4]="Lionel";


        nameList.add("Abbe");
        nameList.add(1,"Data");
        nameList.add(1,"John");
        nameList.add("Alona");
        nameList.add("Max");
        nameList.add(0,"James");

        nameList.set(3,"Lionel");

        //How to print Array vs Arraylist
        System.out.println(Arrays.toString(namesArray));
        System.out.println(nameList);

        nameList.add("Andrey");
        System.out.println(nameList);

        nameList.add(5,"Taylor");
        System.out.println(nameList);

        nameList.set(3,"Daria");
        System.out.println(nameList);
        System.out.println(nameList.size());

        nameList.remove("Andrey");
        System.out.println(nameList);

        System.out.println(nameList.remove(2));
        System.out.println(nameList);

        System.out.println(nameList.remove("Max"));
        System.out.println(nameList);

        nameList.add(0,"Regina");
        nameList.add(5,"Regina");
        nameList.add(6,"Regina");
        nameList.add(7,"Regina");
        System.out.println(nameList);

        System.out.println(nameList.get(3));
        System.out.println(nameList.get(5));
        System.out.println(nameList);

        System.out.println(nameList.indexOf("Regina"));
        System.out.println(nameList.lastIndexOf("Regina"));

        System.out.println(nameList.contains("Alona"));//true
        System.out.println(nameList.contains("Nina"));//false


        nameList.clear();//clear all collection
        System.out.println(nameList.size());






    }
}
