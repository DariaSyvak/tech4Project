package scanner;

import utilities.MathHelper;
import utilities.ScannerHelper;

public class Test {
    public static void main(String[] args) {
        int n = ScannerHelper.getNumberFromUser();
        System.out.println(n);

        double n2 = ScannerHelper.getDoubleFromUser();
        System.out.println(n2);

        int n3 = ScannerHelper.getNumWithMessage("Give me your number");
        System.out.println(n3);


        int num = ScannerHelper.getNumberWithMsg("number");
        System.out.println(num);

    MathHelper.if10or25(12);


    }
}
