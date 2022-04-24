package collections.arrayList;

import utilities.CharacterHelper;

import java.util.ArrayList;
import java.util.List;

public class _01_Practice_Counting_ArrayList_Elements {
    public static void main(String[] args) {

        System.out.println("TASK-1");

        List<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        numbers.add(15);

        System.out.println(numbers);

        System.out.println("TASK-2");
        int counter=0;
        for (Integer number : numbers) {
            if (number%2!=0) counter++;
        }
        System.out.println("Odds = " + counter);

        //FOR i LOOp
        int countOdds=0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)%2==1)countOdds++;


        }
        System.out.println("Odds are = "+countOdds);


        System.out.println("TASK-3");
        List<String> colors = new ArrayList<>();
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");
        System.out.println(colors);



        System.out.println("TASK-4");
        int counterS=0;
        for (String color : colors) {
            if(Character.isUpperCase(color.charAt(0)))counterS++;

        }
        System.out.println(counterS);

        int counterUPP=0;
        for (int i = 0; i < colors.size(); i++) {
            if (CharacterHelper.isUppercase(colors.get(i).charAt(0)))counterUPP++;
        }
        System.out.println(counterUPP);
    }
}
