import java.util.Arrays;

public class MergeSortedArray{
    public static void main(String[] args) {
        // create a new object to access merge method 
        // fixes this error: Cannot make a static reference to the non-static method
        MergeSortedArray new1 = new MergeSortedArray();

        // initializes arrays
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        // calls merge function
        new1.merge(nums1, 3, nums2, 3);

        // prints sorted array
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }


    // actual algorithm to merge array then sort using java Arrays method
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }
}
