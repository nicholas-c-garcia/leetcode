package Leetcode75.PrefixSum;

import java.util.stream.*;

public class FindPivot {
    public static void main(String[] args) {
        FindPivot new1 = new FindPivot();
        int[] nums = new int[]{1,7,3,6,5,6};
        System.out.println(new1.pivotIndex(nums));
    }

    public int pivotIndex(int[] nums) {
        /* long runtime
        int lsum = 0;
        int rsum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int j = i - 1;
            int k = i + 1;
            while(j >= 0) {
                lsum += nums[j];
                j--;
            }

            while (k < nums.length) {
                rsum += nums[k];
                k++;
            }

            if(rsum == lsum) {
                return i;
            }
            else {
                lsum = 0;
                rsum = 0;
            }
        }

        return -1;
        */
        // faster, would never think of this tho.
        int totalSum = IntStream.of(nums).sum();
        int leftSum = 0;
        for (int i = 0; i < nums.length; leftSum += nums[i++]) {
            if(leftSum * 2 == totalSum - nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
