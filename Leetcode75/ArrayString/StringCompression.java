package Leetcode75.ArrayString;

public class StringCompression {
    public static void main(String[] args) {
        StringCompression new1 = new StringCompression();
        char[] chars = new char[]{'a','a','b','b','c','c','c'};
        System.out.println(new1.compress(chars));
    }

    public int compress(char[] chars) {
        int newIndex = 0;
        int currentCount = 1, size = chars.length;

        for (int i = 1; i < size; i++) {
            if (chars[i] == chars[i-1]) {
                currentCount++;
            }
            else {
                if (currentCount > 1) {
                    String currCountString = Integer.toString(currentCount);
                    chars[newIndex] = chars[i-1];
                    newIndex++;

                    for(int j = 0; j < currCountString.length(); j++, newIndex++) {
                        chars[newIndex] = currCountString.charAt(j);
                    }
                }
                else {
                    chars[newIndex] = chars[i-1];
                    newIndex++;
                }
                currentCount = 1;
            }
        }

        if (currentCount > 1) {
            String currCountString = Integer.toString(currentCount);
            chars[newIndex] = chars[size-1];
            newIndex++;

            for(int j = 0; j < currCountString.length(); j++, newIndex++) {
                chars[newIndex] = currCountString.charAt(j);
            }
        }
        else {
            chars[newIndex] = chars[size - 1];
            newIndex++;
        }
        
        return newIndex;
    }
}
