package Leetcode75.ArrayString;

public class ReverseVowels {
    public static void main(String[] args) {
        ReverseVowels new1 = new ReverseVowels();
        String s = "hello";
        System.out.println("s: "+new1.reverseVowels(s));
    }

    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        String vowels = "aeiouAEIOU";

        while(start < end) {

            while (start < end && vowels.indexOf(chars[start]) == -1) {
                start++;
            }

            while (start < end && vowels.indexOf(chars[end]) == -1) {
                end--;
            }

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }

        String reversedVowels = new String(chars);
        return reversedVowels;
    }

}
