import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        // create a new object to access merge method 
        // fixes this error: Cannot make a static reference to the non-static method
        RotateArray new1 = new RotateArray();

        // initializes array
        int[] nums1 = {-1,-100,3,99};
        int[] nums2 = {1,2,3,4,5,6,7};
        int[] nums3 = {1,2,3};

        // calls removeElement function
        new1.rotate(nums2, 3);

        // prints results
        //System.out.println(actual);
        
        
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i]+ ", ");
        }
    }

    public void rotate(int[] nums, int k) {
        // works but is slow, check leetcode for faster solution
        if (k == 0) {
            return;
        }

        Queue<Integer> temp = new LinkedList<Integer>();
        for (int i = nums.length-1; i >= 0; i--){
            temp.add(nums[i]);
        }

        int count = 0;
        while (count < k) {
            int t = temp.remove();
            temp.add(t);
            System.out.println(temp);
            count++;
        }

        for (int i = nums.length-1; i >= 0; i--) {
            nums[i] = temp.remove();
        }
    }
}
