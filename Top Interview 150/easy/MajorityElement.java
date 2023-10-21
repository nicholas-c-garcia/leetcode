import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        // create a new object to access merge method 
        // fixes this error: Cannot make a static reference to the non-static method
        MajorityElement new1 = new MajorityElement ();

        // initialize array
        int[] nums = {2,2,1,1,1,2,2};

        // call and print function result
        int result = new1.majorityElement(nums);
        System.out.println(result);
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
