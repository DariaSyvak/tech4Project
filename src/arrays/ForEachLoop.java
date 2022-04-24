package arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        char[] chars = {'A', ' ', ',', '#', 'T', '6', '9'};
        System.out.println(chars.length);
        System.out.println("Element 1 = + " + chars[0] +
                "\nElement 2 = " + chars[1] +
                "\nElement 3 = " + chars[2] +
                "\nElement 4 = " + chars[3] +
                "\nElement 5 = " + chars[4] +
                "\nElement 6 = " + chars[5] +
                "\nElement 7 = " + chars[6]);


        for (int i = 0; i <chars.length; i++) {
            System.out.println("Element ="+chars[i]);

        }
        for (char element:chars){
            System.out.println("Element ="+element);
        }
    }


}
