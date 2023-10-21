package Leetcode75.Queue;

import java.util.*;

public class RecentCalls {
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        recentCounter.ping(1);     // requests = [1], range is [-2999,1], return 1
        recentCounter.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
        recentCounter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
        recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,3002], return 
    }
}

class RecentCounter {
    private Queue<Integer> counter;

    public RecentCounter() {
        this.counter = new LinkedList();
    }
    
    public int ping(int t) {
        counter.add(t);
        while(counter.peek() < t - 3000) {
            counter.poll();
        }

        return counter.size();
    }
}
