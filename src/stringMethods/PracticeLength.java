package stringMethods;

import java.util.Scanner;

public class PracticeLength {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        System.out.println("Enter your favorite book name");
        String name= userInput.nextLine();
        System.out.println("Enter your favorite quote");
        String quote= userInput.nextLine();

        System.out.println("the length of \""+name+"\"is= "+name.length());
        System.out.println("the length of \""+quote+"\"is= "+quote.length());

    }
}
