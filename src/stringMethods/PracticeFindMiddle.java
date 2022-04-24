package stringMethods;

import utilities.StringHelper;

public class PracticeFindMiddle {
    public static void main(String[] args) {
        String name1="Alona";
        String name2="Taylor";
        System.out.println(StringHelper.getMiddle(name1));
        System.out.println(StringHelper.getMiddle(name2));
        System.out.println(StringHelper.getMiddle("Daria"));
        System.out.println(StringHelper.getMiddle("Muhammed"));
        System.out.println(StringHelper.getMiddle("Leonid"));

    }
}
