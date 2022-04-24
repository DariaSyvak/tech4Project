package stringMethods;

public class _06_charAt {


    /*It helps to get a character at a specific index
        NOTE: Index starts with zero
        -It is non-static as we call it with object name
        -It is a return type and returns char primitive
        -It takes an argument which is int (index)

        NOTE: It will throw StringIndexOutOfBoundsException when the given index is not in the bounds

     */


    public static void main(String[] args) {
        String name = "Alex";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));


   // char first=name.charAt(0);
   // if (first=='A'||first=='a')
    if (name.charAt(0)=='A'||name.charAt(0)=='a')
    {
        System.out.println("This name start with A");
    }
    else System.out.println("Not staring with A");
}
}