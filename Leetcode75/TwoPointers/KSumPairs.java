package Leetcode75.TwoPointers;

import java.util.Arrays;

public class KSumPairs {
    public static void main(String[] args) {
        KSumPairs new1 = new KSumPairs();
        int[] nums = new int[]{3,1,3,4,3};
        int k = 6;
        System.out.println(new1.maxOperations(nums, k));
    }
 
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if(nums[left] + nums[right] == k) {
                count++;
                left++;
                right--;
            }
            else if(nums[left] + nums[right] < k) {
                left++;
            }
            else {
                right--;
            }
        }
        return count;
    }
}
