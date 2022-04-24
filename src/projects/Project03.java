package projects;

import java.util.Scanner;

public class Project03 {
    public static void main(String[] args) {

        //Task 1

        String s1="24",s2="5";

        int s1int=Integer.parseInt(s1);
        int s2int=Integer.parseInt(s2);

        System.out.println("The sum of 24 and 5 = "+(s1int+s2int)+
                "\nThe subtraction of 24 and 5 = " +(s1int-s2int)+
                "\nThe division of 24 and 5 = " +((double)s1int/(double)s2int)+
                "\nThe multiplication of 24 and 5  = " +(s1int*s2int)+
                "\nThe remainder of 24 and 5 = "+(s1int%s2int));

        //Task 2

        int number=(int)(Math.random()*36);
        System.out.println("Random number = "+number);
        if (number==2||number==3||number==5||number==7||number==11||number==13
                ||number==17||number==19||number==23||number==29||number==31)
            System.out.println("The number is prime number");
        else System.out.println("The number is not prime number");


        //Task 3

        int random1=(int)(Math.random()*51);
        int random2=(int)(Math.random()*51);
        int random3=(int)(Math.random()*51);
        int middle;
        int min =Math.min(Math.min(random1,random2),random3);
        int max=Math.max(Math.max(random1,random2),random3);
        if (random1 != max && random1 != min){
            middle= random1;
        }else if(random2 != max && random2 != min){
            middle = random2;
        }else{
            middle = random3;
        }

        System.out.println("Random number 1 = " + random1+
                "\nRandom number 2 = " + random2+
                "\nRandom number 3 = " + random3+
                "\nLowest number is = " +min+
                "\nMiddle number is = " +middle+
                "\nGreatest number is = "+max);

        //Task 4
        Scanner userInput=new Scanner(System.in);
        System.out.println("Please enter a character");
        char c=userInput.next().charAt(0);
        if (c<=64 && c>=0||c>=91 && c<=96||c>=123 && c<=127) System.out.println("Invalid character detected");
        if (c>=97&&c<=122) System.out.println("The letter is lowercase");
        if(c>=65&&c<=90) System.out.println("The letter is uppercase");

        //Task 5

        System.out.println("Enter your character ");
        char a=userInput.next().charAt(0);
        if (a<=64&&a>=0||a>=91&&a<=96||a>=123&&a<=127) System.out.println("Invalid character detected");
        if (a==97||a==101||a==105||a==111||a==117||a==121
                ||a==65||a==69||a==73||a==79||a==85||a==89) System.out.println("The letter is vowel");
        else System.out.println("The letter is consonant");

        //Task 6

        System.out.println("Enter a character");
        char ch=userInput.next().charAt(0);
        if (ch>=32 && ch<=47||ch>=58 && ch<=64||ch>=91 && ch<=96||ch>=123 && ch<=126)
            System.out.println("Special character is = "+ ch);
        else System.out.println("Invalid character detected!!!");

        //Task 7

        System.out.println("Enter character,please");
        char x=userInput.next().charAt(0);
        if(x>=97&&x<=122||x>=65&&x<=90) System.out.println("Character is letter");
        if(x>=48 && x<=57) System.out.println("Character is digit");
        if(x>=32 && x<=47||x>=58 && x<=64||x>=91 && x<=96||x>=123 && x<=126)
            System.out.println("Character is a special character");



    }
}
