package methods;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;

public class FindIfNumberIsEvenOrOdd {

    public static void main(String[] args) {

        int number = RandomNumberGenerator.getRandomNumber(17, 33);
        System.out.println("The number generated is " + number);

        if (MathHelper.isOdd(number)) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}