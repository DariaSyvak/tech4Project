package stringMethods;

public class _08_length {
    public static void main(String[] args) {
        /*Count the total number of the characters in a String and return it as int
        Non-static so called with object
        Its return type and return int (total number of characters)
        It does not take any characters
         */


        String city ="Chicago";
        System.out.println(city.length());
        System.out.println(city.length()+3);

        String company="TechGlobal";
        int size =company.length();
        System.out.println(size);
    }
}
