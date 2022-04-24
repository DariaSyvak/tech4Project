package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        String [][]studentGroups={
                {"Kally","Guluzar","Melda"},
                {"Torrie","David"},
                {"Abe","Data"}
        };

        System.out.println(studentGroups[0][1]);
        System.out.println(studentGroups[1][0]);
        System.out.println(studentGroups[1][1]);

        System.out.println(studentGroups.length);//3
        System.out.println(studentGroups[1].length);//2
        System.out.println(studentGroups[2].length);//2

        System.out.println(Arrays.toString(studentGroups[2]));//names from 3 group


        System.out.println(Arrays.deepToString(studentGroups));//all students names


        System.out.println("PRINTING ALL GROUPS");
        for (int i = 0; i < studentGroups.length; i++) {
            System.out.println(Arrays.toString(studentGroups[i]));
        }
        for (String[] studentGroup : studentGroups) {
            System.out.println(Arrays.toString(studentGroup));

        }

        System.out.println("PRINTING ALL MEMBERS");
        for (int i = 0; i < studentGroups.length; i++) {
            for (int j = 0; j < studentGroups[i].length; j++) {
                System.out.println(studentGroups[i][j]);

            }
        }
        System.out.println("PRINTING ALL MEMBERS WITH FOR EACH LOOP ");
        for (String[] studentGroup : studentGroups) {
            for(String members:studentGroup){
                System.out.println(members);
            }

        }






    }
}
