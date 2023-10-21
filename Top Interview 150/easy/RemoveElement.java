public class RemoveElement {
        public static void main(String[] args) {
        // create a new object to access merge method 
        // fixes this error: Cannot make a static reference to the non-static method
        RemoveElement new1 = new RemoveElement();

        // initializes arrays
        int[] nums = {3,2,2,3};

        // calls removeElement function
        int actual = new1.removeElement(nums, 3);

        // prints results
        System.out.println(actual);
        for (int i = 0; i < actual; i++) {
            System.out.println(nums[i]);
        }
    }


    // removeElement algorithm
    public int removeElement(int [] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }
}
