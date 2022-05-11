package myPractice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map_practice {


    public static LinkedHashMap<Character, Integer> countCharacter(String chars) {
        chars = chars.toLowerCase().replaceAll("\\s", "");
        LinkedHashMap<Character, Integer> character = new LinkedHashMap<>();
        for (char c : chars.toCharArray()) {
            if (character.containsKey(c)) character.put(c , character.get(c) + 1);
            else character.put(c, 1);
        }
        return character;
    }

    public static TreeMap<String,String>countCities(String str){
        TreeMap<String,String>cities=new TreeMap<>();
        for (String s : str.substring(1).split("\\{")) {
            cities.put(s.substring(0,s.indexOf("}")), s.substring(s.indexOf("}")+1));
        }
return cities;
    }


    public static String sorted(String s){
            for (int i = 0; i < s.length() - 1; i++) {
                char c1 = s.charAt(i), c2 = s.charAt(i + 1);
                if (
                        (Character.isLetter(c1) && Character.isDigit(c2)) ||
                                (Character.isLetter(c2) && Character.isDigit(c1)))
                    s = s.substring(0, i + 1) + " " + s.substring(i + 1);
            }
            System.out.println(s);

            StringBuilder sb = new StringBuilder();
            for (String o : s.split(" ")) {
                char[] chars = o.toCharArray();
                Arrays.sort(chars);
                for (char c : chars) sb.append(c);
            }
            return sb.toString();

    }


    public static void main(String[] args) {
        System.out.println(countCharacter("Banana lama"));
        System.out.println(countCities("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));
        System.out.println(sorted("DC501GCCCA098911"));

    }
}
