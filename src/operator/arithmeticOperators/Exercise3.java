package operator.arithmeticOperators;

public class Exercise3 {
    public static void main(String[] args) {

        double salary = 90_000.00;
        double year =salary/12;
        double week =salary/26;
        double byWeek=salary/52;
        /*
        1.Create a variable
        2. Do the equation
        3.Print them out
         */
        System.out.println("Monthly salary " + year);
        System.out.println("Weekly salary "+week);
        System.out.println("Every week salary "+byWeek);



    }
}
