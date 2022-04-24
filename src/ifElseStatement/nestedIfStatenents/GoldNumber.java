package ifElseStatement.nestedIfStatenents;

public class GoldNumber {
    public static void main(String[] args) {
        int number = (int) (Math.random() * (50 - (-50) + 1) + (-50));
        int point=0;
        System.out.println(number);
        if (number>0){
            point+=10;
            System.out.println("You win 10 points");
        }
            if(number>25) {
                point += 10;
                System.out.println("Positive,you win extra 10 points");
            }else if(number==7){
                point+=100;
                    System.out.println("You win 100 points");
                }
            else if (number<0){
                if(number<-25){
                System.out.println("you win extra 10 points");
                if(number==-7){
                    point+=100;
                    System.out.println("You win extra 100 points");
                }


            }
        }
    }
}
