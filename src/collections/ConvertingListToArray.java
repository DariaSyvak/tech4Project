package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class ConvertingListToArray {
    public static void main(String[] args) {
        ArrayList<String >names=new ArrayList<>();
        names.add("Rami");
        names.add("Naim");
        names.add("Reem");

        LinkedList<Integer>ages=new LinkedList<>();
        ages.add(25);
        ages.add(26);
        ages.add(27);
        ages.add(30);

        Vector<Boolean>booleans=new Vector<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(false);
        booleans.add(false);

        //Converting lists To Array
        //way-1 manual way
        String[]namesArr1=new String[names.size()];//[null,null,null]
        for (int i = 0; i < names.size(); i++) {
            namesArr1[i]= names.get(i);
        }
        System.out.println(Arrays.toString(namesArr1));

        System.out.println("_______2nd way toArray method________");

        Object[]namesArr2=names.toArray();
        Object[]agesArr=ages.toArray();
        Object[]booleansArr= booleans.toArray();
        System.out.println(Arrays.toString(namesArr2));
        System.out.println(Arrays.toString(agesArr));
        System.out.println(Arrays.toString(booleansArr)); 


        }

    }

