package codingbat;

public class Array3_CountClumps {

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 1, 1};
        System.out.println(countClumps(nums1));
    }

    public static int countClumps(int[] nums) {
        int clumps = 0;

        for(int i = 0; i < nums.length; i++){
            int currClump = 1;
            //second loop
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]) {
                    currClump++;
                    if(j == nums.length - 1){
                        i = j -1;
                        break;
                    }
                }
                else {
                    i = j -1;
                    break;
                }
            }

            if(currClump > 1) clumps++;
        }

        return clumps;
    }

}
