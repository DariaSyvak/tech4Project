package stringMethods;

public class _11_startsWith_endsWith {
    public static void main(String[] args) {

        /*
        Method Task: They are used to finding out if the string starts with or ends with another letter or string
        -They are non-static as we call them with objects
        -They return boolean
        -They take String as an argument
         */

        String str ="Today is Sunday";
        System.out.println(str.startsWith("Today"));
        System.out.println(str.startsWith("today"));
        System.out.println(str.endsWith("sunday"));

        System.out.println(str.toUpperCase().endsWith("SUNDAY"));
        System.out.println(str.startsWith("is",6));

    }
}
