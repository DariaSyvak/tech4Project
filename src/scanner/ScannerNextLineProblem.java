package scanner;
import java.util.Scanner;
public class ScannerNextLineProblem {
    public static void main(String[] args) {
        /*
        name -next()
        age-nextInt()
        myBrainOk-nextBoolean()
        fav quote -nextLine()

         */

        Scanner userImput= new Scanner(System.in);
        System.out.println("Whats your name?");
        String name=userImput.next();


        System.out.println("Whats your age?");
        int age=userImput.nextInt();

        System.out.println("Is your brain fried?");
        boolean myBrainOk=userImput.nextBoolean();

        System.out.println("Whats your address?");
        userImput.nextLine();
        String address=userImput.nextLine();
        System.out.println("User name is =" + name+
                "\nUser age is =" + age+
                "\nDoes user brain is ok?= " + myBrainOk+
                "\nUser address is= "+ address);


        Scanner userNewImput =new Scanner(System.in);
        System.out.println("First number:");
        int num1=userImput.nextInt();
        System.out.println("Second number:");
        int num2=userImput.nextInt();
        System.out.println("Third number:");
        int num3=userImput.nextInt();
        int sum1= num1 +num2 +num3;
        System.out.println("Sum of the numbers is =" +sum1);




    }
}
