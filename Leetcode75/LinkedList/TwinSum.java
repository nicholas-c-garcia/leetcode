package Leetcode75.LinkedList;

public class TwinSum {
    public int pairSum(ListNode head) {
        // initialize variables
        ListNode slow = head;
        ListNode fast = head;
        int maxVal = 0;

        // find middle of list
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse second half of list
        ListNode nextNode;
        ListNode prev = null;
        while (slow != null) {
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        // find max sum
        while(prev != null) {
            maxVal = Math.max(maxVal, head.val + prev.val);
            prev = prev.next;
            head = head.next;
        }

        // return maxVal
        return maxVal;
    }
}
