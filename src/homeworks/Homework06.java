package homeworks;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {

        //Task 1
        String s1="5";
        String s2="10";

        int s1int=Integer.parseInt(s1);//string-->int
        int s2int=Integer.parseInt(s2);
        System.out.println("-Sum of 5 and 10 is = "+(s1int+s2int)+
                "\n-Product of 5 and 10 is = "+ s1int*s2int +
                "\n-Division of 5 and 10 is = "+s1int/s2int +
                "\n-Subtraction of 5 and 10 is = "+(s1int-s2int)+
                "\n-Remainder of 5 and 10 is = "+s1int%s2int);


        //Task 2
        String s01="200";
        String s02="-50";

        int s01int=Integer.parseInt(s01);//string-->int
        int s02int=Integer.parseInt(s02);
        System.out.println("The greatest value is = " +Math.max(s01int,s02int)+
                "\nThe smallest value is = "+ Math.min(s01int,s02int)+
                "\nThe average is = "+(s01int+s02int)/2 +
                "\nThe adsolute difference is = "+Math.abs(s01int-s02int));

        //Task 3

        double coin =0.25*3+ 0.10+ 0.10+ 0.01;

        System.out.println((int)(24/coin) +" days\n"+
                (int)(168/coin )+" days\n"+
                "$"+coin*5*30);

        //Task 4

        double save=1_250;
        double saveDay=62.5;

        System.out.println((int)(save/saveDay));

        //Task 5

        double goingToSave =14_265;
        double option1= 475.5;
        double option2=951;

        System.out.println("Option 1 will take "+
                (int)(goingToSave/option1)+" months"+
                "\nOption 2 will take "+ (int)(goingToSave/option2)+" months");

        //Task 6

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1=input.nextInt();

        System.out.println("Enter your second number");
        int num2=input.nextInt();

        double num1double=num1;
        double num2double=num2;

        System.out.println(num1double/num2double);//first option
        System.out.println((double)input.nextInt()/ (double)input.nextInt());//second option
        System.out.println((double)num1/ (double)num2);//third option



    }
}
