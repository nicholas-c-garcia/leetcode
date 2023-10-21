package Leetcode75.ArrayString;

public class ReversedWords {
    public static void main(String[] args) {
        ReversedWords new1 = new ReversedWords();
        String s = "the sky is blue";
        System.out.println("s: "+new1.reverseWords(s));
    }

    public String reverseWords(String s) {
        /* Leetcode Solution 1ms Runtime */
        char[] a = s.toCharArray();
        char[] res = new char[a.length];
        int i = a.length - 1, j, k, r = 0;

        while (i >= 0 && a[i] == ' ') i--;

        while (i >= 0) {
            j = i; // end word

            while (i >= 0 && a[i] != ' ') i--; // find end
            if (r > 0) res[r++] = ' ';  // add ' ' to res[]

            // reverse word and copy
            for (k = i + 1; k <= j; k++) res[r++] = a[k];  

            // clear excess space
            while (i >= 0 && a[i] == ' ') i--; 
        }
        return new String(res, 0, r);

        /* My Solution Slow Runtime
        String[] words = s.split("\\W+");
        String reverse = "";

        for(int i = words.length -1; i >= 0; i--) {
            reverse = reverse + words[i] + " ";
        }

        return reverse.trim();
        */
    }
}
