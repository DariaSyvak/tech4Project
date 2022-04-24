package homeworks;

import utilities.ScannerHelper;

public class Homework09 {
    public static void main(String[] args) {

        // Task 1
        String name = ScannerHelper.getANameFromUser();
        System.out.println("The length of the name is = " + name.length());
        System.out.println("The firs character in the name = " + name.charAt(0));
        System.out.println("The last character in the name = " + name.charAt(name.length() - 1));
        System.out.println("The first 3 characters in the name are = " + name.substring(0, 3));
        System.out.println("The last 3 characters in the name are = " + name.substring(name.length() - 3));
        if (name.charAt(0) == 'A' || name.charAt(0) == 'a')
            System.out.println("You are in the club!");
        else System.out.println("Sorry,you are not in the club ");

        //Task 2

        String city = ScannerHelper.getAStringFromUser();
        if (city.toLowerCase().contains("chicago") || city.toUpperCase().contains("CHICAGO"))
            System.out.println("You are in the club");
        else if (city.toLowerCase().contains("des plaines") || city.toUpperCase().contains("DES PLAINES"))
            System.out.println("You are welcome to join to the club");
        else System.out.println("Sorry, you will never be in the club");


        //Task 3
        String c1 = ScannerHelper.getAColorFromUser();
        if (c1.toLowerCase().contains("green") || c1.toUpperCase().contains("GREEN"))
            System.out.println("Green is in the list");

         if (c1.toLowerCase().contains("red") || c1.toUpperCase().contains("RED"))
            System.out.println("Red is in the list");

         if ((c1.toLowerCase().contains("red") || c1.toUpperCase().contains("RED")) &&
                (c1.toLowerCase().contains("green") || c1.toUpperCase().contains("GREEN")))
            System.out.println("Green and red are in the list");

        else System.out.println("Green and red are not in the list");


        String string ="   Java is fun   ";
        String str=((string.trim().toLowerCase()));

        System.out.println("The first word in the str is = " + str.substring(0,str.indexOf(" ")));
        System.out.println("The first second in the str is = " + str.substring(str.indexOf(" ")+1,str.lastIndexOf(" ")));
        System.out.println("The first third in the str is = " + str.substring(str.lastIndexOf(" ")));
    }
}
