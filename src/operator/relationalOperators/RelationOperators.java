package operator.relationalOperators;

public class RelationOperators {
    public static void main(String[] args) {
        int a= 4;
        int b=10;


        boolean isaAEqualToB =a==b;
        boolean isANotEqualToB= a!=b ;
        System.out.println("a=b : " +isaAEqualToB);
        System.out.println("a!=b: " +isANotEqualToB);

        boolean isAGreaterThanB =a>b;
        boolean isASmallerThanB =a<b;
        boolean isAGreaterOrEqualThanB =a>=b;
        boolean isASmallerOrGreaterThanB =a<=b;
        System.out.println("a>b :"+isAGreaterThanB);
        System.out.println("a<b :"+ isASmallerThanB);
        System.out.println("a>=b:"+ isAGreaterOrEqualThanB);
        System.out.println("a<=b:"+ isASmallerOrGreaterThanB);



    }
}
