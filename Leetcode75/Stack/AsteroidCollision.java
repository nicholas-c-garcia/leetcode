package Leetcode75.Stack;

import java.util.*;

public class AsteroidCollision {
    public static void main(String[] args) {
        AsteroidCollision new1 = new AsteroidCollision();
        int[] nums = new int[]{10,2,-5};
        int[] r = new1.asteroidCollision(nums);
        for (int i : r) {
            System.out.println(i);
        }
        
    }

    public int[] asteroidCollision(int[] asteroids) {
        // initialize stack
        Stack<Integer> stack = new Stack<Integer>();

        // populate stack
        for (int i : asteroids){

            // push to stack if empty or if asteroids will not collide
            if (stack.isEmpty() || sameSign(i, stack.peek()) || (stack.peek() < 0 && i > 0)) {
                stack.push(i);
            }
            else {

                // pop from stack if asteroids will collide
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(i)) {
                    stack.pop();
                }

                // push to stack if empty or if asteroids will not collide
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(i);
                }

                // pop from stack if two opposite signed asteroids are equal in magnitude
                else if (stack.peek() == Math.abs(i)) {
                    stack.pop();
                }
            }
        }

        // populate return array
        int[] r = new int[stack.size()];
        int size = stack.size();
        while (!stack.isEmpty()) {
            r[--size] = stack.pop();
        }

        // return array
        return r;
    }

    // method to check if two numbers are the same sign
    private boolean sameSign(int x, int y) {
        if(x < 0 && y < 0 || x > 0 && y > 0) {
            return true;
        }
        return false;
    }
}
