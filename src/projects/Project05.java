package projects;

import myFirstDay.MyFirstProgram;
import utilities.*;

public class Project05 {
    public static void main(String[] args) {

        //Task-1

        String str=ScannerHelper.getAStringFromUser();
        if (str.length()<8) System.out.println("This string does not have 8 characters ");
        else System.out.println(str.substring(str.length()-4)+str.substring(4,str.length()-4)+str.substring(0,4));



        //Task-2

        String s=ScannerHelper.getAStringFromUser().trim();
        if (!s.contains(" "))System.out.println("This sentence does not hav 2 or more words to swap");
        else System.out.println(s.substring(s.lastIndexOf(" ")+1)+s.substring(s.indexOf(" "),s.lastIndexOf(" ")+1)
        +s.substring(0,s.indexOf(" ")));

        //Task-3

        String str1 = ScannerHelper.getAStringFromUser();
        String str2 = ScannerHelper.getAStringFromUser();
        String str3 = ScannerHelper.getAStringFromUser();
        System.out.println(str1.replace("stupid","nice").replace("idiot","nice"));
        System.out.println(str2.replace("stupid","nice").replace("idiot","nice"));
        System.out.println(str3.replace("stupid","nice").replace("idiot","nice"));


        //Task-4
        String name =ScannerHelper.getANameFromUser();
        if (name.length()<2) System.out.println("Invalid input");
        else if (MathHelper.isOdd(name.length())) System.out.println(StringHelper.getMiddle(name));
        else System.out.println (StringHelper.getMiddle(name));

        //Task-5

        String c=ScannerHelper.getAStringFromUser();
        if(c.length()<5) System.out.println("Invalid input");
        else System.out.println(c.substring(2,c.length()-2));

        //Task-6

        String address=ScannerHelper.getAStringFromUser();
        System.out.println(address.replace('a','*').replace('A','n').
                replace('e','#').replace('E','#')
                .replace('i','+').replace('I','+').replace('u','$')
                .replace('U','$').replace('o','@').replace('O','@'));

        //Task-7
        String s1 ="";
        int num1=RandomNumberGenerator.getRandomNumber( 0,25);
        int num2=RandomNumberGenerator.getRandomNumber( 0,25);
        for (int i=Math.min(num1,num2); i<=Math.max(num1,num2); i++){
            if(i%5!=0) s1+=i + " - ";

        }
        System.out.print(s1.substring(0,s1.length()-3));


    }
}
