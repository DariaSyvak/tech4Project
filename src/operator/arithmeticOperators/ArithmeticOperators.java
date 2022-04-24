package operator.arithmeticOperators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        double number1 = 9;
        double number2 =3;
        number1=5;
        //addition
        double sum =number1+number2;
        //subtraction
        double sub=number1-number2;
        //multiplication
        double times= number1*number2;
        //division
        double div=number1/number2;
        //remainder
        double remainder =number1 % number2; //5-(3*1)=2
        System.out.println("Addition is= "+ sum);
        System.out.println("Subtraction is= "+sub);
        System.out.println("Multiplication is= " +times);
        System.out.println("division is= "+div);
        System.out.println("Remainder is= "+remainder);


    }
}
