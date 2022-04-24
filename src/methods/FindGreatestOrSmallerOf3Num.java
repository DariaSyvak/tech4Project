package methods;

import utilities.MathHelper;

public class FindGreatestOrSmallerOf3Num {
    public static void main(String[] args) {
      //Math.max(5,1,10);
        int max=MathHelper.maxOfThree(5,1,10);
        System.out.println("Max of three number = "+max);

        double max2 = MathHelper.maxOfThree(11.1,12.2,12.3);
        System.out.println("Max of three double = "+max2);

        int min=MathHelper.minOfThree(2,3,1);
        System.out.println("number "+min);

        double min2=MathHelper.minOfThree(12.4,11.2,11.4);
        System.out.println("number "+min2);

    }
}
