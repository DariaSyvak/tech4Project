package loops.controlStatements;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 numbers between 0 and 10 ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if (i == 5) continue;
            System.out.println(i);
        }

    }
}
