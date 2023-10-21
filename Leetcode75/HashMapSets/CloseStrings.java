package Leetcode75.HashMapSets;

import java.util.*;

public class CloseStrings {
    public static void main(String[] args) {
        CloseStrings new1 = new CloseStrings();
        String word1 = "abc";
        String word2 = "bca";
        System.out.println(new1.closeStrings(word1, word2));
    }

    public boolean closeStrings(String word1, String word2) {
        // check if length of words are equal
        if(word1.length() != word2.length()) {
            return false;
        }

        // initialize hashmaps
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // populate hashmaps 
        for (int i = 0; i < word1.length(); i++) {
            map.put(word1.charAt(i), map.getOrDefault(word1.charAt(i), 0)+1);
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0)+1);
        }

        // check for unique chars between 
        for (int j = 0; j < word2.length(); j++) {
            if (!map.containsKey(word2.charAt(j))) {
                return false;
            }

            if (!map2.containsKey(word1.charAt(j))) {
                return false;
            }
        }

        // initialize arraylist
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();


        // populate arraylist
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            list1.add(entry.getValue());
        }

        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            list2.add(entry.getValue());
        }

        // sort arraylists
        Collections.sort(list1);
        Collections.sort(list2);

        // return result
        return list1.equals(list2);
    }
}

