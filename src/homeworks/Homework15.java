package homeworks;

import java.util.ArrayList;
import java.util.Collections;

public class Homework15 {
    public static void main(String[] args) {

        System.out.println("____________Task-1_________");
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(23);
        numList.add(67);
        numList.add(23);
        numList.add(78);
        System.out.println(numList.get(3));
        System.out.println(numList.get(0));
        System.out.println(numList.get(2));
        System.out.println(numList);

        System.out.println("____________Task-2_________");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");
        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        System.out.println("____________Task-3_________");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(-34);
        numbers.add(-56);
        numbers.add(0);
        numbers.add(89);
        numbers.add(100);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        System.out.println("____________Task-4_________");
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");
        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);

        System.out.println("____________Task-5_________");
        ArrayList<String> marvel = new ArrayList<>();
        marvel.add("Spider Man");
        marvel.add("Iron Man");
        marvel.add("Black Panter");
        marvel.add("Deadpool");
        marvel.add("Captain America");
        System.out.println(marvel);
        System.out.println(marvel.contains("Wolwerine"));

        System.out.println("____________Task-6_________");
        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Hulk");
        avengers.add("Black Widow");
        avengers.add("Captain America");
        avengers.add("Iron Man");
        System.out.println(avengers);
        System.out.println(avengers.contains("Hulk") && avengers.contains("Iron Man"));

        System.out.println("____________Task-7_________");
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('x');
        characters.add('$');
        characters.add('%');
        characters.add('9');
        characters.add('*');
        characters.add('F');
        characters.add('G');
        System.out.println(characters);
        for (Character character : characters) {
            System.out.println(character);
        }

        System.out.println("____________Task-8_________");
        ArrayList<String> objects = new ArrayList<>();
        objects.add("Desk");
        objects.add("Laptop");
        objects.add("Mouse");
        objects.add("Monitor");
        objects.add("Mouse-Pad");
        objects.add("Adapter");
        System.out.println(objects);
        Collections.sort(objects);
        System.out.println(objects);
        int counterM = 0, doesntHaveAorrE = 0;
        for (String object : objects) {
            if (object.toLowerCase().startsWith("m")) counterM++;
            if (!(object.toLowerCase().contains("a") || object.toLowerCase().contains("e"))) doesntHaveAorrE++;
        }
        System.out.println(counterM);
        System.out.println(doesntHaveAorrE);

        System.out.println("____________Task-9_________");
        ArrayList<String> kitchen = new ArrayList<>();
        kitchen.add("Plate");
        kitchen.add("spoon");
        kitchen.add("fork");
        kitchen.add("Knife");
        kitchen.add("cup");
        kitchen.add("Mixer");
        System.out.println(kitchen);
        int upp = 0, low = 0, p = 0, sPeP = 0;
        for (String s : kitchen) {
            if (Character.isUpperCase(s.charAt(0))) upp++;
            if (Character.isLowerCase(s.charAt(0))) low++;
            if (s.toLowerCase().contains("p")) p++;
            if (s.toLowerCase().startsWith("p") || s.toLowerCase().endsWith("p")) sPeP++;
        }
        System.out.println("Elements starts with uppercase = " + upp +
                "\nElements starts with lowercase = " + low +
                "\nElements having P or p = " + p +
                "\nElements starting or ending with P or p = " + sPeP);

        System.out.println("____________Task-10_________");
        ArrayList<Integer> num = new ArrayList<>();
        num.add(3);
        num.add(5);
        num.add(7);
        num.add(10);
        num.add(0);
        num.add(20);
        num.add(17);
        num.add(10);
        num.add(23);
        num.add(56);
        num.add(78);
        System.out.println(num);
        int dev10 = 0, great15 = 0, oddAndLess20 = 0, lessOr = 0;
        for (Integer integer : num) {
            if (integer % 10 == 0) dev10++;
            if (integer % 2 == 0 && integer > 15) great15++;
            if (integer % 2 == 1 && integer < 20) oddAndLess20++;
            if (integer < 15 || integer > 50) lessOr++;
        }
        System.out.println("Elements that can be divided by 10 = " + dev10 +
                "\nElements that are even and greater than 15 = " + great15 +
                "\nElements that are odd and less than 20 = " + oddAndLess20 +
                "\nElements that are less than 15 or greater than 50 = " + lessOr);
    }
}
