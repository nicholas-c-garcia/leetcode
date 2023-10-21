package Leetcode75.TwoPointers;

public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes new1 = new MoveZeroes();
        int[] nums = new int[]{0,1,0,3,12};
        new1.moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public void moveZeroes(int[] nums) {
        int check = 0;
        int move = 0;
        while(check < nums.length) {
            if(nums[check] != 0) {
                int temp = nums[move];
                nums[move] = nums[check];
                nums[check] = temp;
                move++;
                check++;
            }
            else {
                check++;
            }
        }
    }

}
