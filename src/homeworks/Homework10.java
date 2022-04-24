package homeworks;

import utilities.CharacterHelper;
import utilities.ScannerHelper;


public class Homework10 {
    public static void main(String[] args) {
        System.out.println("________Task 1_________");

        String s = ScannerHelper.getAStringFromUser();
        if (s.length() == 0) System.out.println("Length is zero");
        else System.out.println("Length is = " + s.length()
                + "\nFirst char is = " + s.charAt(0) +
                "\nLast char is = " + s.substring(s.length() - 1));
        if (s.toLowerCase().contains("a") || s.toLowerCase().contains("e") || s.toLowerCase().contains("i") ||
                s.toLowerCase().contains("o") || s.toLowerCase().contains("u"))
            System.out.println("This String has vowel");
        else System.out.println("This String does not have vowel");


        System.out.println("_________Task 2__________");

        String s2=ScannerHelper.getAStringFromUser();
        if (s2.length()<3) System.out.println("Length is less than 3");
        else if (s2.length()%2==1) System.out.println(s2.charAt(s2.length()/2));
        else System.out.println(s2.substring(s2.length()/2-1,s2.length()/2+1));


        System.out.println("_________Task 3__________");

        String s3=ScannerHelper.getAStringFromUser();
        if (s3.length()<4) System.out.println("VALID INPUT");
        else System.out.println("First 2 characters are ="+s3.substring(0,2)+
                "\nLast 2 characters are = " +s3.substring(s3.length()-2)+
                "\nThe other characters  are = "+ s3.substring(2,s3.length()-2));

        System.out.println("__________Task 4___________");

        String s4= ScannerHelper.getAStringFromUser();
        if(s4.length()<2) System.out.println("Length is less than 2");
        else if (s4.substring(0, 1).equalsIgnoreCase(s4.substring(s4.length() - 2, s4.length()-1)))
            System.out.println("true");
        else System.out.println("false");


        System.out.println("_________Task 5___________");

        String n1=ScannerHelper.getAStringFromUser();
        String n2=ScannerHelper.getAStringFromUser();
        if (n1.length()<2||n2.length()<2) System.out.println("INVALID INPUT");
        else System.out.println(n1.substring(1,n1.length()-1)+n2.substring(1,n2.length()-1));

        System.out.println("_________Task 6____________");

        String s6=ScannerHelper.getAStringFromUser();
        if (s6.length()<4) System.out.println("INVALID INPUT");
        else if(s6.startsWith("xx") && s6.endsWith("xx")) System.out.println("true");
        else System.out.println("false");







    }


}
