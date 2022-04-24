package utilities;

public class CharacterHelper {

    public static boolean isSpace(char space) {
        return space == ' ';
    }

    public static boolean isDigit(char digit) {
        return digit >= 48 && digit <= 57;
    }

    public static boolean isUppercase(char upp) {
        return upp >= 65 && upp <= 90;
    }

    public static boolean isLowercase(char low) {
        return low >= 97 && low <= 122;
    }

    public static boolean isLetter(char letter) {
        return (letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122);
    }

    public static boolean isVowel(char vowel) {
        return vowel == 'A' || vowel == 'E' || vowel == 'O' || vowel == 'U'
                || vowel == 'I' || vowel == 'a' || vowel == 'e' || vowel == 'o' || vowel == 'u' || vowel == 'i';
    }

    public static boolean isConsonant(char con) {
        return (con >= 65 && con <= 90) || (con >= 97 && con <= 122) && (!(con == 'A' || con == 'E' || con == 'O' || con == 'U'
                || con == 'I' || con == 'a' || con == 'e' || con == 'o' || con == 'u' || con == 'i'));
    }
}