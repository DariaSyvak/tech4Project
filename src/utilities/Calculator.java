package utilities;

public class Calculator {
    /*
    1.we need a proper name
    2.Decide its accessibility (private /public)
    3.Decide it accessibility way (You want to call it with class name or object name
    static--You call with a class name
    non-static--You call it with object name
    4.Decide if it returns something or not
    if it returns-what is it
    if it not returns anything-put void
    5.Does it take any argument
    if yes -then hom many
    NOTE: if your method not void meaning it is return keyword
     in the body of the method
     NOTE:If your method returns int then the variable use next to
     return keyword in the bode must be an int
    NOTE: every method must have a body that runs a task
    NOTE:We can have multiple method shearing same name
    in same class only if they have different arguments
    NOTE:DO NOT EVER CREATE METHOD INSIDE METHOD
     */

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static int absolute(int num1, int num2) {
        return Math.abs(num1 - num2);
    }

   public static int findAbsIf(int num1, int num2) {
        return(num1>num2)?num1-num2:num2-num1;}

    public static double absolute(double num1,double num2){
        return Math.abs(num1-num2);
    }
    public static int product(int num1,int num2){
        return num1*num2;
    }
    public static double product(double num1,double num2){
        return num1*num2;
    }

}
