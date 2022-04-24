package stringMethods;

public class _02_concat {
    public static void main(String[] args) {
        /*It is used to combine multiple string end form a new one
        it is non-static  ,and we call it with an object
        It is a return type method ,and it returns a new string
        It takes argument
        It takes a string as an argument
        */


        String s1="Tech";
        String s2="Global";
        String s3=s1.concat(s2);
        System.out.println(s3.concat( " School"));
        System.out.println("Hello".concat(" World!"));
        System.out.println("Hello".concat(" ").concat("World!"));
        System.out.println("Hello".concat(" ")+"World!");
    }
}
