package casting;

public class ConvertingStringToPrimitives {
    public static void main(String[] args) {

        String num1="23";
        String num2="12";

        int num1int=Integer.parseInt(num1);//string-->int
        int num2int=Integer.parseInt(num2);//return primitive


        Integer num1Integer =Integer.valueOf(num1);//returns wrapper class
        Integer num2Integer =Integer.valueOf(num2);//string-->integer

        int num1IntValueOf=Integer.valueOf(num1);//String-->integer-->int

        System.out.println(num1+num2);
        System.out.println(num1int+num2int);
        System.out.println(num1Integer+num2Integer);
    }
}
