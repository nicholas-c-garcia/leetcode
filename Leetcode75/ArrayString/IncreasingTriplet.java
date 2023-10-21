package Leetcode75.ArrayString;

public class IncreasingTriplet {
    public static void main(String[] args) {
        IncreasingTriplet new1 = new IncreasingTriplet();
        int[] nums = new int[]{2,1,5,0,4,6};
        boolean triplet = new1.increasingTriplet(nums);
        System.out.println(triplet);
    }

    public boolean increasingTriplet(int[] nums) {
        // solution if triplet must be consecutive
        /*
        for (int i = 1; i < nums.length -1; i++) {
            if(nums[i-1] < nums[i] && nums[i+1] > nums[i]) {
                return true;
            }
        }
        return false;
        */

        // actual solution
        int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= small) { small = n; } // update small if n is smaller than both
            else if (n <= big) { big = n; } // update big only if greater than small but smaller than big
            else return true; // return if you find a number bigger than both
        }
        return false;
    }
}
