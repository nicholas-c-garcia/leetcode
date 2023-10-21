package Leetcode75.TwoPointers;

public class IsSubsequence {
    public static void main(String[] args) {
        IsSubsequence new1 = new IsSubsequence();
        String word1 = "abc";
        String word2 = "ahbgdc";
        System.out.println(new1.isSubsequence(word1, word2));
    }

    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) {
            return true;
        }

        int sPointer = 0;
        int matchCount = 0;
        for(int i = 0; i < t.length(); i++) {
            if(s.charAt(sPointer) == t.charAt(i)) {
                sPointer++;
                matchCount++;
                if(matchCount == s.length()) {
                    break;
                }
            }
        }

        if(matchCount == s.length()) {
            return true;
        }
        else {
            return false;
        }
    }
}
