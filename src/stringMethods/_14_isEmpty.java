package stringMethods;
//it is used to see if given string is empty or not
//it is non -static
//it returns boolean
//it does not take any arguments

public class _14_isEmpty {
    public static void main(String[] args) {
        String name="John";
        System.out.println(name.isEmpty());
        String s1 = "hello world";
        System.out.println(s1.isEmpty());

        System.out.println(name.replace("John", "").isEmpty());

        System.out.println("Hello".toLowerCase().replace("hello", ""));
        System.out.println("".isEmpty());
    }
}
