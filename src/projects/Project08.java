package projects;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Project08 {
    //TASK-1
    public static int countMultipleWords(String[] array) {
        int counter = 0;
        for (String s : array) {
            if (s.trim().contains(" ")) counter++;
        }
        return counter;

    }


    //TASK-2
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers) {
        Iterator<Integer> iter = numbers.iterator();

        while (iter.hasNext()) {
            if (iter.next() < 0) iter.remove();
        }
        return numbers;
    }

    //TASK-3
    public static boolean validatePassword(String password) {
        boolean digit1 = false, uppercase = false, lowercase = false, specialChar = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) digit1 = true;
            else if (Character.isUpperCase(password.charAt(i))) uppercase = true;
            else if (Character.isLowerCase(password.charAt(i))) lowercase = true;
            else specialChar = true;
        }
        return password.length() >= 8 && password.length() <= 16 && digit1 && uppercase && lowercase && specialChar && !password.contains(" ");
    }

    //TASK-4
    public static boolean validateEmailAddress(String email) {
        boolean notHasPeriod = true;
        int fAt = email.indexOf("@"), lAt = email.lastIndexOf("@"), lDot = email.lastIndexOf(".");
        for (int i = lAt + 1; i < lDot; i++) if (email.charAt(i) == '.') notHasPeriod = false;
        return lAt < lDot && notHasPeriod && email.contains("@") && fAt == lAt && fAt >= 2
                && lDot - lAt - 1 >= 2 && email.length() - lDot + 1 >= 2;


    }


    public static void main(String[] args) {
        String[] array = {"foo", "", " ", "foo bar", "java is fun", " ruby "};
        System.out.println(countMultipleWords(array));
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
        System.out.println(removeNegatives(list));
        System.out.println(validatePassword("Abcd123!"));
        System.out.println(validateEmailAddress("d.a@jm.co"));


        //TASK_


    }
}
