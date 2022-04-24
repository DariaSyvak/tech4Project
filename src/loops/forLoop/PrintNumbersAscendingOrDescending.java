package loops.forLoop;

import utilities.RandomNumberGenerator;

public class PrintNumbersAscendingOrDescending {
    public static void main(String[] args) {
        String s1 ="";
        int num1= RandomNumberGenerator.getRandomNumber( 0,25);
        int num2=RandomNumberGenerator.getRandomNumber( 0,25);
        for (int i=Math.min(num1,num2); i<=Math.max(num1,num2); i++){
            if(i%5!=0) s1+=i + " - ";

        }
        System.out.print(s1.substring(0,s1.length()-3));
    }
}
