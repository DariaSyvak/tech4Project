package regex;

import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-z]+","hello"));
        System.out.println(Pattern.matches("[a-zA-Z ]{3,}","hello Class"));

        System.out.println(Pattern.matches("[a-zA-Z0-9_-]{8,15}","TechGlobal_-1"));
        System.out.println(Pattern.matches("\\([0-9]{3}\\)-[\\d]{3}-[\\d]{4}","(609)-551-8313"));






    }
}
