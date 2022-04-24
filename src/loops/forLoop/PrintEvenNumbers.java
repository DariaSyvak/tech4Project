package loops.forLoop;

import utilities.MathHelper;

public class PrintEvenNumbers {
    public static void main(String[] args) {

        //1 way
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
        //2 way
        for (int i = 0; i <= 10; i++) {
            if (MathHelper.isEven(i)) System.out.println(i);
        }
        //3 way
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
        //4 way
        for (int i = 0; i <= 10; i++) {
            System.out.println(i++);
        }

    }
}