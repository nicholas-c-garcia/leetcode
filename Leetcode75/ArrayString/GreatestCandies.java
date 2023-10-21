package Leetcode75.ArrayString;

import java.util.List;
import java.util.ArrayList;

public class GreatestCandies {
    
    public static void main(String[] args) {
        GreatestCandies new1 = new GreatestCandies();
        int[] candies = new int[]{2,3,5,1,3};
        int extraCandies = 3;
        
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = findMax(candies);
        List<Boolean> list = new ArrayList<Boolean>(); 
        for(int i = 0; i < candies.length; i++) {
            if((candies[i] + extraCandies) < max) {
                list.add(false);
            }
            else {
                list.add(true);
            }
        }

        return list;
    }

    private int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
