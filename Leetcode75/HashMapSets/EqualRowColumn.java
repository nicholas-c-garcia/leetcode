package Leetcode75.HashMapSets;

import java.util.*;

public class EqualRowColumn {
    public static void main(String[] args) {
        EqualRowColumn new1 = new EqualRowColumn();
        int[][] grid = new int[][] {
            {3,3,3,6,18,3,3,3,3,3},{3,3,3,3,1,3,3,3,3,3},{3,3,3,3,1,3,3,3,3,3},{3,3,3,3,1,3,3,3,3,3},{1,1,1,11,19,1,1,1,1,1},
            {3,3,3,18,19,3,3,3,3,3},{3,3,3,3,1,3,3,3,3,3},{3,3,3,3,1,3,3,3,3,3},{3,3,3,1,6,3,3,3,3,3},{3,3,3,3,1,3,3,3,3,3}
        };
        System.out.println(new1.equalPairs(grid));
    }

    public int equalPairs(int[][] grid) {
        // initialize variables
        Map<String,Integer> map=new HashMap<>();
        int n=grid.length;
        int m=grid[0].length;

        // populate hashmap
        for( int j=0;j<m;j++){
            String s="";
            for(int i=0;i<n;i++){
                s+=grid[i][j]+",";
            }
            map.put(s,map.getOrDefault(s,0)+1);
        }

        // find recurrences
        int cnt=0;
        for(int i=0;i<n;i++){
            String s="";
            for(int j=0;j<m;j++){
                s+=grid[i][j]+",";
            }
            if(map.containsKey(s)){
                cnt+=map.get(s);
            }
        }

        // return reccurence count
        return cnt;
    }
}
