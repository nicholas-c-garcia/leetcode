package Leetcode75.Stack;

import java.util.*;

public class RemoveStars {
    public static void main(String[] args) {
        RemoveStars new1 = new RemoveStars();
        String word1 = "leet**cod*e";
        System.out.println(new1.removeStars(word1));
    }

    public String removeStars(String s) {
        // initialize variables
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();

        // remove * and char to left
        for(char c: chars) {
            if(c == '*'){
                stack.pop();
            }
            else {
                stack.add(c);
            }
        }
        
        // string representation of stack
        String ss = "";
        
        for (char c: stack) {
            ss+=c;
        }

        // return string
        return ss;
    }
}
