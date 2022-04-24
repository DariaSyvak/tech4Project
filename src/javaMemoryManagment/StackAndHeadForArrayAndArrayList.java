package javaMemoryManagment;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class StackAndHeadForArrayAndArrayList {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "John";
        names[1] = "Alex";
        names[2] = "Kaly";

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        namesList = null;
        ArrayList<String> newL = namesList;
        names[0] = "";
        System.out.println(Arrays.toString(names));
        System.out.println(namesList);
    }

}
