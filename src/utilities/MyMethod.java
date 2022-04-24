package utilities;

public class MyMethod {
    //write a method which is going to find the max of 4 numbers prints out it ONLY
    public static void printMaxOf4(int num1, int num2, int num3, int num4) {
        System.out.println(Math.max(Math.max(Math.max(num1, num2), num3), num4));
    }

    public static int findMaxOf4(int n1, int n2, int n3, int n4) {
        return (Math.max(Math.max(Math.max(n1, n2), n3), n4));

    }

    public static void isNumberBetween10and25(int num) {
        System.out.println(num >= 10 && num <= 25);
    }

    public static void printHalfAndQuarter(int n){

        if (n <= 50){
            System.out.println(n + " is in the 1st half");

            if (n <= 25){
                System.out.println(n + " is in the 1st quarter");
            }else{
                System.out.println(n + " is in the 2nd quarter");
            }
        }else {
            System.out.println(n + " is in the 2nd half");

            if (n <= 75){
                System.out.println(n + " is in the 3rd quarter");
            }else{
                System.out.println(n + " is in the 4th quarter");
            }

        }
    }
}