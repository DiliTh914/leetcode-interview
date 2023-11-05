package org.example.linkedlists.q2;

public class Solution {

    /**
     * Q2:
     * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/603/">...</a>
     * Given the head of a linked list, remove the nth node from the end of the list and return its head.
     *
     * Input: head = [1,2,3,4,5], n = 2
     * Output: [1,2,3,5]
     *
     * Input: head = [1], n = 1
     * Output: []
     *
     * Input: head = [1,2], n = 1
     * Output: [1]
     *
     * Constraints:
     *
     * The number of nodes in the list is sz.
     * 1 <= sz <= 30
     * 0 <= Node.val <= 100
     * 1 <= n <= sz
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head.next == null) {
            return null;
        }
        if(n == 1) {
            removeLastNode(head);
            return head;
        }


        if (isTailInN(head, n)) {
            head.val = head.next.val;
            head.next = head.next.next;

        } else {
            removeNthFromEnd(head.next, n);
        }

        return head;
    }

    private void removeLastNode(ListNode head) {
        if (head.next.next == null) {
            head.next = null;
        } else {
            removeLastNode(head.next);
        }
    }

    private boolean isTailInN(ListNode head, int n) {
        while (n>0) {
            head = head.next;
            n--;
        }
        return head == null;
    }

}
