package stringMethods;

public class _07_indexOf_lastIndexOf {
    /*They are used to find the index or last index of same char or string values in another String
    They are non-static methods and called with another String object
    They are return type ,and they return int as index
    They take either String or char as arguments

        NOTE: if the given char or String does not exist, then they return -1
        NOTE: if you are looking for an index of String, and it exists, it will return the first index of found match
        EXAMPLE: sentence.indexOf("Chicago"); // 7
         */

    public static void main(String[] args) {
        String sentence = "I like Chicago and Miami more than any other cities";
        System.out.println(sentence.indexOf("C"));
        System.out.println(sentence.indexOf('c'));
        System.out.println(sentence.lastIndexOf('c'));

        sentence.indexOf("Chicago");
        System.out.println(sentence.indexOf("Chicago"));
        sentence.indexOf("Miami");
        System.out.println(sentence.indexOf("Miami"));

      

    }
}
