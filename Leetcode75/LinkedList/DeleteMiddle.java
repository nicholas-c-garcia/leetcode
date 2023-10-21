package Leetcode75.LinkedList;


public class DeleteMiddle {
    public ListNode deleteMiddle(ListNode head) {
        // Base Case
        if(head == null || head.next == null) {
            return null;
        }

        // pointers
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = head;

        // find middle node
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // delete node
        prev.next = slow.next;
        
        // return head of list
        return head;
    }
}
