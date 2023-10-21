package Leetcode75.ArrayString;

public class GCDStrings {
    public static void main(String[] args) {
        GCDStrings new1 = new GCDStrings();
        String word1 = "ABCABC";
        String word2 = "ABC";
        System.out.println(new1.gcdString(word1, word2));
    }

    public String gcdString(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
