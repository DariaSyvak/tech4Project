package ifElseStatement.nestedIfStatenents;


public class NumberPositiveAndOdd {
    public static void main(String[] args) {
        int number = (int) (Math.random() * (50 - (-50) + 1) + (-50));
        System.out.println(number);
        if (number > 0) {
            System.out.println("Positive");
            if(number%2==0){
                System.out.println("Positive end Even");
            }else {
                System.out.println("Positive and Odd");
            }



        }else if (number< 0) {
            System.out.println("Negative");
            if (number % 2 == 0) {
                System.out.println("Negative end Even");
            } else {
                System.out.println("Negative and Odd");
            }
            }if ( number==0) {
                System.out.println("Zero");
            }
        }
    }


