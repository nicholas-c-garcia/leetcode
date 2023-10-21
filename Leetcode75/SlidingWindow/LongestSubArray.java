package Leetcode75.SlidingWindow;

public class LongestSubArray {
    public static void main(String[] args) {
        LongestSubArray new1 = new LongestSubArray();
        int[] nums = new int[]{0,1,1,1,0,1,1,0,1};
        System.out.println(new1.longestSubarray(nums));
    }

    public int longestSubarray(int[] nums) {
        int c1 = 0, c2 = 0, ans = 0;
        for (int i: nums) {
            if(i == 0) {
                ans = Math.max(ans, c1+c2);
                c2 = c1;
                c1 = 0;
            }
            else {
                c1++;
            }
        }

        if(c1+c2 == nums.length) {
            return nums.length -1;
        }

        return Math.max(ans, c1+c2);
    }
}
