package loops.controlStatements;

import utilities.ScannerHelper;

public class Practice01 {
    public static void main(String[] args) {
        int num1= ScannerHelper.getNumberFromUser();
        int num2=ScannerHelper.getNumberFromUser();

        for (int i = Math.max(num1,num2); i >= Math.min(num1,num2); i--) {
            if(i<10)break;////break in the beginning of running code and not let it run if it's less than 10
            System.out.println(i);
//            if (i==10)break;///doesn't check  when its after

        }
    }
}
