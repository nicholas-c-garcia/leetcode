package Leetcode75.Stack;

import java.util.*;

public class DecodeString {
    public static void main(String[] args) {
        DecodeString new1 = new DecodeString();
        String s = "2[abc]3[cd]ef";
        System.out.println(new1.decodeString(s));
    }

    public String decodeString(String s) {
        // initialize variables
        String res = "";
        Stack<String> resSt = new Stack<String>();
        Stack<Integer> couSt = new Stack<Integer>();
        int ind = 0;

        // loop through string 
        while (ind < s.length()) {

            // determine the integer for repeated strings, push to couSt
            if(Character.isDigit(s.charAt(ind))) {
                int count = 0;
                while (Character.isDigit(s.charAt(ind))) {
                    count = 10 * count + (s.charAt(ind) - '0');
                    ind++;
                }
                couSt.push(count);
            }

            // if [, push to resSt, reset res
            else if (s.charAt(ind) == '[') {
                resSt.push(res);
                res = "";
                ind++;
            }

            // if ], get string to repeat, add to res
            else if (s.charAt(ind) == ']') {
                StringBuilder temp = new StringBuilder(resSt.pop());
                int repeatTimes = couSt.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(res);
                }

                res = temp.toString();
                ind++;
            }

            // push to res
            else {
                res += s.charAt(ind++);
            }
        }

        // return res
        return res;
    }
}
