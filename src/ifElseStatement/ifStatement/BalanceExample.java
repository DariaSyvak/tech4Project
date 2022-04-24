package ifElseStatement.ifStatement;

public class BalanceExample {
    public static void main(String[] args) {
        double balance=-2;
        //expression which is gonna be true if balance is less than a 0
        boolean isBalanceLessThen0= balance<0;//false
        boolean isBalanceEquals100=balance==0;//false
        boolean isBalanceBiggerOrEqualThan1000=balance>=1000;//false

        boolean isBalanceNotEqual_1=balance!=-1;//true

        if(balance<0){
            //action my code to be executed
            System.out.println("Your balance is under 0");

        }
    }
}
