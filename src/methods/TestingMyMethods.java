package methods;


import utilities.MyMethod;

public class TestingMyMethods {
    public static void main(String[] args) {
        int num1=2,num2=6,num3=3,num4=9;

        System.out.println(Math.max(Math.max(Math.max(num1, num2), num3), num4));
        //now with method (VOID METHOD)
        MyMethod.printMaxOf4(num1,num2,num3,num4);
        //now with RETURN METHOD
        System.out.println(MyMethod.findMaxOf4(num1,num2,num3,num4));

        //write a program which finding the abs difference between max and num1
        Math.abs(Math.max(Math.max(Math.max(num1, num2), num3), num4)-num1);//first way
        Math.abs(MyMethod.findMaxOf4(num1,num2,num3,num4)-num1);//second way

    }
}
