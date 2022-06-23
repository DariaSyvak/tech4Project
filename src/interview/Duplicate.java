package interview;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {
    // daria your code here
    public static int [] duplicates(int [] nums){
        Arrays.sort(nums);
        HashSet<Integer> noD = new HashSet<>();

        for(int i=0;i<nums.length-1;i++)if(nums[i]==nums[i+1])noD.add(nums[i]);

        int[] result = new int[noD.size()];
        int i = 0;
        for(Integer dup : noD) result[i++] = dup;

        return result;
    }

    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5,1,2,3,4,5,7,7,0,0};
        System.out.println(Arrays.toString(duplicates(arr1)));
    }


}
