package arrays;

import java.util.Arrays;

public class _02_PracticeStringArray {
    public static void main(String[] args) {

        System.out.println("___________TASK-1________");
        String[] students = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};
        System.out.println("Unsorted arrays = " + Arrays.toString(students));
        Arrays.sort(students);
        System.out.println("Sorted arrays = " + Arrays.toString(students));

        System.out.println("___________TASK-2________");

        System.out.println("First name is = " + students[0]);
        System.out.println("Last name is = " + students[students.length - 1]);

        System.out.println("___________TASK-3________");
        int counter = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].startsWith("A"))
                counter++;
        }
        System.out.println(counter);


        System.out.println("___________TASK 3-2________");
        int counter2 = 0;
        for (String element : students) {
            if (element.startsWith("A")) counter2++;
        }
        System.out.println(counter2);


        System.out.println("__________TASK-4___________");
        int counter3 = 0;
        for (String element : students) {
            if (element.toUpperCase().contains("A") || element.toUpperCase().contains("E"))
                counter3++;
        }
        System.out.println(counter3);

        System.out.println("__________TASK 4-2___________");
        int counterAE = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].toLowerCase().contains("a") || students[i].toLowerCase().contains("e"))
                counterAE++;
        }
        System.out.println(counterAE);

        System.out.println("__________TASK-5___________");

        int counterChar = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].length() >= 5)
            counterChar++;
        }
        System.out.println(counterChar);


        System.out.println("__________TASK 5-2___________");
        int c=0;
        for (String student : students) {
            if(student.length()>=5) c++;
        }
        System.out.println(c);


        System.out.println("__________TASK 6___________");
        boolean cc=false;
        for (String student : students) {
            if (student.equalsIgnoreCase("Jennifer")) {
                cc = true;
                break;
            }
        }
        System.out.println(cc);

        System.out.println("__________TASK 6-2___________");
        //Second way is not always good considering performance but would always work
        int countJennifer = 0;

        for (String student : students) {
            if(student.equalsIgnoreCase("Jennifer")) countJennifer++;
        }

        System.out.println(countJennifer > 0);
















        }
    }
