package utilities;

public class MathHelper {

    //Create a method that takes 3 ints and return max

    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static double maxOfThree(double num1, double num2, double num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static int minOfThree(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }

    public static double minOfThree(double num1, double num2, double num3) {
        return Math.min(num1, Math.min(num2, num3));
    }
    public static boolean isEven(int num){
        return num %2 ==0 ;
    }
    public static boolean isOdd(int num){
        return num%2==1;
    }
    public static boolean isPositive(int num){
        return num>0;
    }
    public static boolean isNegative(int num){
        return num<0;
    }
    public static boolean isZero(int num){
        return num==0;
    }
    public static void if10or25(int num1){
        if (num1>=10&&num1<=25){
            System.out.println("True");
        }
            else{
            System.out.println("False");
        }

    }

}

