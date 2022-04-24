package regex;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        String str="Hello world";
        str=str.replaceAll("[aeiouAEIOU]","");
        System.out.println("After = "+str);
        String str1="Hello world";
        str1=str1.replaceAll("[aeiouAEIOU]","\\$");
        System.out.println("With $ = "+str1);
        String str2="Hello12world3";
        str2=str2.replaceAll("[^1-9]","");
        System.out.println(str2);
        String str3="abc 123 $#^";
        str3=str3.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str3);




    }
}
