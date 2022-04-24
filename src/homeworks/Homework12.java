package homeworks;

import utilities.CharacterHelper;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {

        System.out.println("_______Task-1_________");

        int[] number = new int[10];
        number[0] = 89;
        number[2] = 23;
        number[4] = 12;
        number[6] = 15;
        number[7] = 34;
        number[9] = 7;
        System.out.println(number[3]);
        System.out.println(number[0]);
        System.out.println(number[9]);
        System.out.println(Arrays.toString(number));

        System.out.println("_______Task-2_________");

        String[] str = new String[5];
        str[1] = "abc";
        str[4] = "xyz";
        System.out.println(str[3]);
        System.out.println(str[0]);
        System.out.println(str[4]);
        System.out.println(Arrays.toString(str));

        System.out.println("_______Task-3_________");

        int[] numbers = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("_______Task-4_________");

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        System.out.println("_______Task-5_________");

        String[] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(dogs));

        boolean counter = false;
        for (String dog : dogs) {
            if (dog.equalsIgnoreCase("Pluto")) {
                counter = true;
                break;
            }
        }
        System.out.println(counter);

        System.out.println("_______Task-6_________");

//        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};
//        System.out.println(Arrays.toString(cats));
//
//        int bool = 0;
//        for (int i = 0; i < cats.length; i++) {
//            if (cats[i].equalsIgnoreCase("Garfield"))
//                bool++;
//            else if (cats[i].equalsIgnoreCase("Felix"))
//                bool++;
//        }
//        System.out.println(bool > 1);
        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};
        System.out.println(Arrays.toString(cats));

        boolean bool = false;boolean bool2 = false;
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].equalsIgnoreCase("Garfield"))
                bool=true;
            else if (cats[i].equalsIgnoreCase("Felix"))
                bool2=true;
        }
        System.out.println(bool2&&bool);


        System.out.println("_______Task-7_________");

        double[] numbersD = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(numbersD));
        for (double numbers7 : numbersD) {
            System.out.println(numbers7);

        }
        System.out.println("_______Task-8_________");

        int low = 0;
        int up = 0;
        int dig = 0;
        char[] chars = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        for (char element : chars) {
            if (CharacterHelper.isUppercase(element)) up++;
            else if (CharacterHelper.isLowercase(element)) low++;
            else if (CharacterHelper.isDigit(element)) dig++;

        }
        System.out.println(Arrays.toString(chars));
        System.out.println("Letters = " + (up + low));
        System.out.println("Uppercase letters = " + up);
        System.out.println("Lowercase letters = " + low);
        System.out.println("Digits = " + dig);
        System.out.println("Special characters= " + (chars.length - up - low - dig));


        System.out.println("_______Task-9_________");

        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        int upper = 0;
        int lower = 0;
        int bOrP = 0;
        int bookOrPen = 0;
        for (String object : objects) {
            if (Character.isUpperCase(object.charAt(0))) upper++;
            if (Character.isLowerCase(object.charAt(0))) lower++;
            if (object.toLowerCase().startsWith("b") || object.toLowerCase().startsWith("p")) bOrP++;
            if (object.toLowerCase().contains("book") || object.toLowerCase().contains("pen")) bookOrPen++;

        }
        System.out.println(Arrays.toString(objects));
        System.out.println("Elements starts with uppercase = " + upper);
        System.out.println("Elements starts with lowercase = " + lower);
        System.out.println("Elements starting with B or P = " + bOrP);
        System.out.println("Elements having ”book” or “pen”= " + bookOrPen);


        System.out.println("________Task-10_________");

        int[] n = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        int more10 = 0;
        int are10 = 0;
        int les10 = 0;
        for (int i : n) {
            if (i > 10) more10++;
            else if (i == 10) are10++;
            else les10++;
        }
        System.out.println(Arrays.toString(n));
        System.out.println("Elements that are more than 10 = " + more10);
        System.out.println("Elements that are less than 10 = " + les10);
        System.out.println("Elements that are 10 = " + are10);


        System.out.println("________Task-11_________");
//        int[]ar1={ 5, 8, 13, 1, 2};
//        int[]ar2={9, 3, 67, 1, 0};
//
//        ar3[0]=Math.max(ar1[0],ar2[0]);
//        ar3[1]=Math.max(ar1[1],ar2[1]);
//        ar3[2]=Math.max(ar1[2],ar2[2]);
//        ar3[3]=Math.max(ar1[3],ar2[3]);
//        ar3[4]=Math.max(ar1[4],ar2[4]);
//
        int[] ar1 = {5, 8, 13, 1, 2};
        int[] ar2 = {9, 3, 67, 1, 0};
        int[] ar3 = new int[5];
        for (int i = 0; i < 5; i++) {
            ar3[i] = Math.max(ar1[i], ar2[i]);
        }
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));
        System.out.println(Arrays.toString(ar3));

    }
}















