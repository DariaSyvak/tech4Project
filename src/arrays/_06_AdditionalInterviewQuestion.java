package arrays;

import java.util.Arrays;

public class _06_AdditionalInterviewQuestion {
    public static void main(String[] args) {

        int[]numbers={5,3,0,-5};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers[numbers.length-1]);

        System.out.println("SOLUTION WITHOUT SORT");

        int greatest=numbers[0];
        for (int number : numbers) {
            //if(number>greatest)greatest=number;//first option
            greatest=Math.max(greatest,number);//second option
        }
        System.out.println(greatest);

        System.out.println("_______TASK-3______");
        double[] array = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};

        double minValue = Double.MAX_VALUE;

        for (double number : array) {
            //if(number < minValue+) minValue = number;
            minValue = Math.min(minValue, number);
        }
        System.out.println(minValue);



        System.out.println("_______TASK-4______");
        double minValue2= Double.MAX_VALUE;
        for(double number:array){
            if (number!=minValue&& number<minValue2)minValue2=number;
        }
        System.out.println(minValue2);



        }






    }

