package Leetcode75.Queue;

import java.util.*;

public class Dota2 {
        public static void main(String[] args) {
        Dota2 new1 = new Dota2();
        String word1 = "RDD";
        System.out.println(new1.predictPartyVictory(word1));
    }

    public String predictPartyVictory(String senate) {
        // initialize queue
        Queue<Character> q = new LinkedList<>();
        
        // populate queues
        for (char c: senate.toCharArray()) {
            q.offer(c);
        }

        // play moves
        char c;
        while(!q.isEmpty()) {
            c = q.poll();
            q.offer(c);

            if (c == 'R' && !q.remove('D')){
                return "Radiant";
            }
            if (c == 'D' && !q.remove('R')){
                return "Dire";
            }
        }
        return null;
    }
}
