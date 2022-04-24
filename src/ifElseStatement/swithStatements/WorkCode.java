package ifElseStatement.swithStatements;

import java.util.Scanner;

public class WorkCode {
    public static void main(String[] args) {
        /*
Write a program that ask user to enter which day it is (1 to 5)
Based on the answer print what color will be selected

1 Monday -> Blue
2 Tuesday -> Red
3 Wednesday -> Purple
4 Thursday -> Yellow
5 Friday -> Orange
 */
        Scanner answer =new Scanner(System.in);
        //1 way

        System.out.println("Please enter number from 1 to 5");
        int num= answer.nextInt();
        if(num==1) System.out.println("Monday -> Blue");
        else if(num==2)System.out.println("Tuesday -> Red");
        else if(num==3)System.out.println("Wednesday -> Purple");
        else if(num==4)System.out.println("Thursday -> Yellow");
        else if(num==5)System.out.println("Friday -> Orange");

        //2 way
        switch (num){
            case 1:
                System.out.println("Monday -> Blue");
                break;
            case 2 :
                System.out.println("Tuesday -> Red");
                break;
            case 3 :
                System.out.println("Wednesday -> Purple");
                break;
            case 4:
                System.out.println("Thursday -> Yellow");
                break;
            case 5:
                System.out.println("Friday -> Orange");
                break;
            case 6:
            case 7:
                System.out.println("Weekends");
            default:
                System.out.println("LOL");


        }
                        }
                    }

