package characterClass;
public class UnderstandingCharacterClass {

    public static void main(String[] args) {
        System.out.println(Character.isDigit('9'));//true
        System.out.println(Character.isLowerCase('A'));//false
        System.out.println(Character.isUpperCase('b'));//false
        System.out.println(Character.isLetter('Q'));//true
        System.out.println(Character.isLetterOrDigit('1'));//true
        System.out.println(Character.isLetterOrDigit('S'));//true
        System.out.println(Character.isWhitespace(' '));//true
        System.out.println(Character.isSpaceChar(' '));//true


        char c2='$';
        System.out.println(!Character.isLetterOrDigit(c2)&&!Character.isSpaceChar(c2));//true

        char c3= 'A';
        String s="Ashjvyaa";
        System.out.println(s.contains(c3+""));//true

        char c4='a';
        boolean isC4Vowel=false;
        for (int i = 0; i < s.length(); i++) {
            if(c4==s.charAt(i)){
                isC4Vowel=true;
                break;
            }

        }








    }
}
