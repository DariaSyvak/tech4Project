package scanner;

import java.util.Scanner;

public class LearningScannerMultipleLines {
    public static void main(String[] args) {
        //DataType variable= data/value
        //DataType/ClassName variableName =new DataType/ClassName(if it needed)
        //creating an object
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Where is your address?");
        String userAdress= inputReader.nextLine();//objectName.methodName();
        System.out.println("User address is= ".concat(userAdress));

    }
}
