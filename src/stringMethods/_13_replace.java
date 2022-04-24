package stringMethods;

public class _13_replace {
    public static void main(String[] args) {

        //use to replace some values in string with another value
        //It is non-static
        //It is return type
        //it is take 2 arguments (char or string)

        String sentence= "Can I can a can ?";
        System.out.println(sentence.replace("can","xxx"));
        String s="banana";
        System.out.println(s.replace("a","$"));


        String name = "John"; //o replace with ooo
        System.out.println(name.replaceFirst("o", "ooo"));

        System.out.println("Hello".replace("good", "nice"));
    }
}
