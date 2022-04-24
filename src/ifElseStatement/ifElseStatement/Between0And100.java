package ifElseStatement.ifElseStatement;

import java.util.Scanner;

public class Between0And100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number between 0 and 100");
        int num = input.nextInt();
       /* boolean isNumIsBigger0=num>=0;
        boolean isNumIsSmallerThen100=num<=100;
        boolean between =isNumIsBigger0&&isNumIsSmallerThen100;*/


        if (num>=0&&num<=100) {
            System.out.println("it is between");

        } else {
            System.out.println("it is not between");
        }
        }
    }