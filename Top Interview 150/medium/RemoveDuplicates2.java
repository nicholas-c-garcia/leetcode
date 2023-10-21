public class RemoveDuplicates2 {
    public static void main(String[] args) {
        // create a new object to access merge method 
        // fixes this error: Cannot make a static reference to the non-static method
        RemoveDuplicates2 new1 = new RemoveDuplicates2();

        // initializes arrays
        int[] nums = {0,0,1,1,1,1,2,2,3,3};

        // calls removeElement function
        int actual = new1.removeDuplicates(nums);

        // prints results
        //System.out.println(actual);
        for (int i = 0; i < actual; i++) {
            System.out.println(nums[i]);
        }
    }

    public int removeDuplicates(int[] nums) {
        int count = 0;
        boolean seenTwice = false;
        for (int i = 1; i < nums.length; i++) {

            boolean currTwice = nums[count] == nums[i];

            if(!seenTwice || !currTwice) {
                nums[++count] = nums[i];
            }

            seenTwice = currTwice;
        }
        return count + 1;
    }
}
