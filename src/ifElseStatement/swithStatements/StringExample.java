package ifElseStatement.swithStatements;

import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hello,tell me a greeting ");
        String greeting = scan.nextLine();


        switch (greeting){
            case"Good morning!":
                System.out.println("Its morning ");
                break;
            case"Good afternoon!":
                System.out.println("its afternoon");
                break;
            case"Good evening!":
                System.out.println("its evening");
                break;
            default:
                System.out.println("its not correct ");
        }
    }
}
