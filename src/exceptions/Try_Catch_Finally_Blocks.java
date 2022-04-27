package exceptions;

public class Try_Catch_Finally_Blocks {
    public static void main(String[] args) {

        try {
            System.out.println(3 / 0);
        } catch (Exception s) {
            s.printStackTrace();
        } finally {
            System.out.println("Test this exception");
        }
        System.out.println("End of the program");
    }
}
