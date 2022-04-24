package arrays;

import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {
        String name;
        name = "John";
        int age = 45;
        System.out.println("Name is = " + name);
        System.out.println("age is  = " + age);

        /*
        The new trend is to have multiple students information
         */

        String studentsName = "Alex, Abe, Daria";
        String agesStudents = "20,21,22";

        String[] names = {"Alex", "Abe", "Daria"};
        int [] ages={20,21,22};
        char[] favStudentChar={'a','@','&'};
        double []balance={5.6,15,3.4};
        boolean[] doTheyLikeJava={false,true,false};




        //How to print them ?

        System.out.println(names);
        String namesToString=Arrays.toString(names);
        System.out.println(namesToString);

        //How to get a single from Array
        System.out.println(names[1]);
        System.out.println(names[2]);
        //System.out.println(names[9]);//IndexOutOffBounds

        //How to update the elements
        names[1]="Abraham";
        System.out.printf(Arrays.toString(names));

    }
}
