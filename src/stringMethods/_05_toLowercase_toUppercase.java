package stringMethods;

public class _05_toLowercase_toUppercase {
    public static void main(String[] args) {

        /* Methods are used to convert letters of string to uppercase or lowercase
         They are non-static methods that u can call them with object of string class
         They are return type methods ,and they return the modified String object back
         They don't take any arguments


         */
        String sq="HeLLO world";
        System.out.println(sq);
        System.out.println(sq.toLowerCase());
        System.out.println(sq.toUpperCase());


        String sentence ="I paid $100.99 to by airpods";
        String s1 =sentence.toLowerCase();
        String s2=sentence.toUpperCase();
        System.out.println(s2.toLowerCase().toUpperCase().toLowerCase());
    }
}
