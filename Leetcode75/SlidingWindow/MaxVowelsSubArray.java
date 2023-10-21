package Leetcode75.SlidingWindow;

public class MaxVowelsSubArray {
    public static void main(String[] args) {
        MaxVowelsSubArray new1 = new MaxVowelsSubArray();
        String s = "abciiidef";
        int k = 3;
        System.out.println(new1.maxVowels(s,k));
    }

    public int maxVowels(String s, int k) {
        int count = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < k; i++) {
            if (isVowel(chars[i])){
                count++;
            }
        }
        
        int max = count;

        for(int i = k; i < chars.length; i++) {
            if (isVowel(chars[i])){
                count++;
            }
            if (isVowel(chars[i-k])) {
                count--;
            }
            max = Math.max(count, max);
        }

        return max;
    }

    private boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' ||c == 'u') {
            return true;
        }

        return false;
    }
}
