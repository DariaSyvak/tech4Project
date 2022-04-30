package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicRegex {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("o");
        Matcher matcher=pattern.matcher("I love TechGlobal");
        System.out.println(matcher.matches());
        while(matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
        }
        System.out.println(Pattern.matches("[xyz]", "xyz"));
        System.out.println(Pattern.matches("[xyz]", "xxxx"));
        System.out.println(Pattern.matches("[xyz]", "x"));
        System.out.println(Pattern.matches("[^xyz]", "y"));
        System.out.println(Pattern.matches("[^a-z]", "123"));

    }
}
