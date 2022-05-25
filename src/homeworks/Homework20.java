package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Homework20 {

    //TASK-1
    public static boolean hasLowerCase(String str) {
        return str.length() != str.replaceAll("[a-z]", "").length();
    }

    //TASK-2
    public static ArrayList<Integer> noZero(ArrayList<Integer> arg) {
        Iterator<Integer> it = arg.iterator();
        while (it.hasNext()) if (it.next() == 0) it.remove();
        return arg;
    }

    //TASK-3
    public static int[][] numberAndSquare(int[] arr) {
        int[][] newArr = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            int[] arr1 = {arr[i], arr[i] * arr[i]};
            newArr[i] = arr1;
        }
        return newArr;
    }

    //TASK-4
    public static boolean containsValue(String[] string, String str) {
        Arrays.sort(string);
        return Arrays.binarySearch(string, str) >= 0;
    }

    //TASK-5
    public static String reverseSentence(String str) {
        String[] strArr = str.trim().split(" ");
        StringBuilder strNew = new StringBuilder();
        if (!str.trim().contains(" ")) return "There is not enough words!";
        for (int i = strArr.length - 1; i >= 0; i--) {
            strNew.append(strArr[i].toLowerCase() + " ");
        }
        return strNew.substring(0, 1).toUpperCase().concat(strNew.substring(1)).trim();
    }

    //TASK-6
    public static String removeSpecialsDigits(String str) {
        return str.replaceAll("[^a-zA-Z\\s]", "");
    }

    //TASK-7
    public static String[] removeArraySpecialsDigits(String[] str) {

        for (int i = 0; i < str.length; i++) str[i] = removeSpecialsDigits(str[i]);
        return str;
    }

    //TASK-8
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> str1, ArrayList<String> str2) {
        ArrayList<String> newStr = new ArrayList<>();
        for (String s1 : str1) {
            for (String s2 : str2) {
                if (s1.equals(s2) && !newStr.contains(s1)) newStr.add(s1);
            }
        }
        return newStr;
    }

    //TASK-9
    public static ArrayList<String> noXInVariables(ArrayList<String> str) {
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).replaceAll("[xX]", "").length() == 0) str.remove(i--);
            else str.set(i, str.get(i).replaceAll("[xX]", ""));
        }
        return str;
    }


    public static void main(String[] args) {
        ArrayList<String> strList1 = new ArrayList<>(Arrays.asList("abc", "def", "123", "abc"));
        ArrayList<String> strList2 = new ArrayList<>(Arrays.asList("abc", "asdads", "asdasd"));
        ArrayList<String> noX = new ArrayList<>(Arrays.asList("aXc", "asdaXX", "xxdasd", "Xxxx"));
        System.out.println(hasLowerCase(""));
        System.out.println(noZero(new ArrayList(Arrays.asList(0, 5, 4, 0, 0))));
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1, 2, 3})));
        System.out.println(containsValue(new String[]{"lol", "mol", "poll"}, "pol"));
        System.out.println(reverseSentence("Java"));
        System.out.println(removeSpecialsDigits("Javart@#"));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"l123ol", "m$#@ol", "po,ll  ", "%$#"})));
        System.out.println(removeAndReturnCommons(strList1, strList2));
        System.out.println(noXInVariables(noX));

    }
}
