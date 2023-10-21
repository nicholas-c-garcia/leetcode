package Leetcode75.TwoPointers;

public class MostWater {
    public static void main(String[] args) {
        MostWater new1 = new MostWater();
        int[] nums = new int[]{1,8,6,2,5,4,5,3,7};
        System.out.println(new1.maxArea(nums));
    }

    public int maxArea(int[] height) {
        // TLE
        /* 
        int maxArea = 0;
        for(int i = 0; i < height.length; i++) {
            for(int j = i + 1; j < height.length; j++) {
                int area = (j-i) * Math.min(height[i], height[j]);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
        */
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int area = (right-left) * Math.min(height[right], height[left]);
            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }

        return maxArea;
    }
}
