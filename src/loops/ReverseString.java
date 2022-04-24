package loops;

import utilities.CharacterHelper;
import utilities.ScannerHelper;

public class ReverseString {
    public static void main(String[] args) {
        String name = "";
        String s = ScannerHelper.getANameFromUser();
        for (int i = s.length() - 1; i >= 0; i--) {
            name += s.charAt(i);
        }
        System.out.println("The reverse name is " + name);
        System.out.println("Reverse name ti uppercase " + name.toUpperCase());
    }

}


