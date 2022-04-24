package ifElseStatement.ifElseStatement;

public class Exercise1 {
    public static void main(String[] args) {
        int num1=(int)(Math.random()*(90-45+1)+45);
        int num2=(int)(Math.random()*(90-45+1)+45);
        int num3=(int)(Math.random()*(90-45+1)+45);

        int max,min,middle;

        if (num1 > num2 && num1 > num3){
            max = num1;
        } else if (num2 > num1 && num2 > num3){
            max = num2;
        }else{
            max = num3;
        }

        if (num1 < num2 && num1 < num3){
            min = num1;
        } else if (num2 < num1 && num2 < num3){
            min = num2;
        }else{
            min = num3;
        }

        if (num1 != max && num1 != min){
            middle = num1;
        }else if(num2 != max && num2 != min){
            middle = num2;
        }else{
            middle = num3;
        }

        System.out.println("Random number 1 :" + num1
                + "\nRandom number 2 :" + num2
                +"\nRandom number 3 :" +num3 +
                "\nmax = " + max +
                "\nmin = " +  min+
                "\nmid = " + middle);
        }
    }

