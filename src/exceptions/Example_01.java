package exceptions;

public class Example_01 {
    public static void main(String[] args) {
        String[] names = {"Alex", "John", "Max"};
        //System.out.println(names[-5]);

        try {
            System.out.println(names[-5]);
        } catch (Exception exception) {
           exception.printStackTrace();//java.lang.ArrayIndexOutOfBoundsException: -5 at exceptions.Example_01.main(Example_01.java:9)
        }
        System.out.println("End of the program");
    }
}