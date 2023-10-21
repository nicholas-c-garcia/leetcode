package Leetcode75.SlidingWindow;

public class MaxAverageSubArray {
    public static void main(String[] args) {
        MaxAverageSubArray new1 = new MaxAverageSubArray();
        int[] nums = new int[]{1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(new1.findMaxAverage(nums, k));
    }

    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for(int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double)maxSum / k;
    }
}
