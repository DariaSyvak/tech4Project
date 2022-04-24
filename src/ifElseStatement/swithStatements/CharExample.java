package ifElseStatement.swithStatements;

public class CharExample {
    public static void main(String[] args) {

        char character= 'A' ;

        switch (character){
            case 'A':
                System.out.println("It is uppercase and it is the first letter ");
                break;
            case '5':
                System.out.println("it is a digit");
                break;
            case '$':
                System.out.println("it is a dollar sign");
                break;
            default:
                System.out.println("it is not A,5 or sign");
        }

    }
}
