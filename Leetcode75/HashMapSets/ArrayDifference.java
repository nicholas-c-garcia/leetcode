package Leetcode75.HashMapSets;

import java.util.*;

public class ArrayDifference {
    public static void main(String[] args) {
        ArrayDifference new1 = new ArrayDifference();
        int[] nums1 = new int[]{1,2,3};
        int[] nums2 = new int[]{2,4,6};
        System.out.println(new1.findDifference(nums1, nums2).toString());
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // initialize return list
        List<List<Integer>> diff = new ArrayList<>();
        diff.add(new ArrayList<>());
        diff.add(new ArrayList<>());
        
        // initialize sets
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        // populate sets
        for(int num: nums1) { setA.add(num); }
        for(int num: nums2) { setB.add(num); }

        // populate return list
        for(int num: setA) {
            if(!setB.contains(num)) {
                diff.get(0).add(num);
            }
        }

        for(int num: setB) {
            if(!setA.contains(num)) {
                diff.get(1).add(num);
            }
        }

        //return list
        return diff;
    }


}
