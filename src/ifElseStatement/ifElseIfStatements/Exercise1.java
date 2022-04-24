package ifElseStatement.ifElseIfStatements;

public class Exercise1 {
    public static void main(String[] args) {
        int n1 =(int)(Math.random()*(10-(-10)+1))+(-10);
        System.out.println("Random is " +n1);
        if(n1>0){
            System.out.println(" positive");

        }else if(n1<0){
            System.out.println(" negative");

        }else{
            System.out.println("ZERO");
        }
    }
}
