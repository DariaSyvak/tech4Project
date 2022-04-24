package mathClass;

public class ExerciseMathRandom {
    public static void main(String[] args) {
        //Create a program which is generating between 45-98//

    int num1 =(int)(Math.random()*(85-67+1)+67);
    int  num2=(int)(Math.random()*(85-67+1)+67);

        System.out.println("Random 1 is = "+num1 +"\nRandom 2 is ="+num2+
                "\nMax is = "+ Math.max (num1,num2)+"\nMin is ="+Math.min(num1,num2));

        /*/*Write a program which is going to
             generate three random numbers between 32-74
             and print out the max, min and middle one with message.
Ex:
Input: 54, 43, 64
Output:
Max is 64
Min is 43
Middle is 54*/
        int numb1=(int)(Math.random()*(32-74+1)+74);
        int numb2=(int)(Math.random()*(32-74+1)+74);
        int numb3=(int)(Math.random()*(32-74+1)+74);

        System.out.println("Max is "+(Math.max(Math.max(numb1,numb2),numb3))+
                "\nMin is "+(Math.min(Math.min(numb1,numb2),numb3)));

    }
}
