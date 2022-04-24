package homeworks;

import utilities.RandomNumberGenerator;

import java.util.Arrays;
import java.util.Random;

public class Homework13 {
    public static void main(String[] args) {

        System.out.println("_________Task-1__________");
        for (int i = 1; i <= 10; i++) {
            if (i % 10 == 0) System.out.println("FooBar");
            else if (i % 5 == 0) System.out.println("Bar");
            else if (i % 2 == 0) System.out.println("Foo");
            else System.out.println(i);
        }

        System.out.println("_________Task-2__________");

        int[] numbers = {0, -4, -7, 0, 5, 10, 45};
        boolean isFirstPositive = false;
        boolean isFirstNegative = false;

        for (int number : numbers) {
            if (number > 0 && !isFirstPositive) {
                isFirstPositive = true;
                System.out.println("First positive number is = " + number);
            } else if (number < 0 && !isFirstNegative) {
                isFirstNegative = true;
                System.out.println("First negative number is = " + number);
            }

            if (isFirstPositive && isFirstNegative) break;
        }

        System.out.println("___________Task-3____________");
        int[] ar = new int[5];
        for (int i = 0; i < 5; i++) {
            ar[i] = RandomNumberGenerator.getRandomNumber(1, 10);
        }
        System.out.println(Arrays.toString(ar));


        System.out.println("___________Task-4____________");

        String[] list = {"banana", "orange", "apple"};
        Arrays.sort(list);
        boolean haveApple = false;
        for (String apple : list) {
            if (apple.equalsIgnoreCase("Apple")) {
                haveApple = true;
                break;
            }
        }
        System.out.println(haveApple);


        System.out.println("___________Task-5____________");
        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};

        boolean matchDoesntExists = false;

        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers1[i] == numbers2[j]) {
                    matchDoesntExists = true;
                    System.out.println(numbers1[i]);
                    break;
                }
            }
        }
        if (!matchDoesntExists) System.out.println("There is no matching elements");


                System.out.println("__________Task-6__________");

                String result = "";
                String s = "baNana";

                for (int i = 0; i < s.length() - 1; i++) {
                    for (int j = i + 1; j < s.length(); j++) {

                        if (s.toLowerCase().charAt(i) == s.toLowerCase().charAt(j) &&
                                !result.contains(s.toLowerCase().substring(i, i + 1))) {

                            result += s.toLowerCase().charAt(i);
                            System.out.println(s.charAt(i));
                        }
                    }
                }


            }


        }










