package homeworks;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Task 1

        System.out.println("Please enter 3 numbers");
        int num1= input.nextInt(),num2= input.nextInt(),num3= input.nextInt();

        System.out.println("Max value = "+(Math.max(Math.max(num1,num2),num3))+
                "\nMin value = "+(Math.min(Math.min(num1,num2),num3)));

        //Task 2

        System.out.println("Please enter 5 numbers");
        int n1= input.nextInt(),n2= input.nextInt(),n3= input.nextInt(),n4= input.nextInt(),n5= input.nextInt();


        int maxOf5 = Math.max(n1, Math.max(Math.max(n2, n3), Math.max(n4, n5)));
        int minOf5 = Math.min(n1, Math.min(Math.min(n2, n3), Math.min(n4, n5)));

        System.out.println("Max value = "+maxOf5+
                "\nMin value = "+minOf5);


        //Task 3

        System.out.println("Please enter 2 numbers");
        int number1= input.nextInt(),number2= input.nextInt();

        System.out.println("The difference between numbers is = "+
                Math.abs(number1-number2));

        //Task 4

        int  num01 =(int)(Math.random()*(50-100+1)+100);
        int  num02=(int)(Math.random()*(50-100+1)+100);
        int  num03=(int)(Math.random()*(50-100+1)+100);
        System.out.println("Number 1 =" +num01+ "\nNumber 2 ="+num02+
                "\nNumber 3 ="+num03+ "\nThe sum of numbers is = "+(num01+num02+num03));


        //Task 5

        double alexMoney = 125, mikeMoney= 220, given=25.5;
        System.out.println("Alex's money : $"+(alexMoney-given)+
                "\nMike's money :$"+(mikeMoney+given));

        //Task 6

        double save=390;
        double day =15.60;
        System.out.println((int)(save/day));

    }
}
