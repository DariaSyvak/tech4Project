package arrays;

import javax.swing.*;

public class _04_PracticePartialArrays {
    public static void main(String[] args) {


        System.out.println("____________TASK-1___________");
        int[] numbers={10,-3,-7,0,0,7,22};
        for (int n:numbers){
            System.out.println(n);
        }
        System.out.println("____________TASK-2___________");
        int sum=0;
        int[] numbers2={10,-3,-7,0,0,7,22};
        for (int n:numbers) {
            sum+=n;
        }
        System.out.println(sum);

        System.out.println("____________TASK-3___________");

        int sum3=0;
        int[] numbers3={10,-3,-7,0,0,7,22};
        for (int i = 0; i <= 2; i++) {
            sum3+=numbers[i];
        }
        System.out.println(sum3);

        System.out.println("____________TASK-4___________");
        int sum4=0;
        for (int i =numbers.length-5 ; i <numbers.length; i++) {
            sum4+=numbers[i];
        }
        System.out.println(sum4);



        System.out.println("____________TASK-5___________");

        int p  = 1;
        for (int i = numbers.length -4; i < numbers.length ; i++) {
            int number=numbers[i];
            if(number!=0) p*=number;
        }
        System.out.println(p);


        System.out.println("____________TASK-6___________");

        boolean zero=false;
        for (int number : numbers) {
            if (number == 0) {
                zero = true;
                break;
            }
        }
        System.out.println(zero);













        }

    }


