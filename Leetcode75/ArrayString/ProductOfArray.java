package Leetcode75.ArrayString;

import java.util.Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        ProductOfArray new1 = new ProductOfArray();
        int[] nums = new int[]{1,2,3,4};
        int[] answers = new1.productExceptSelf(nums);
        for (int i = 0; i < answers.length; i++) {
            System.out.println(answers[i]);
        }
    }

    public int[] productExceptSelf(int[] nums) {     
        /* Working Solution */
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;

        /* Time Limit Exceeded 
        int[] answers = new int[nums.length];
        Arrays.fill(answers, 1);
        int j = 0;
        while (j < nums.length){
            for (int i = 0; i < nums.length; i++){
                if(i != j){
                    answers[j] *= nums[i];
                }
            } 
            j++;
        }
        return answers;
        */

        /* Cannot Use Division 
        int[] answers = new int[nums.length];
        int prod = 1;
        for (int i: nums) {
            prod *= i;
        }

        for(int i =0; i < nums.length; i++) {
            answers[i] = prod / nums[i];
        }
        return answers;
        */
    }
}
