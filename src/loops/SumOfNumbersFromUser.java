package loops;

import java.util.Scanner;

public class SumOfNumbersFromUser {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want to enter");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println("Please enter number " + i);
            sum += input.nextInt();
        }
        System.out.println(sum);


        //While
        System.out.println("Please enter how many numbers you want to enter");
        int times = input.nextInt();

        int count = 1;
        int sum2 = 0;
        while (count <= times) {
            System.out.println("Please enter number" + count);
            sum2 += input.nextInt();
            count++;
        }
            System.out.println(sum2);

        }

    }
