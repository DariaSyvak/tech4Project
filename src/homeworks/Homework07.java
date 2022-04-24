package homeworks;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args){
        Scanner userInput=new Scanner(System.in);

        //Task 1
        int r1=(int)(Math.random()*11), r2=(int)(Math.random()*11),
                r3=(int)(Math.random()*11),r4=(int)(Math.random()*11);
        System.out.println("Number 1= "+r1+ "\nNumber 2= "+r2+"\nNumber 3= "+r3+
                "\nNumber 4= "+r4+"\nAbsolute difference of "+r1+" with 5 is = " +Math.abs(r1-5)+
                "\nAbsolute difference of "+r2+" with 5 is = " +Math.abs(r2-5)+
                "\nAbsolute difference of "+r3+" with 5 is = " +Math.abs(r3-5)+
                "\nAbsolute difference of "+r4+" with 5 is = " +Math.abs(r4-5)+
                "\nGreatest number is = "+Math.max((Math.max(r1,r2)),(Math.max(r3,r4)))+
                "\nSmallest number is = "+Math.min((Math.min(r1,r2)),(Math.min(r3,r4))));

        //Task 2
            int num1 =(int)(Math.random()*(50-(-50)+1)+(-50)),num2 =(int)(Math.random()*(50-(-50)+1)+(-50)),
                num3 =(int)(Math.random()*(50-(-50)+1)+(-50)),num4 =(int)(Math.random()*(50-(-50)+1)+(-50)),
                num5 =(int)(Math.random()*(50-(-50)+1)+(-50)),num6 =(int)(Math.random()*(50-(-50)+1)+(-50)),
                num7 =(int)(Math.random()*(50-(-50)+1)+(-50)),num8 =(int)(Math.random()*(50-(-50)+1)+(-50));
            int max= Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(num1,num2),num3),num4),num5),num6),num7),num8);
            int min= Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(num1,num2),num3),num4),num5),num6),num7),num8);


        System.out.println("Number 1 = "+num1+"\nNumber 2 = "+num2+"\nNumber 3 = "+num3+"\nNumber 4 = "+num4+
                "\nNumber 5 = "+num5+"\nNumber 6 = "+num6+"\nNumber 7 = "+num7+"\nNumber 8 = "+num8+
                "\nGreatest number is = "+max+"\nSmallest number is = "+min+
                "\nAverage of 8 numbers is = "+(num1+num2+num3+num4+num5+num6+num7+num8)/8);
        System.out.println("Absolute difference between smallest and greatest is = " +Math.abs(max-min));

        if (num3>0)System.out.println("3rd number is positive = true");
        else System.out.println("3rd number is positive =false");
        if (num5<0) System.out.println("5th number is negative = true");
        else System.out.println("5th number is negative = false");
        if (num1==0||num2==0||num3==0||num4==0||num5==0||num6==0||num7==0||num8==0) System.out.println(
                "There is at least one zero among those numbers is = true");
        else System.out.println("There is at least one zero among those numbers is = false");

        //Task3


        System.out.println("Please enter7 numbers : ");
        int n1 = userInput.nextInt();
        int n2 = userInput.nextInt();
        int n3 = userInput.nextInt();
        int n4 = userInput.nextInt();
        int n5 = userInput.nextInt();
        int n6 = userInput.nextInt();
        int n7 = userInput.nextInt();

        int max1 = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(n1, n2), n3), n4), n5), n6), n7);
        int min1 = Math.min(Math.min(Math.min(Math.min(Math.min(Math.min(n1, n2), n3), n4), n5), n6), n7);

        System.out.println("Greatest number is = " + max1);
        System.out.println("Smallest number is = " + min1);
        System.out.println("Average of 7 numbers is = " + (n1 + n2 + n3 + n4 + n5 + n6 + n7) / 7);

        if (n1 >= 10) System.out.println("First number is greater than or equal to 10 = true");
        else System.out.println("First number is greater than or equal to 10 = false");

        if (n7 <= 40) System.out.println("Last number is less than or equal to 40 = true");
        else System.out.println("Last number is less than or equal to 40 = false");

        if(n1>25 && n7>25) System.out.println("Both first and last numbers are greater than 25 = true");
        else System.out.println("Both first and last numbers are greater than 25 = false");

        if ((n1 == 0 || n1 == 50) || (n2 == 0 || n2 == 50) || (n3 == 0 || n3 == 50) ||
                (n4 == 0 || n4 == 50) || (n5 == 0 || n5 == 50) || (n6 == 0 || n6 == 50) || (n7 == 0 || n7 == 50))
            System.out.println(
                    "At least one of those numbers is 0 or 50  = true");
        else System.out.println("At least one of those numbers is 0 or 50  = false");


        if (n1 >= 40 && n1 <= 50) System.out.println("There is no number between 40 and 50 = false");
        else if (n2 > 40 && n2 < 50) System.out.println("There is no number between 40 and 50 = false");
        else if (n3 > 40 && n3 < 50) System.out.println("There is no number between 40 and 50 = false");
        else if (n4 > 40 && n4 < 50) System.out.println("There is no number between 40 and 50 = false");
        else if (n5 > 40 && n5 < 50) System.out.println("There is no number between 40 and 50 = false");
        else if (n6 > 40 && n6 < 50) System.out.println("There is no number between 40 and 50 = false");
        else if (n7 > 40 && n7 < 50) System.out.println("There is no number between 40 and 50 = false");
        else System.out.println("There is no number between 40 and 50 = true");


        //Task 4

        int a = (int)(Math.random() * 101);
        int b = (int)(Math.random() * 101);
        int c = (int)(Math.random() * 101);

        System.out.println(a + " " + b + " " + c);

        if (a > 25 && b > 25 && c > 25) System.out.println("All numbers greater than 25 it -" +true);
        else System.out.println("Some of the numbers are less than 25 it - "+false);

        //Task 5
        System.out.println("What is the day number today? ");
        int dayNumber = userInput.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
            default:
                System.out.println("WRONG NUMBER");
        }

       //Task 6

        System.out.println("Please enter number between (-10) to 10");
        int number = userInput.nextInt();

        if (number > 0) System.out.println("Number entered is POSITIVE”");
        else System.out.println("“Number entered is NEGATIVE”");

        if (number == 0) System.out.println("Number entered is ZERO");
        if (number % 2 == 0) System.out.println("Number entered is EVEN");
        else System.out.println("Number entered is ODD");

        //Task 7


        System.out.println("Tell me your exam results? ");
        int ex1= userInput.nextInt();
        int ex2 = userInput.nextInt();
        int ex3 = userInput.nextInt();

        if ((ex1 + ex2 + ex3) / 3 < 70) System.out.println("YOU FAILED!");
        else System.out.println("YOU PASSED!");

        //Task-8


        System.out.println("Please,enter 3 numbers ");
        int input1 = userInput.nextInt();
        int input2= userInput.nextInt();
        int input3 = userInput.nextInt();

        if (input1 == input2 && input2 ==input3 && input3 == input1) System.out.println("TRIPLE  MATCH");
        else if (input1 == input2 || input2 == input3 || input3 == input1) System.out.println("DOUBLE MATCH");
        else System.out.println("NO MATCH");
    }
}
