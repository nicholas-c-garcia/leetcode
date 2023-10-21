package Leetcode75.HashMapSets;

import java.util.*;

public class UniqueOccurences {
    public static void main(String[] args) {
        UniqueOccurences new1 = new UniqueOccurences();
        int[] nums = new int[]{5,-2,-2,1,5,-2};
        System.out.println(new1.uniqueOccurrences(nums));
    }

    public boolean uniqueOccurrences(int[] arr) {
        // initialize hashmap
        HashMap<Integer,Integer> map = new HashMap<>();

        // populate hashmap
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        Set<Integer> occ = new HashSet<>();

        // populate set
        for (int num: map.values()) {
            occ.add(num);
        }

        // return value
        if(occ.size() == map.values().size()) {
            return true;
        }
        else {
            return false;
        }
    }
}
