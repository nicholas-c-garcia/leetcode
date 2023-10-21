package Leetcode75.ArrayString;

public class MergeStrings {
    public static void main(String[] args) {
        MergeStrings new1 = new MergeStrings();
        String word1 = "abcd";
        String word2 = "pq";
        System.out.println(new1.merge(word1, word2));
    }

    public String merge(String word1, String word2) {
        String merged = "";
        String shortest = "";
        String largest = "";

        if(word1.length() > word2.length()) {
            shortest = word2;
            largest = word1;
        }
        else {
            shortest = word1;
            largest = word2;
        }
        int i;
        for (i = 0; i < shortest.length(); i++) {
            merged += word1.charAt(i);
            merged += word2.charAt(i);
        }

        merged = merged + largest.substring(i);
        return merged;
    }
}
