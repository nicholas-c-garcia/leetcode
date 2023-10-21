package Leetcode75.SlidingWindow;

public class MaxOnes {
    public static void main(String[] args) {
        MaxOnes new1 = new MaxOnes();
        int[] nums = new int[]{1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(new1.longestOnes(nums, k));
    }

    public int longestOnes(int[] nums, int k) {
        int start = 0, end = 0, zeroes = 0;
        
        while (end < nums.length) {
            if(nums[end] == 0) {
                zeroes++;
            }

            end++;

            if(zeroes > k) {
                if(nums[start] == 0) {
                    zeroes--;
                }
                start++;
            }
        }
        return end-start;
    }
}
