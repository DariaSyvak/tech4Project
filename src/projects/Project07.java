package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project07 {

    public static void main(String[] args) {
        int[] num = {10, 5, 6, 7, 8, 5, 15, 15};
        String[] strs = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz","bar"};

        greatestAndSmallest(num);
        greatestAndSmallestLoop(num);
        secondSmallestAndGreatest(num);
        secondSmallAndGreat(num);
        findDuplicatedElements(strs);
        findMostRepeatedElements(strs);
        findMostRepeatedElements2(strs);
    }


    //task-1
    public static void greatestAndSmallest(int[] num) {
        Arrays.sort(num);
        System.out.println("Smallest = " + num[0]);
        System.out.println("Greatest = " + num[num.length - 1]);

    }

    //task-2
    public static void greatestAndSmallestLoop(int[] num) {
        int smallest = num[0];
        int bigger = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > bigger) bigger = num[i];
            else if (num[i] < smallest) smallest = num[i];
        }
        System.out.println("Smallest = " + smallest);
        System.out.println("Greatest = " + bigger);
    }

    //task-3
    public static void secondSmallAndGreat(int[] num) {
        Arrays.sort(num);
        int secondS = Integer.MAX_VALUE;
        int secondB = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < secondS && num[i] != num[0]) secondS = num[i];
            if (num[i] > secondB && num[i] != num[num.length - 1]) secondB = num[i];

        }
        System.out.println("second Greatest = " + secondB);
        System.out.println("second Smallest = " + secondS);
    }


    //task -4
    public static void secondSmallestAndGreatest(int[] num) {
        int smallest = Integer.MAX_VALUE, secondS = Integer.MAX_VALUE;
        int bigger = Integer.MIN_VALUE, secondB = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > bigger) bigger = num[i];
            if (num[i] < smallest) smallest = num[i];
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] < bigger && num[i] > secondB) secondB = num[i];
            if (num[i] > smallest && num[i] < secondS) secondS = num[i];

        }

        System.out.println("second Greatest = " + secondB);
        System.out.println("second Smallest = " + secondS);


    }

    //Task -5
    public static void findDuplicatedElements(String[] str) {
        String duplicate = "";

        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j]) && !duplicate.contains(str[i])) duplicate += str[j] + "\n";
            }
        }

        System.out.println(duplicate);
    }

    //Task -6
    public static void findMostRepeatedElements(String[] str) {
        Arrays.sort(str);
        int max_count = 1, count = 1;
        String element = "";
        for (int i = 1; i < str.length; i++) {
            if(str[i] == str[i-1]) count++;
            if(str[i] != str[i-1] || i == str.length-1){
                if(count > max_count){
                    max_count = count;
                    element = str[i-1];
                }
                count = 1;
            }
        }
        System.out.println(element);
    }
    public static void findMostRepeatedElements2(String[] arr) {
        String mostCountedWord = "";
        int mostCountedTimes = 0;

        ArrayList<String> countedElements = new ArrayList<>();

        for (int i = 0; i <= arr.length-1; i++) {
            String word = arr[i];
            int countOfWord = 0;

            if(!countedElements.contains(word)){
                for (String w : arr) {
                    if(word.equals(w)) countOfWord++;
                }

                if(countOfWord > mostCountedTimes){
                    mostCountedWord = word;
                    mostCountedTimes = countOfWord;
                }
                countedElements.add(word);
            }
        }

        System.out.println(mostCountedWord + " counted " + mostCountedTimes + " times in this array");






    }






    }


