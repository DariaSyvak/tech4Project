package casting;

import java.util.Scanner;

public class ExerciseRecap {
    public static void main(String[] args) {
        /*
        //write a program ASK user to put 5 grades print out avg
        Scanner userInput=new Scanner(System.in);

        System.out.println("what is 1 your number?");
        String num1= userInput.next();
        String num2= userInput.next();
        String num3= userInput.next();
        String num4= userInput.next();
        String num5= userInput.next();

        double num1D=Double.parseDouble(num1);
        double num2D=Double.parseDouble(num2);
        double num3D=Double.parseDouble(num3);
        double num4D=Double.parseDouble(num4);
        double num5D=Double.parseDouble(num5);
        System.out.println((int)((num1D+num2D+num3D+num4D+num5D)/5));




       /* System.out.println("What is your balance?");
        String balance= userInput.next();
        System.out.println("What is your next 3 transactions?");
        String tr1= userInput.next(),tr2=userInput.next(),tr3= userInput.next();

        Double balanceD=Double.valueOf(balance),tr1D=Double.valueOf(tr1),tr2D=Double.valueOf(tr2),
                tr3D=Double.valueOf(tr3);

        System.out.println("Your balance is now =" +(balanceD-tr1D-tr2D-tr3D));
        //OR//
        System.out.println("Your balance is now =" + ((Double.valueOf(balance)
                -Double.valueOf(userInput.next())
                -Double.valueOf(userInput.next())
                -Double.valueOf(userInput.next())


        )));
*/
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter your name");
        String fullName = input.nextLine();

        System.out.println("Enter your age");
        String age= input.next();

        input.nextLine();

        System.out.println("Enter your phone number ");
        String number= input.nextLine();

        System.out.println("Enter ages of your kids");
        String age1= input.next(),age2= input.next(),age3= input.next();
        int age1Int=Integer.parseInt(age1),age2Int=Integer.parseInt(age2),age3Int=Integer.parseInt(age3);


        int oldest=Math.max(age3Int,Math.max(age1Int,age2Int));
        int youngest=Math.min(age3Int,Math.min(age1Int,age2Int));
        int ageDifference=Math.abs(oldest-youngest);


        System.out.println("Your name is "+fullName+ " your phone number is"+ number+
                ",\nYou are "+ age+ "years old, Your oldest kid is "+oldest+"years old, your\n" +
                "youngest is "+youngest+ ", difference between oldest and youngest is "+ageDifference+
                "\nyears. " );







    }


}
