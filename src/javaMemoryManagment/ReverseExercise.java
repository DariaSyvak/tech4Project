package javaMemoryManagment;

public class ReverseExercise {
    public static String reverse1(String s){
        String r="";
        for (int i = s.length()-1; i >=0 ; i--) {
            r+=s.charAt(i);
        }
        return r;
    }
        public static String reverse2(String s){
            StringBuilder r= new StringBuilder();
            for (int i = s.length()-1; i >=0 ; i--) {
                r.append(s.charAt(i));
            }
            return r.toString();
        }
        public static String reverse3(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
        }
        public static boolean isPalindrome(String s){
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
        }

    public static void main(String[] args) {
        System.out.println(reverse1("Civic"));
        System.out.println(reverse2("Kayak"));
        System.out.println(reverse3("LOL"));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("Civic"));
        System.out.println(isPalindrome("123321"));
    }

}
