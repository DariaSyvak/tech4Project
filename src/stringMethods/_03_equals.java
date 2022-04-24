package stringMethods;

public class _03_equals {
    public static void main(String[] args) {
        /*It compares 2 string with each other and tells if they are equal or not
        It is non -static ,and we will call it with other method String object
        It is return type and return boolean
        It takes a string as an argument
         */


        System.out.println("Melda".equals("Melda"));
        System.out.println("melda".equals("Melda"));

        String name1="John";
        String name2="James";
        String name3="James";
        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name3));

        String str1="hello";
        String str2=str1;
        boolean b= !(str1.equals(str2));
        System.out.println(b);


    }
}
