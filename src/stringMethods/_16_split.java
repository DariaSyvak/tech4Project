package stringMethods;

import java.util.Arrays;

public class _16_split {
    public static void main(String[] args) {
        String s ="Banana is nice";

        String[]sSplitFromSpace=s.split(" ");
        System.out.println(Arrays.toString(sSplitFromSpace));

        String[] sSplitFromI=s.split("i");
        System.out.println(Arrays.toString(sSplitFromI));

        String[] sSplitFromIs=s.split("is");
        System.out.println(Arrays.toString(sSplitFromIs));

        String[] sSplitFromA=s.split("a");
        System.out.println(Arrays.toString(sSplitFromA));
    }
}
