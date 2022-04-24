package mathClass;

public class FindRandom {
    public static void main(String[] args) {

        double random =Math.random();
        double random0And10= Math.random ()*100;

        System.out.println(random*100);

        int randomNum =(int)(Math.random()*21);
        System.out.println(randomNum);

        int randomNum1 =(int)(Math.random()*11)+10;
        System.out.println(randomNum1);

        //create a random number between 103-346
        //get the difference --=243 add +1
        //multiply it by 244
        //add the starting point to equation
        //random*(end point-start point+1) +start point --->included

        int rand103And346included =(int)(Math.random()*244)+103;
        System.out.println(rand103And346included);

        
        int random_50And50included=(int)(Math.random()*101)-50;
        System.out.println(random_50And50included);

    }
}
