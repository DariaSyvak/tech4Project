package ifElseStatement.ifElseStatement;

import java.util.Scanner;
public class DividableBy7 {
    public static void main(String[] args) {
        Scanner newInput = new Scanner(System.in);

        System.out.println("please enter a number? ");
        int num= newInput.nextInt();
        if(num%7==0){
            System.out.println("The number you entered is dividable by 7");

        }else{
            System.out.println("Is not dividable by 7 ");
        }
        }
    }