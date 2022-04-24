package ifElseStatement.nestedIfStatenents;

import java.util.Scanner;

public class FindTheSmallestOf2Numbers {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter 2 numbers");
        int num1= input.nextInt(), num2= input.nextInt();
       // if(num1<num2) {
        //    System.out.println(num1 + " Is smaller");
       // }else{
          //      System.out.println(num2 + " Is smaller");

          //  }

        int smallestNumber= num1>num2?num1:num2;
        System.out.println(smallestNumber);
        }

}
